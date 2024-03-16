package com.example.demo_10;

public class Animal {

	private String name = "AAA";

	public Animal() {
		super();
		System.out.println("Animal~~~~~");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void eat() {
		System.out.println("動物正在吃!!!");
	}
	
	public void sleep() {
		System.out.println("動物正在睡!!!");
	}
}
