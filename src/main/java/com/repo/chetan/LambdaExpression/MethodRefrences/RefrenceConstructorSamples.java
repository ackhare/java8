package com.repo.chetan.LambdaExpression.MethodRefrences;

/**
 * Created by chetan on 23/6/18.
 */
/*
You can refer a constructor by using the new keyword.
Here, we are referring constructor with the help of functional interface.
 */
interface Messageable {
    Message getMessage(String msg);
}

class Message {
    Message(String msg) {
        System.out.print(msg);
    }
}

public class RefrenceConstructorSamples {
    public static void main(String[] args) {
        //Below RHS is not applicable if Message is not a functionalinterface
        //Below isa code
        Messageable hello = Message::new;
        //so here Message::new is not equal to (new Message())
        //because there is no default constructor
        hello.getMessage("Hello");
    }
}
