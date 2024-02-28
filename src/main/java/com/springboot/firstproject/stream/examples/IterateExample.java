package com.springboot.firstproject.stream.examples;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IterateExample {
    public static void main(String[] args) {
        Stream<Integer> evenNumStream = Stream.iterate(2, i -> i * 2);
        List<Integer> collect = evenNumStream
                .limit(5)
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}


