package com.jala.java8master;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Tester {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Jackie", "Amy", "Laura", "Adam", "Helen Xu");
		System.out.println(names.toString());
		// Test Lambda
		
		// Test For Each and Method Reference
		names.forEach(System.out::println);
		
		System.out.println(names.stream().collect(Collectors.toList()));
//		System.out.println(names.stream().collect(Collectors.toList()));
//		System.out.println(names.stream().collect(Collectors.toList()));
		

	}

}
