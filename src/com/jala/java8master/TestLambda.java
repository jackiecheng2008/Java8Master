package com.jala.java8master;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.jala.java8master.pojo.Developer;

public class TestLambda {

	public static void main(String[] args) {

		List<Developer> listDevs = getDevelopers();

		System.out.println("Before Sort...");
		listDevs.forEach(System.out::println);
		
		//sort by name
		listDevs.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
		System.out.println("After Sorting by name ...");
		listDevs.forEach(System.out::println);
		
		//sort by salary
		listDevs.sort((o1, o2) -> o1.getSalary().compareTo(o2.getSalary()));
		System.out.println("After Sorting by salary ...");
		listDevs.forEach(System.out::println);
		
		//sort by salary descending
		listDevs.sort((o1, o2) -> o2.getSalary().compareTo(o1.getSalary()));
		System.out.println("After Sorting by salary descending...");
		listDevs.forEach(System.out::println);
		
		//sort by age
		listDevs.sort((o1, o2)->o1.getAge()-o2.getAge());
		System.out.println("After Sorting by age ...");
		listDevs.forEach(System.out::println);

		//sort by age descending
		listDevs.sort((o1, o2)->o2.getAge()-o1.getAge());
		System.out.println("After Sorting by age descending ...");
		listDevs.forEach(System.out::println);

		
	}

	private static List<Developer> getDevelopers() {

		List<Developer> result = new ArrayList<Developer>();

		result.add(new Developer("mkyong", new BigDecimal("70000"), 33));
		result.add(new Developer("alvin", new BigDecimal("80000"), 20));
		result.add(new Developer("jason", new BigDecimal("100000"), 10));
		result.add(new Developer("iris", new BigDecimal("170000"), 55));
		
		return result;

	}
	
}