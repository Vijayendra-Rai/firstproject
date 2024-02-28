package com.springboot.firstproject.stream.examples;


import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class ToSetExample {

    // Driver code
    public static void main(String[] args)
    {
        // creating a Stream of strings
        Stream<String> s = Stream.of("learning",
                "is",
                "fun",
                "learning");

        // using Collectors toSet() function
        Set<String> mySet = s.collect(Collectors.toSet());

        // printing the elements
        System.out.println(mySet);
    }
}
