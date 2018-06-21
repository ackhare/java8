package com.repo.chetan.LambdaExpression;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by chetan on 21/6/18.
 * http://winterbe.com/posts/2014/03/16/java-8-tutorial/
 */
public class ConvertingComparatorAsLambda {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
// Step 1

//        Collections.sort(names, new Comparator<String>() {
//            @Override
//            public int compare(String a, String b) {
//                return b.compareTo(a);
//            }
//        });

// Step 2 above toLambda
        Collections.sort(names, (String a, String b) -> {
            return b.compareTo(a);
        });


    }
}
