package com.repo.chetan.LambdaExpression.LamdaScopes;

/**
 * Created by chetan on 21/6/18.
 * http://winterbe.com/posts/2014/03/16/java-8-tutorial/
 */
//Now interface can have both abstract method and default method with body
interface Formula {
    double calculate(int a);
    /*
    Java 8 enables us to add *non-abstract* method implementations
     to interfaces by utilizing the default keyword.
     */
    default double sqrt(int a) {
        return Math.sqrt(a);
    }
}
