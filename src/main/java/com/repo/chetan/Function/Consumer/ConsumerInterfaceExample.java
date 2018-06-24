package com.repo.chetan.Function.Consumer;

/**
 * Created by chetan on 24/6/18.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
/*
Consumers represents operations to be performed on a single input argument.
 It contains an abstract accept() and a default andThen() method.
 It can be used as the assignment target for a lambda expression or method reference.
The Consumer Interface accepts a single argument and does not return any result.
 */
public class ConsumerInterfaceExample {
    static void printMessage(String name){
        System.out.println("Hello "+name);
    }
    static void printValue(int val){
        System.out.println(val);
    }
    static void addList(List<Integer> list){
        // Return sum of list values
        int result = list.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum of list values: "+result);
    }
    public static void main(String[] args) {
        // Referring method to String type Consumer interface
        Consumer<String> consumer1 = ConsumerInterfaceExample::printMessage;
        consumer1.accept("John");   // Calling Consumer method
        // Referring method to Integer type Consumer interface
        Consumer<Integer> consumer2 = ConsumerInterfaceExample::printValue;
        consumer2.accept(12);   // Calling Consumer method

        // Creating a list and adding values
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        // Referring method to String type Consumer interface
        Consumer<List<Integer>> consumer = ConsumerInterfaceExample::addList;
        consumer.accept(list);  // Calling Consumer method

        //Using andThen

        Consumer<String> c = (x) -> System.out.println(x.toLowerCase());
        //Here andThen will eventually call c.accept("Java2s.com")
        c.andThen(c).accept("Java2s.com");

/*
Hello John
12
Sum of list values: 100
java2s.com
java2s.com
 */
    }
}
