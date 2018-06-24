package com.repo.chetan.Optional;

import java.util.Optional;

/**
 * Created by chetan on 24/6/18.
 */
public class OptionalDemo {
    public static void main(String[] args) {
        String[] str = new String[10];

        //Piece of code without Optional
//        String lowercaseString = str[5].toLowerCase();
//        System.out.print(lowercaseString);

        //Piece of above code with Optional
        Optional<String> checkNull = Optional.ofNullable(str[5]);
        /*
        ofNullable --->returns an Optional describing the specified value,
        if non-null, otherwise returns an empty Optional.

         */
        if (checkNull.isPresent()) {  // check for value is present or not
            String lowercaseStringWithOptional = str[5].toLowerCase();
            System.out.print(lowercaseStringWithOptional);
        } else
            System.out.println("string value is not present");


        //Demo for parametrized ifPresent which takes a consumer

        str[5] = "JAVA OPTIONAL CLASS EXAMPLE";  // Setting value for 5th index

        Optional<String> checkNull1 = Optional.ofNullable(str[5]);

        checkNull1.ifPresent(System.out::println);// printing value by using method reference

        /*
      ifPresent(Consumer) ---->  If a value is present, invoke the specified consumer
      with the value,otherwise do nothing.
         */
        System.out.println(checkNull1.get());    // printing value by using get method
        /*
        If a value is present in this Optional returns the value,
      otherwise throws NoSuchElementException.
         */
        System.out.println(str[5].toLowerCase());

    }


}
