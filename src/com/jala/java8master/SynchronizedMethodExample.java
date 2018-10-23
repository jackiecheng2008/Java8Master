package com.jala.java8master;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by JC on 10/22/18.
 */
class SynchronizedCounter {
    private int count = 0;

    // Synchronized Method
    public synchronized void increment() {
    	System.out.println(Thread.currentThread().getName());
        count = count + 1;
    }

    public int getCount() {
        return count;
    }
}

public class SynchronizedMethodExample {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        SynchronizedCounter synchronizedCounter = new SynchronizedCounter();

        for(int i = 0; i < 1000; i++) {
            executorService.submit(() -> synchronizedCounter.increment());
            System.out.println("Current count is " + synchronizedCounter.getCount());
        }

        executorService.shutdown();
        executorService.awaitTermination(60, TimeUnit.SECONDS);

        System.out.println("Final count is : " + synchronizedCounter.getCount());
    }
}