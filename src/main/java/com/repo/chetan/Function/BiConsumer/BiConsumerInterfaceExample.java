package com.repo.chetan.Function.BiConsumer;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;

/**
 * Created by chetan on 24/6/18.
 */
public class BiConsumerInterfaceExample {
    static void ShowDetails(String name, Integer age) {
        System.out.println(name + " " + age);
    }

    static void ShowDetails(Map<Integer, String> map, String mapName) {
        System.out.println("----------" + mapName + " records-----------");
        map.forEach((key, val) -> System.out.println(key + " " + val));
    }

    public static void main(String[] args) {
        // Referring method
        BiConsumer<String, Integer> biCon = BiConsumerInterfaceExample::ShowDetails;
        biCon.accept("Rama", 20);
        biCon.accept("Shyam", 25);
        // Using lambda expression
        BiConsumer<String, Integer> biCon2 = (name, age) -> System.out.println(name + " " + age);
        biCon2.accept("Peter", 28);

        /*
        Rama 20
Shyam 25
Peter 28
         */

        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(100, "Mohan");
        map.put(110, "Sujeet");
        map.put(115, "Tom");
        map.put(120, "Danish");
        // Referring method
        BiConsumer<Map<Integer, String>, String> biCon1 = BiConsumerInterfaceExample::ShowDetails;
        biCon1.accept(map, "Student");
        /*
        ----------Student records-----------
115 Tom
100 Mohan
120 Danish
110 Sujeet
         */
    }
}
