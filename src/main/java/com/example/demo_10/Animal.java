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
		System.out.println("�ʪ����b�Y!!!");
	}
	
	public void sleep() {
		System.out.println("�ʪ����b��!!!");
	}
}
