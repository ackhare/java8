package com.repo.chetan.Optional;

import java.util.Optional;

/**
 * Created by chetan on 24/6/18.
 */
public class OptionalWithFilterDemo {
    public static void main(String[] args) {
        String[] str = new String[10];
        str[5] = "JAVA OPTIONAL CLASS EXAMPLE";  // Setting value for 5th index
        // It returns an empty instance of Optional class
        Optional<String> empty = Optional.empty();
        System.out.println(empty);//O/p {Optional.empty}
        // It returns a non-empty Optional
        /*
        ptional.of --->Returns an {Optional} with the specified present non-null value.
         */
        Optional<String> value = Optional.of(str[5]);
        // Optional.of(str[5]); --->If value is present, it
        // returns an Optional otherwise returns an empty Optional

       //There are other functions like filter,map,flatMap,
        //Filter takes a predicate
        /*
        filter
        If a value is present, and the value matches the given predicate,
        return an {@code Optional} describing the value, otherwise return an
        empty {@code Optional}.
         */
        System.out.println("Filtered value: " + value.filter((s) -> s.equals("Abc")));//Filtered value: Optional.empty
        System.out.println("Filtered value: " + value.filter((s) -> s.equals("JAVA OPTIONAL CLASS EXAMPLE")));//Filtered value: Optional[JAVA OPTIONAL CLASS EXAMPLE]
        // It returns value of an Optional. if value is not present, it throws an NoSuchElementException
        System.out.println("Getting value: " + value.get());//Getting value: JAVA OPTIONAL CLASS EXAMPLE
        // It returns hashCode of the value
        System.out.println("Getting hashCode: " + value.hashCode());
        // It returns true if value is present, otherwise false
        System.out.println("Is value present: " + value.isPresent());//true
        // It returns non-empty Optional if value is present, otherwise returns an empty Optional
        System.out.println("Nullable Optional: " + Optional.ofNullable(str[5]));
        // It returns value if available, otherwise returns specified value,
        System.out.println("orElse: " + value.orElse("Value is not present"));//orElse: JAVA OPTIONAL CLASS EXAMPLE
        System.out.println("orElse: " + empty.orElse("Value is not present"));//orElse: Value is not present
        value.ifPresent(System.out::println);   // printing value by using method reference
        //JAVA OPTIONAL CLASS EXAMPLE
    }
}
