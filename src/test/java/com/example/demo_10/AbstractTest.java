package com.example.demo_10;

import org.junit.jupiter.api.Test;

public class AbstractTest {
	
	// ――――― �盒H寵�O ―――――
	@Test
	public void test() {
//		Shape shape = new Shape();  々�盒H寵�O�L�k�悒潛�ン(濠�劼� instantiate)�A�Y�L�knew�L
		Circle circle = new Circle();
		circle.draw();
		
		//�P舎�i�Hノ��寵�O�h欝�l寵�O
		Shape circle1 = new Circle();
		circle.draw();
	}

}
