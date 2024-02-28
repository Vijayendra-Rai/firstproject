package com.springboot.firstproject.stream.examples;

import java.util.Comparator;
import java.util.function.Predicate;
import java.util.stream.Stream;


class FilterExample {

    // Main driver method
    public static void main(String[] args)
    {

        // Creating a stream of strings
        Stream<String> stream = Stream.of(
                "Helos", "for", "Quiz", "happiness");

        Predicate<String> filterStr = str-> str.endsWith("s");

        // Getting a stream consisting of the
        // elements ending with 's'
        // using Stream filter(Predicate predicate)
        /*stream.filter(str -> str.endsWith("s"))
                .forEach(System.out::println);*/

        stream.filter(filterStr)
                .forEach(System.out::println);

        /*Stream<Integer> stream1 = Stream.of(
                2,1,3,5,4);
        stream1.sorted().forEach(System.out::println);

        Integer maxNumber = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .max(Comparator.comparing(Integer::valueOf))
                .get();

        Integer minNumber = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .min(Comparator.comparing(Integer::valueOf))
                .get();*/

    }
}
