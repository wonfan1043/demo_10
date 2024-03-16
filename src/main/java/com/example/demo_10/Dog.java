package com.example.demo_10;

public class Dog extends Animal{  //繼承的關鍵字：extends
	
	private int age;

	public Dog() {
		super();
		System.out.println("Dog~~~~~");
	}

	public Dog(int age, String name) {
		super();
		//以下兩個當父類別的name是private時不能用，如改成protected就可以
//		super.name = name;
//		this.name = name;
		//原本要用一個類別時要先new出來，但因為有繼承關係所以可以直接用關鍵字super來呼叫父類別的方法(當父類別的name是private時)
		super.setName(name);  
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void barking() {
		System.out.println("狗在吠!!!");
	}
	
	//右鍵 → Source → Override/Implement Methods (override為重新定義)

	@Override
	public void eat() {
		System.out.println("狗在吃!!!");
	}

	@Override
	public void sleep() {
		System.out.println("狗在睡!!!");
	}
	
	
}
