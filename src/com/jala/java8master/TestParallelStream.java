package com.jala.java8master;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.jala.java8master.pojo.Developer;

public class TestParallelStream {

	public static void main(String[] args) {

		List<Developer> listDevs = getDevelopers();

		System.out.println("Before Sort...");
		listDevs.forEach(System.out::println);
		
		//Find first Developer
		Developer firstDeveloper = listDevs.parallelStream().findFirst().get();
		System.out.println("First Developer in Parallel Stream is ...\n" + firstDeveloper);
		
		//Find first Developer
		Developer highestPaidDeveloper = listDevs.parallelStream().sorted((o1, o2) -> o2.getSalary().compareTo(o1.getSalary())).findFirst().get();
		System.out.println("Highest Paid Developer in Parallel Stream is ...\n" + highestPaidDeveloper);
		
		//Find first Developer
		List<Developer> sortedPaidDeveloper = listDevs.parallelStream().sorted((o1, o2) -> o2.getSalary().compareTo(o1.getSalary())).collect(Collectors.toList());
		System.out.println("Ranking Developers in Parallel Stream by salary ...\n");
		sortedPaidDeveloper.forEach(System.out::println);
		
	}

	private static List<Developer> getDevelopers() {

		List<Developer> result = new ArrayList<Developer>();

		result.add(new Developer("Jackie Cheng", new BigDecimal("70000"), 45));
		result.add(new Developer("Amy", new BigDecimal("80000"), 30));
		result.add(new Developer("Laura", new BigDecimal("100000"), 12));
		result.add(new Developer("Adam", new BigDecimal("170000"), 9));
		result.add(new Developer("Helen Xu", new BigDecimal("120000"), 18));
		
		return result;

	}
	
}