package com.example.demo_10;

public class Circle extends Shape{

	@Override
	public void draw() {
		System.out.println("畫圈圈~");
	}
	
	//必須要重新定義抽象類別中的抽象方法
	@Override
	public void area(int a) {
	}
}
