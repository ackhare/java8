package com.repo.chetan.defaultMethods;

/**
 * Created by chetan on 21/6/18.
 * http://winterbe.com/posts/2014/03/16/java-8-tutorial/
 */
public class DefaultMethodMain {
    public static void main(String[] args) {
        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a * 100);
            }
        };

        formula.calculate(100);     // 100.0
        formula.sqrt(16);           // 4.0
    }
}
