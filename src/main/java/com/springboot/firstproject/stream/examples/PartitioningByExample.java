package com.springboot.firstproject.stream.examples;


import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class PartitioningByExample {

    // Driver code
    public static void main(String[] args)
    {
        // creating an Integer stream
        Stream<Integer>
                s = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Using Collectors.counting() method
        // to count the number of elements in
        // the 2 partitions
        Map<Boolean, Long>
                map = s.collect(
                Collectors.partitioningBy(
                        num -> (num > 3), Collectors.counting()));

        // Displaying the result as a map
        // true if greater than 3, false otherwise
        System.out.println("Elements in stream "
                + "partitioned by "
                + "less than equal to 3: \n"
                + map);
    }
}
