package com.repo.chetan.Function.Predicate;

import java.util.Objects;
import java.util.function.Predicate;

/**
 * Created by chetan on 23/6/18.
 */
/*
Predicates are boolean-valued functions of one argument.

The interface contains various default methods for composing
 predicates to complex logical terms (and, or, negate)
 */
public class PredicateMain {
    /*
    Methods in predicate(FUNCTIONAL INTERFASE)

    test(returns boolean) //oNLY ABSTRACT METHOD IN pREDICATE FUNCTIONAL INTERFACE
    or (returns Predicate)
    isEqual(returns Predicate)
    negate(returns Predicate)
    and(returns Predicate)

     */

    public static void main(String[] args) {
// boolean-valued functions of one argument.contains various
// default methods for composing predicates to complex logical terms (and, or, negate)
        Predicate<String> predicate = (s) -> s.length() > 0;//BODY OF TEST METHOD
//The generic String is what it will take on RHS
        predicate.test("foo");              // true
        predicate.negate().test("foo");     // false

//Only test returns boolean else return another predicate so test will be the terminal

        Predicate<Boolean> nonNull = Objects::nonNull;
//System.out.println(nonNull.test(true));
//System.out.println(nonNull.negate().test(false));
        Predicate<Boolean> isNull = Objects::isNull;
//System.out.println(isNull.test(true));
//System.out.println(isNull.negate().test(false));
        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> isNotEmpty = isEmpty.negate();


    }
}
