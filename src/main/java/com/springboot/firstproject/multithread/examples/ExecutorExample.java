package com.springboot.firstproject.multithread.examples;

import java.util.concurrent.*;

public class ExecutorExample {
    public static void main(String[] args) {
        ExecutorService executor= Executors.newFixedThreadPool(10);
        //ExecutorService executor= Executors.newSingleThreadExecutor();
        //ExecutorService executor= Executors.newCachedThreadPool();
        //ScheduledExecutorService executor= Executors.newScheduledThreadPool(10);
        //task to run after 10 sec delay
        //executor.schedule(new Task(),10, TimeUnit.SECONDS);
        //task to run repeatedly after 10 sec
        //executor.scheduleAtFixedRate(new Task(),5, 10, TimeUnit.SECONDS);
        //task to run repeatedly after 10 sec after previous tasks complete
        //executor.scheduleWithFixedDelay(new Task(),15, 10, TimeUnit.SECONDS);
        for(int i=0;i<100;i++) {
            executor.execute(new Task());
        }
    }
}
class Task implements Runnable{
    public void run(){
        System.out.println("Task getting executed "+Thread.currentThread().getName());
    }
}
