package com.repo.chetan.LambdaExpression.FunctionalInterfaces;

/**
 * Created by chetan on 21/6/18.
 */
public class CustomFunctioalInterfacesMain {
    public static void main(String[] args) {
        Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
        //With method refrences a lamda expression can be simplified to
        Converter<String, Integer> converterWithMethodRefrence = Integer::valueOf;

        Integer converted = converter.convert("123");
        converterWithMethodRefrence.convert("22");
        System.out.println(converted);    // 123
    }
}
