package com.repo.chetan.Function.Supplier;

import java.util.Date;
import java.util.function.Supplier;

/**
 * Created by chetan on 24/6/18.
 */
class Person {
    String firstName;
    String lastName;

    Person() {
        System.out.println("mmmmmmmmmmmmmmm");
    }

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}

public class SupplierDemo {
    public static Date getSystemDate() {
        return new Date();
    }

    public static void main(String[] args) {
//  Suppliers produce a result of a given generic type.
// Unlike Functions, Suppliers don't accept arguments.
//get do not accept any argument and has a return type of generics argument
        Supplier<Person> personSupplier = Person::new;
        personSupplier.get();   // new Person //will call default constructor


        //Supplier instance with lambda expression
        Supplier<String> helloStrSupplier = () -> new String("Hello");
        String helloStr = helloStrSupplier.get();
        System.out.println("String in helloStr is->" + helloStr + "<-");

        //Supplier instance using method reference to default constructor
        Supplier<String> emptyStrSupplier = String::new;
        String emptyStr = emptyStrSupplier.get();
        System.out.println("String in emptyStr is->" + emptyStr + "<-");

        //Supplier instance using method reference to a static method
        Supplier<Date> dateSupplier = SupplierDemo::getSystemDate;
        Date systemDate = dateSupplier.get();
        System.out.println("systemDate->" + systemDate);

    }
}
