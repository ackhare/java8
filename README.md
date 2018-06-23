# java8
My Java 8 samples including good repos with notes
import java.util.*;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.Consumer;
class Person {
    String firstName;
    String lastName;

    Person() {}

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
public class HelloWorld{

     public static void main(String []args){

//Suppliers produce a result of a given generic type. Unlike Functions//Suppliers don't accept arguments.

Supplier<Person> personSupplier = Person::new;
//System.out.println(personSupplier.get());   // new Person
Comparator<Person> comparator = (p1, p2) -> p1.firstName.compareTo(p2.firstName);

Person p1 = new Person("John", "Doe");
Person p2 = new Person("Alice", "Wonderland");
//Comparator has added new default methods
comparator.compare(p1, p2);             // > 0
comparator.reversed().compare(p1, p2);  // < 0
//Functions accept one argument and produce a result. Default methods can be //used to chain multiple functions together (compose, andThen).
Function<String, Integer> toInteger = Integer::valueOf;
Function<String, String> backToString = toInteger.andThen(String::valueOf);
backToString.apply("123");     // "123"



//Consumers represents operations to be performed on a single input argument.

Consumer<Person> greeter = (p) -> System.out.println("Hello, " + p.firstName);
greeter.accept(new Person("Luke", "Skywalker"));


/*
A java.util.Stream represents a sequence of elements on which one or more operations can be performed. Stream operations are either intermediate or termina
*/
List<String> stringCollection = new ArrayList<>();
stringCollection.add("ddd2");
stringCollection.add("aaa2");
stringCollection.add("bbb1");
stringCollection.add("aaa1");
stringCollection.add("bbb3");
stringCollection.add("ccc");
stringCollection.add("bbb2");
stringCollection.add("ddd1");

//Filter accepts a *predicate* to filter all elements of the stream. This operation is intermediate  

//ForEach accepts a *consumer* to be executed for each element in the filtered stream. ForEach is a terminal operation. 
stringCollection
    .stream()
    .filter((s) -> s.startsWith("a"))
    .forEach(System.out::println);

// "aaa2", "aaa1"

/*
Sorted is an intermediate operation which returns a sorted view of the streamThe elements are sorted in natural order unless you pass a custom Comparator.
*/
stringCollection
    .stream()
    .sorted()
    .filter((s) -> s.startsWith("a"))
    .forEach(System.out::println);

// "aaa1", "aaa2"

/*
map converts each element into another object via the given function and can also use map to transform each object into another type. The generic type of the resulting stream depends on the generic type of the function you pass to map.
*/
stringCollection
    .stream()
    .map(String::toUpperCase)
    .sorted((c, d) -> c.compareTo(d))
    .forEach(System.out::println);

// "DDD2", "DDD1", "CCC", "BBB3", "BBB2", "AAA2", "AAA1"


/*
Match ops check whether a certain predicate matches the stream. All of those operations are terminal and return a boolean result.
*/
boolean anyStartsWithA =
    stringCollection
        .stream()
        .anyMatch((s) -> s.startsWith("a"));

System.out.println(anyStartsWithA);      // true

//Similarly are noneMatch,allMatch

//Reduce
//terminal operation performs a reduction on the elements of the stream with//the given function. The result is an Optional holding the reduced value.
Optional<String> reduced =
    stringCollection
        .stream()
        .sorted()
        .reduce((s1, s2) -> s1 + "#" + s2);

reduced.ifPresent(System.out::println);
// "aaa1#aaa2#bbb1#bbb2#bbb3#ccc#ddd1#ddd2"


     }
}