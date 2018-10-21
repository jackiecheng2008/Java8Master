package com.jala.java8master;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.jala.java8master.pojo.Developer;

public class TestStream {

	public static void main(String[] args) {

		List<Developer> listDevs = getDevelopers();

		System.out.println("Before Sort...");
		listDevs.forEach(System.out::println);
		
		//Filtering age below 20
		List<Developer> adultDevelopers = listDevs.stream().filter(o -> o.getAge() >= 18).collect(Collectors.toList());
		adultDevelopers.sort((o1, o2) -> o1.getAge() - o2.getAge());
		System.out.println("After Filtering age below 20 ...");
		adultDevelopers.forEach(System.out::println);
		
		//Filtering by salary > 100000
		List<Developer> highPaidDevelopers = listDevs.stream().filter(o -> o.getSalary().compareTo(new BigDecimal(100000)) >= 0).collect(Collectors.toList());
		System.out.println("After Filtering by salary > 100000 ...");
		highPaidDevelopers.forEach(System.out::println);
		
		//Filtering by salary < 100000
		List<Developer> lowPaidDevelopers = listDevs.stream().filter(o -> o.getSalary().compareTo(new BigDecimal(100000)) < 0).collect(Collectors.toList());
		System.out.println("After Filtering by salary < 100000 ...");
		lowPaidDevelopers.forEach(System.out::println);
		
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