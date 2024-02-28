package com.springboot.firstproject.stream.examples;

import java.util.function.Predicate;

public class ExamplePredicate {
    public static void main(String[] args) {
        Predicate<Integer> greaterThanTen = (i) -> i > 10;
        boolean result = greaterThanTen.test(15);
        System.out.println("result: "+result);
    }
}
