package com.springboot.firstproject.stream.examples;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoiningExample {
    public static void main(String[] args)
    {
        // Create a string list
        List<String> str = Arrays.asList("Hello", "to", "All");

        // Convert the string list into String
        // using Collectors.joining() method
        String chString
                = str.stream().collect(Collectors.joining(",","[","]"));

        // Print the concatenated String
        System.out.println(chString);
    }
}
