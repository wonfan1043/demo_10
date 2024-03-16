package com.example.demo_10;

import org.junit.jupiter.api.Test;

public class InheritanceTest {
	
	@Test
	public void test1() {
		Animal ani = new Animal();
		System.out.println(ani.getName());
		ani.eat();
		System.out.println("==========");
		Dog dog = new Dog();
		System.out.println(dog.getName());
		dog.setName("Lily");
		System.out.println(dog.getName());
		System.out.println("==========");
		dog.eat();
	}
	
	@Test //無論建構方法有沒有寫super，new子類別出來後都會先跑父類別的建構方法，然後才跑子類別的建構方法
	public void test2() {
		Dog dog = new Dog(); 
	}
	
	@Test
	public void test3() {
		Animal ani = new Animal();
//		Dog dog = new Dog();
		Animal dog = new Dog();
		ani.eat();
		dog.eat();
		
		//在繼承中可以new子類別出來後用父類別承接，即寫成 Animal dog = new Dog();
		//但是用父類別承接的話會無法使用dog自己獨有的屬性和方法
		//即使使用父類別承接，但實際上執行的還是子類別中「重新定義Override」過的方法
		
		System.out.println("==========");
		
		act(ani);
		act(dog);
	}
	
	private void act(Animal ani) {  //把Animal這個類別帶進來去呼叫eat
		ani.eat();
	}
	
	// ■■■■■ 匿名類別 ■■■■■
	
	@Test
	public void test4() {
		Animal ani = new Animal();
		act(ani); //ani宣告後只使用了一次
		// ==========
		act(new Animal()); //因為只使用一次，所以可以不用參數接回，改以匿名類別的方式撰寫，即直接把new Animal()當成參數帶入
		
		//好處：可以省下一個去存ani的記憶體空間
	}
	
	// ■■■■■ 匿名內部類別 ■■■■■
	
	@Test 
	public void test5() {
		Dog dog = new Dog();
		dog.barking(); //無法直接修改barking的執行內容
		System.out.println("==========");
		Dog doggg = new Dog() {  //為了修改barking的執行內容，在Dog doggg = new Dog();的基礎上加上{}來修改實作內容
			@Override
			public void barking() {
				System.out.println("狗在妹妹號!!!");
			}
		};
		doggg.barking();
	}
}
