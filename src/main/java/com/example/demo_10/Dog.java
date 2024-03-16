package com.example.demo_10;

public class Dog extends Animal{  //�~�Ӫ�����r�Gextends
	
	private int age;

	public Dog() {
		super();
		System.out.println("Dog~~~~~");
	}

	public Dog(int age, String name) {
		super();
		//�H�U��ӷ�����O��name�Oprivate�ɤ���ΡA�p�令protected�N�i�H
//		super.name = name;
//		this.name = name;
		//�쥻�n�Τ@�����O�ɭn��new�X�ӡA���]�����~�����Y�ҥH�i�H����������rsuper�өI�s�����O����k(������O��name�Oprivate��)
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
		System.out.println("���b�p!!!");
	}
	
	//�k�� �� Source �� Override/Implement Methods (override�����s�w�q)

	@Override
	public void eat() {
		System.out.println("���b�Y!!!");
	}

	@Override
	public void sleep() {
		System.out.println("���b��!!!");
	}
	
	
}
