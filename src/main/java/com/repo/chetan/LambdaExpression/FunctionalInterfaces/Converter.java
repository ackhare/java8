package com.repo.chetan.LambdaExpression.FunctionalInterfaces;

/**
 * Created by chetan on 21/6/18.
 */
/*
A functional interface must contain *exactly one abstract method* declaration.
Each lambda expression of that *type will be matched to this abstract method*
 */

@FunctionalInterface
/*
The compiler is aware of this (nonCompulsary)annotation and throws a compiler error
as soon as you try to add a second abstract method declaration to the interface.
 */
public interface Converter<F, T> {
    T convert(F from);

}
