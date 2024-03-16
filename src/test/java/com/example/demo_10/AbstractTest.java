package com.example.demo_10;

import org.junit.jupiter.api.Test;

public class AbstractTest {
	
	// ■■■■■ 抽象類別 ■■■■■
	@Test
	public void test() {
//		Shape shape = new Shape();  ★抽象類別無法建立物件(實例化 instantiate)，即無法new他
		Circle circle = new Circle();
		circle.draw();
		
		//同樣可以用父類別去接子類別
		Shape circle1 = new Circle();
		circle.draw();
	}

}
