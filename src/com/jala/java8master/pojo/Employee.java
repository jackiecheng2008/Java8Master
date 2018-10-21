package com.jala.java8master.pojo;

public class Employee {
	public String name;
	public int age;
	public int salary;
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employee(String name, int salary){
		this.name = name;
		this.salary = salary;
	}
	
	public Employee(String name, int salary, int age){
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		
		return "Developer name: " + name + ", his salary is: " + salary + ", his age is: " + age;
	}
}
