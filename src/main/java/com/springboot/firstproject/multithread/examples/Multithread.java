package com.springboot.firstproject.multithread.examples;

// Java code for thread creation by extending
// the Thread class
class MultithreadingDemo extends Thread {
    private int threadNumber;

    MultithreadingDemo(int threadNumber){
        this.threadNumber = threadNumber;
    }

    public void run()
    {
        try {
            // Displaying the thread that is running
            for(int j=1;j<=5;j++){
                System.out.println("Number j:"+j+" is running from Thread "+ threadNumber);
                /*System.out.println("Thread is waiting ");
                Thread.sleep(5000);*/
            }
        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}

// Main Class
public class Multithread {
    public static void main(String[] args)
    {
        int n = 5; // Number of threads
        for (int i = 1; i <= n; i++) {
            MultithreadingDemo object
                    = new MultithreadingDemo(i);
            object.start();
        }
    }
}
