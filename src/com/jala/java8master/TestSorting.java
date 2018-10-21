package com.jala.java8master;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.jala.java8master.pojo.Developer;

public class TestSorting {

	public static void main(String[] args) {

		List<Developer> listDevs = getDevelopers();

		System.out.println("Before Sort...");
		listDevs.forEach(System.out::println);
		
		//sort by salary
		Collections.sort(listDevs, new Comparator<Developer>() {
			@Override
			public int compare(Developer o1, Developer o2) {
				return o1.getSalary().compareTo(o2.getSalary());
			}
		});				

		//sort by age
		listDevs.sort((Developer o1, Developer o2)->o1.getAge()-o2.getAge());
			
	
		System.out.println("After Sorting by salary ...");
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