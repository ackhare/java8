package com.repo.chetan.Function.Predicate;

import java.util.function.Predicate;

/**
 * Created by chetan on 24/6/18.
 */
public class PredicateDemoForCustomMethod {
    static Boolean checkAge(int age) {
        if (age > 17)
            return true;
        else return false;
    }

    public static void main(String[] args) {
        // Using Predicate interface
        Predicate<Integer> predicate = PredicateDemoForCustomMethod::checkAge;//body of test method
        // Calling Predicate method
        boolean result = predicate.test(25);
        System.out.println(result);
    }
}
