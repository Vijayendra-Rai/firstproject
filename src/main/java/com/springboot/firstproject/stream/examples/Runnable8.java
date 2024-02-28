package com.springboot.firstproject.stream.examples;

class Runnable8 {
    public static void main(String args[])
    {
        // lambda expression to create the object
        new Thread(() -> {
            System.out.println("New thread created");
        }).start();
    }
}
