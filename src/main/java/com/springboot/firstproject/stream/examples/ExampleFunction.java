package com.springboot.firstproject.stream.examples;

@FunctionalInterface
interface A{
    public void cook();
}
@FunctionalInterface
interface C{
    public Integer sum(int a, int b);
}

public class ExampleFunction {
    public static void main(String[] args) {
        C c= (p,q)->{
            return p+q;
        };
        int result = c.sum(10,20);
        System.out.println(result);
    }
}
