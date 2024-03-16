package com.example.demo_10;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class ConditionTest {

	@Test // ��g���|�����L�C�A�n�O�oimport
	public void ifTest() {

		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J�~��");
		int age = scan.nextInt(); // ���o��J���~�֫���age
		if (age < 20) {
			System.out.println("�A���~�֤Ӥp�A��20���~��R�s�A�u�I");
		}

	}

	@Test
	public void ifElseTest() {

		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J�~��");
		int age = scan.nextInt(); // ���o��J���~�֫���age
		if (age < 20) {
			System.out.println("�A���~�֤Ӥp�A��20���~��R�s�A�u�I");
		} else {
			System.out.println("�I���աI");
		}

		System.out.println("-------�ڬO���j�u-------");

		// ��ΤT���B��l���g�G���]a>b�Astr���a����j�F�Ϥ�b����j
		String str = age < 20 ? "�A���~�֤Ӥp�A��20���~��R�s�A�u�I" : "�I���աI";
		System.out.println(str);
	}

	// �m���D�G�p�����Ҥ@�g�~��
	// �򥻮��~150�A��g�p��40�p�ɫh���~�����~�ꪺ0.8���A����40�p�ɫh���򥻮��~150
	@Test
	public void ifElseTestWeeklyPay() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J���g�u��");
		int workingHour = scan.nextInt();
		if (workingHour < 40) {
			System.out.println("���i���A���~�H120�p��C���g�~���G " + workingHour * 120);
		} else {
			System.out.println("����b�A���~�H150�p��C���g�~���G " + workingHour * 150);
		}
	}

	@Test
	public void ifElseIfTestBreakFast() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J�ʶR���B");
		int money = scan.nextInt();

		// �g�k�@
//		if (money <= 50) {
//			System.out.println("�a���A�u��Y�T���v�[���ߨ��I");
//		} else if (money <= 80) {
//			System.out.println("���I�p���F���_�H�i�H�Y�~���[�����գ{����!");
//		} else {
//			System.out.println("�o�򦳿��H�H�K�I�աI");
//		}

		// �g�k�G
		// �p�S���gmoney>50 �� �]����w�ŦX<=80�ҥH�L�~�������A�����ӦL�U�����T���v����
		if (money > 50 && money <= 80) {
			System.out.println("���I�p���F���_�H�i�H�Y�~���[�����գ{����!");
		} else if (money <= 50) {
			System.out.println("�a���A�u��Y�T���v�[���ߨ��I");
		} else {
			System.out.println("�o�򦳿��H�H�K�I�աI");
		}
	}

	// �m���D�G����
	// �������O�з�100���A�p�󵥩�6���Τj��80����2��A7��12����60��79����5��
	@Test
	public void IfElseIfTestTicketPrice() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�Q���H�H�H�H�H");
		int age = scan.nextInt();
		int price = 100;
		if (age <= 6 || age >= 80) {
			System.out.println("��X�͡H�֦^�ѡH�����G " + price * 0.2);
		} else if ((age >= 7 && age <= 12) || (age >= 60 && age <= 79)) {
			System.out.println("�p���١HLKK�H�����G " + price * 0.5);
		} else {
			System.out.println("���A�S�馩�I�����G " + price);
		}

		// ���age>=7��age<=79�i�H�����A�]���b��L���󦡤w�g����
		// �i�H�Ѧ�PDF�ɮ�Java_05����14��

		if (age <= 6 || age >= 80) {
			System.out.println("��X�͡H�֦^�ѡH�����G " + price * 0.2);
		} else if (age <= 12 || age >= 60) {
			System.out.println("�p���١HLKK�H�����G " + price * 0.5);
		} else {
			System.out.println("���A�S�馩�I�����G " + price);
		}
	}

	@Test
	public void switchTest() {

		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J���Z");
		int score = scan.nextInt();
		switch (score / 10) {
//			case 10:                      
//				System.out.println("A");	//�n���檺�Ʊ���case9�ۦP�A�i�H�����X�֡A�]�N�O�ٲ�case10���欰��break�A�p�U
//				break;						//�n���檺�Ʊ���case9�ۦP�A�i�H�����X�֡A�]�N�O�ٲ�case10���欰��break�A�p�U
			case 10:
			case 9:
				System.out.println("A");
				break;
			case 8:
				System.out.println("B");
				break;
			case 7:
				System.out.println("C");
				break;
			case 6:
				System.out.println("D");
				break;
			default:
				System.out.println("F");
		}

	}
}
