package com.example.demo_10;

import org.junit.jupiter.api.Test;

public class AbstractTest {
	
	// ���������� ��H���O ����������
	@Test
	public void test() {
//		Shape shape = new Shape();  ����H���O�L�k�إߪ���(��Ҥ� instantiate)�A�Y�L�knew�L
		Circle circle = new Circle();
		circle.draw();
		
		//�P�˥i�H�Τ����O�h���l���O
		Shape circle1 = new Circle();
		circle.draw();
	}

}
