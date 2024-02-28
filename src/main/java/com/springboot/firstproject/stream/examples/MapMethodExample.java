package com.springboot.firstproject.stream.examples;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class MapMethodExample {

    // Driver code
    public static void main(String[] args)
    {

        System.out.println("The stream after applying "
                + "the function is : ");

        // Creating a list of Integers
        List<String> list = Arrays.asList("accion", "labs", "a",
                "c", "c", "i", "o", "n");

        // Using Stream map(Function mapper) to
        // convert the Strings in stream to
        // UpperCase form
        List<String> answer = list.stream().map(s->s.toUpperCase()).
                collect(Collectors.toList());

        // displaying the new stream of UpperCase Strings
        System.out.println(answer);
    }
}
