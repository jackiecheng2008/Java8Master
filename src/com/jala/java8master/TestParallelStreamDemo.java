package com.jala.java8master;

import java.util.ArrayList;
import java.util.List;

import com.jala.java8master.pojo.Employee;

public class TestParallelStreamDemo {

	public static void main(String[] args) {

		long t1, t2;
		List<Employee> eList = new ArrayList<Employee>();
		for(int i=0; i<100; i++) {
			eList.add(new Employee("A"+i, 20000+i));
			eList.add(new Employee("B"+i, 3000+i));
			eList.add(new Employee("C"+i, 15002+i));
			eList.add(new Employee("D"+i, 7856+i)); 
			eList.add(new Employee("E"+i, 200+i)); 
			eList.add(new Employee("F"+i, 50000+i));
		}

		/***** Here We Are Creating A 'Sequential Stream' & Displaying The Result *****/
		t1 = System.currentTimeMillis();   
		System.out.println("Sequential Stream Count?= " + eList.stream().filter(e -> e.getSalary() > 1000).count());

		t2 = System.currentTimeMillis();
		System.out.println("Sequential Stream Time Taken?= " + (t2-t1) + "\n");

		/***** Here We Are Creating A 'Parallel Stream' & Displaying The Result *****/
		t1 = System.currentTimeMillis();		
		System.out.println("Parallel Stream Count?= " + eList.parallelStream().filter(e -> e.getSalary() > 1000).count());

		t2 = System.currentTimeMillis();
		System.out.println("Parallel Stream Time Taken?= " + (t2-t1));
	}
}