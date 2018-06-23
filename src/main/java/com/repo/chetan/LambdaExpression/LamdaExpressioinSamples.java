package com.repo.chetan.LambdaExpression;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chetan on 23/6/18.
 */
public class LamdaExpressioinSamples {
    public static void main(String[] args) {
        //Lamda expression will always return the functionalinterfaces
        //A lamda expression without argument
        Sayable s = () -> {
            return "I have nothing to say.";
        };
        System.out.println(s.say());

        // Multiple parameters in lambda expression
        Addable ad1 = (a, b) -> (a + b);
        System.out.println(ad1.add(10, 20));

        // Multiple parameters with data type in lambda expression
        Addable ad2 = (int a, int b) -> (a + b);
        System.out.println(ad2.add(100, 200));

//Java Lambda Expression Example: Foreach Loop
//takes a lamda expression which isactually a Consumer
        List<String> list = new ArrayList<String>();
        list.add("ankit");
        list.add("mayank");
        list.add("irfan");
        list.add("jai");

        list.forEach(
                (n) -> System.out.println(n)
        );


    }
}
