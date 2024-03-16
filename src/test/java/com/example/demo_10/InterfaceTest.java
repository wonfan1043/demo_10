package com.example.demo_10;

import org.junit.jupiter.api.Test;

public class InterfaceTest {
	
	@Test
	public void test1() {
		Airplane airplane = new Airplane();
		airplane.flying();
		Bird bird = new Bird();
		bird.flying();
	}
	
	@Test
	public void test2() {
		Human human = new Human();
		Person person = new Person();
		Car car = new Car();
		
		human.run();
		person.run();
		car.run();
	}

}
