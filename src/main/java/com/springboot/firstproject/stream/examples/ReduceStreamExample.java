package com.springboot.firstproject.stream.examples;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class ReduceStreamExample {

    // Driver code
    public static void main(String[] args)
    {
        // creating a list of Strings
        List<String> words = Arrays.asList("Accion", "Labs", "",
                "IT", "company");

        // The lambda expression passed to
        // reduce() method takes two Strings
        // and returns the longer String.
        // The result of the reduce() method is
        // an Optional because the list on which
        // reduce() is called may be empty.
        Optional<String> longestString = words.stream()
                .reduce((word1, word2)
                        -> word1.length() > word2.length()
                        ? word1 : word2);

        // Displaying the longest String
        longestString.ifPresent(System.out::println);
    }
}