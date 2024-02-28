package com.springboot.firstproject.multithread.examples;

public class Simpleprogram {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++) {
            TaskClass task = new TaskClass(i);
            task.print();
        }
    }
}
class TaskClass {
    private int number;

    public TaskClass(int number) {
        this.number = number;
    }

    public void print() {
        for(int j = 1; j<=5;j++){
            System.out.println("Number " +j + ", object "+number);
        }
    }
}
