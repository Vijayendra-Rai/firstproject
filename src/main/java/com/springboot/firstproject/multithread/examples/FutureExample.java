package com.springboot.firstproject.multithread.examples;

import java.util.Random;
import java.util.concurrent.*;

public class FutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        TaskFuture taskFuture = new TaskFuture();
        Future<Integer> future = executor.submit(taskFuture);
        System.out.println("Number is:"+future.get());
    }
}

class TaskFuture implements Callable {
    @Override
    public Integer call() throws Exception {
        return new Random().nextInt();
    }
}
