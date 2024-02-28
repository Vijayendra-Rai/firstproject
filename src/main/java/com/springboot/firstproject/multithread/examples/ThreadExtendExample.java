package com.springboot.firstproject.multithread.examples;
// Way 1
// Creating thread By Extending To Thread class

class ThreadExtendExample extends Thread {

    // Method 1
    // Run() method for our thread
    public void run()
    {

        // Print statement
        System.out.println(
                "Thread is running created by extending to parent Thread class " + Thread.currentThread().getName());
    }

    // Method 2
    // Main driver method
    public static void main(String[] args) throws InterruptedException {

        // Creating object of our thread class inside main()
        // method
        ThreadExtendExample threadExtendExample = new ThreadExtendExample();
        ThreadExtendExample threadExtendExample1 = new ThreadExtendExample();

        // Starting the thread
        threadExtendExample.setName("threadExtendExample");
        threadExtendExample.start();
        //threadExtendExample.setPriority(10);
        threadExtendExample.setPriority(Thread.NORM_PRIORITY);
        //Thread.sleep(5000);
       // threadExtendExample.join(); //Wait till threadExtendExample finishes

        threadExtendExample1.setName("threadExtendExample1");
        threadExtendExample1.start();




    }
}

