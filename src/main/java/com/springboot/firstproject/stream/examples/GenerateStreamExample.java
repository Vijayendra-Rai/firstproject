package com.springboot.firstproject.stream.examples;


import java.util.Random;
import java.util.stream.Stream;

class GenerateStreamExample {
    public static void main(String[] args) {

        // using Stream.generate() method
        // to generate 5 random Integer values
        Stream.generate(new Random()::nextInt)
                .limit(5).forEach(System.out::println);
    }
}
