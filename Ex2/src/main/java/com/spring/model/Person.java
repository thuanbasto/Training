package com.spring.model;


public class Person {
	private String name;
	private int age;
	
	public Person() {
		super();
		this.name = "a";
		this.age = 1;
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public void init() {
		System.out.println("Khoi tao Bean");
	}
	public void destroy() {
		System.out.println("Huy Bean");
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
	
	
}
