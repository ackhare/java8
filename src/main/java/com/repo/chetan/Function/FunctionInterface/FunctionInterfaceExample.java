package com.repo.chetan.Function.FunctionInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * Created by chetan on 24/6/18.
 */
public class FunctionInterfaceExample {
    static String show(String message) {
        return "Hello " + message;
    }

    static Integer addList(List<Integer> list) {
        return list.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static void main(String[] args) {
        // Function interface referring to a method
        Function<String, String> fun = FunctionInterfaceExample::show;
        // Calling Function interface method
        System.out.println(fun.apply("Peter"));

        // Creating a list and adding values
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        // Referring addList() method
        Function<List<Integer>, Integer> fun1 = FunctionInterfaceExample::addList;
        // Calling Function interface method
        int result = fun1.apply(list);
        System.out.println("Sum of list values: " + result);

        //from winterbe
        //demo of andThen

        Function<String, Integer> toInteger = Integer::valueOf;
        Function<String, String> backToString = toInteger.andThen(String::valueOf);

        backToString.apply("123");     // "123"



        //Diffrence between compose and andThen

        Function<Integer, Integer> times2 = e -> e * 2;

        Function<Integer, Integer> squared = e -> e * e;
        //Next, let's combine them, using compose and andThen.

        times2.compose(squared).apply(4);
// Returns 32

        times2.andThen(squared).apply(4);
// Returns 64
/*
As you can see, the difference between compose and andThen is the order
they execute the functions. While the compose function executes the caller
last and the parameter first, the andThen executes the caller first and the
parameter last.


 */

    }
}
