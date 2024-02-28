package com.springboot.firstproject.stream.examples;

import java.util.function.Consumer;

public class ExampleConsumer {
    public static void main(String[] args) {
        Consumer<Integer> display = a -> System.out.println(a);
        display.accept(101);
    }
}
