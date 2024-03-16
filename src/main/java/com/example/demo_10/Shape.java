package com.example.demo_10;

public abstract class Shape {
	
	//抽象類別中的一般方法，有大括號但沒有實作內容
	public void draw() {
		//這裡是方法的大框框，沒有寫東西就是沒有實作內容
	}
	
	//抽象類別中的這個是抽象方法，不能有大括號且用「;」結尾
	public abstract void area(int a);

}
