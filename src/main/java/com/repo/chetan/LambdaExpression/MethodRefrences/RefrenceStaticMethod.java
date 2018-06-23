package com.repo.chetan.LambdaExpression.MethodRefrences;

import java.util.function.BiFunction;

/**
 * Created by chetan on 23/6/18.
 */
public class RefrenceStaticMethod {
    public static void saySomething() {
        System.out.println("Hello, this is static method.");
    }

    public static void main(String[] args) {
        //You can refer to static method defined in the class.
        //ContainingClass::staticMethodName Referring static method
        //The RHS should return a functional interface and is the body of

        //  lambda expression for method !say! that we would have intended to write
        //So here (RefrenceStaticMethod::saySomething) is what will run on line
        // !sayable.say()!

        SayAble sayable = RefrenceStaticMethod::saySomething;
        // Calling interface method
        sayable.say();

        //Below is invoking a predefined static method via method refrences
        //Below code is only possible because Runnable which goes as a argument is a Functional interface
        //Runnable r=RefrenceStaticMethod::ThreadStatus

        //so this will be the body of run method of Runnable

        Thread t2 = new Thread(RefrenceStaticMethod::ThreadStatus);
        t2.start();


        //we can use predefined functional interface to refer static  methods.
        // In the following example,we are using BiFunction interface and
        // using it's apply() method.

        BiFunction<Integer, Integer, Integer> adder = Arithmetic::add;
        int result = adder.apply(10, 20);
        System.out.println(result);

        //You can also override static methods by referring methods.
        // In the following example, we have defined and overloaded three add methods.

        BiFunction<Integer, Integer, Integer> adder1 = Arithmetic::add;
        BiFunction<Integer, Float, Float> adder2 = Arithmetic::add;
        BiFunction<Float, Float, Float> adder3 = Arithmetic::add;
        int result1 = adder1.apply(10, 20);
        float result2 = adder2.apply(10, 20.0f);
        float result3 = adder3.apply(10.0f, 20.0f);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }

    public static void ThreadStatus() {
        System.out.println("Thread is running...");
    }
}
