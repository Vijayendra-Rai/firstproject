package com.springboot.firstproject.stream.examples;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingByExampe {
    public static void main(String[] args)
    {

        // Get the List
        List<String> g
                = Arrays.asList("vijay", "for", "vijay");

        // Collect the list as map
        // by groupingBy() method
        Map<String, Long> result
                = g.stream().collect(
                Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()));

        // Print the result
        System.out.println(result);
    }
}
