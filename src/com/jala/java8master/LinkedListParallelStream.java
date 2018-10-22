package com.jala.java8master;

import java.util.LinkedList;
import java.util.stream.LongStream;

public class LinkedListParallelStream {
    public static void main(String[] args) {
        LinkedList<Long> numbers = LongStream.range(0, 10_000_000L).boxed()
                .collect(LinkedList::new, LinkedList::add, LinkedList::addAll);

		/***** Here We Are Creating A 'Sequential Stream' & Displaying The Result *****/
		long t1, t2;
		t1 = System.currentTimeMillis();   
		long sum1 = numbers.stream().mapToLong(i -> i).sum();
        System.out.println("Calculated sum is: " + sum1);

		t2 = System.currentTimeMillis();
		System.out.println("Sequential Stream Time Taken?= " + (t2-t1) + "\n");

        long start = System.nanoTime();
        long sum = numbers.parallelStream().mapToLong(i -> i).sum();
        long end = System.nanoTime();
        System.out.println("Calculated sum is: " + sum);
        System.out.println("duration using parallel stream is: " + ((end - start) / 1_000_000));
    }
}