package com.repo.chetan.LambdaExpression.MethodRefrences;

import com.repo.chetan.LambdaExpression.FunctionalInterfaces.Converter;

/**
 * Created by chetan on 23/6/18.
 */
/*
 Method reference is used to refer method of functional interface.
 Each time when you are using lambda expression to just
 referring a method, you can replace your lambda expression with method reference.
 */
public class ConvertLambdaExpessionToMethodRefrence {

    public static void main(String[] args) {
        Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
        //With method refrences a lamda expression can be simplified to
        Converter<String, Integer> converterWithMethodRefrence = Integer::valueOf;

        Integer converted = converter.convert("123");
        converterWithMethodRefrence.convert("22");
        System.out.println(converted);    // 123
    }
}
