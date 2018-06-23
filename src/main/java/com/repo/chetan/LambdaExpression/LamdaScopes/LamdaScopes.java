package com.repo.chetan.LambdaExpression.LamdaScopes;

import com.repo.chetan.LambdaExpression.FunctionalInterfaces.Converter;

import static java.lang.StrictMath.sqrt;

/**
 * Created by chetan on 23/6/18.
 */
/*
we can access final variables from the local outer scope as
 well as instance fields and static variables.
 */
public class LamdaScopes {
    static int outerStaticNum;
    int outerNum;


    public static void main(String[] args) {
        int num = 1;//Local variable need to be implictly final if it is being  used in lambda
        // or compile timeerror
        //num = 4;  Compile Time error in lambda
        Converter<Integer, String> stringConverter =
                (from) -> String.valueOf(from + num);
//num=6;Compile Time error in lambda
        System.out.println(stringConverter.convert(2));// 3
        LamdaScopes lamdaScopes = new LamdaScopes();
        lamdaScopes.testScopes();
        Formula formula = (a) -> sqrt(a * 100);

    }

    //In constrast to local variables we have both read and write access to
    // instance fields and static variables from within lambda expressions.
    void testScopes() {
        Converter<Integer, String> stringConverter1 = (from) -> {
            outerNum = 23;
            return String.valueOf(from);
        };
        System.out.println(stringConverter1.convert(3));
        Converter<Integer, String> stringConverter2 = (from) -> {
            outerStaticNum = 72;
            return String.valueOf(from);
        };
        System.out.println(stringConverter2.convert(3));
    }


}
