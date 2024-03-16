package com.example.demo_10;

import java.util.Random;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class LoopTest {

	// for�j��G�y�k�H�ΰ򥻷���
	@Test
	public void forLoopTest() {
		for (int i = 1; i <= 10; i++) {
//			System.out.println(i);	//�L�X1��10
			if (i == 5) {
//				break;		//���X���for�j��
				continue; // ���X�����j��A�Yi=5�ɷ|������U�誺�L�r�B�����^��W�誺i++
			}
			System.out.println(i);
		}
	}

	// for�j��G�p��1+2+3+....+10
	@Test
	public void forLoopTest2() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
//			int sum = 0;	//�p�Gsum��b�j�餤�A�|���ƫŧisum��0�A�Y�C���i�J�j�鳣���s��0�뵹sum�A�ҥH�̫᪺sum�|�ܦ�10�ӫD�`�M55
			sum = sum + i; // �]�i�H�g sum += i;
		}
		System.out.println("1�[��10���`�M���G " + sum);
	}

	// �_��for�j��G�E�E���k��
	@Test
	public void netForLoopTest3() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
//				System.out.println(i + "*" + j + "=" + i*j);  //�L�X�ӶW�������ݡI�I�I�g�_�Ӥ]�����ݡI�I�I
//				System.out.printf("%d*%d=%d  ", i, j, i*j);  //�L�X�ӷ|�]�����Ӧ�ƩM����ƩҥH�n�n�ױסA���ݡI�I�I
				System.out.printf("%d*%d=%2d  ", i, j, i * j); // %2d�N����Ӧ�m�i�H��Ʀr�A�p�G�O�Ӧ�ƨ��Ĥ@�Ӧ�m�|�ť�
			}
			System.out.println(""); // �bi���U�@�ӼƦr���ɭԴ���
		}
	}

	// while�j��G�y�k�H�ΰ򥻷���
	@Test // �p��1+2+3+....+10
	public void whileLoopTest() {
		int i = 1;
		int sum = 0;
		while (i <= 10) {
//			System.out.println(i);
			sum = sum + i; // ���P����for�j�骺����϶�
			i++; // �M��A�i�歡�N�󴫼ƭ�
		}
		System.out.println("1�[��10���`�M���G " + sum);
	}

	// �_��while�j��G�E�E���k��
	@Test
	public void netWhileLoopTest() {
		int i = 1;
		while (i <= 9) {
			int j = 1;
			while (j <= 9) {
				System.out.printf("%d*%d=%2d  ", i, j, i * j);
				j++;
			}
			i++;
			System.out.println("");
		}
	}

	// �^�a�@�~�G�ΰj��D1��10���_�ƩM
	@Test // ��k�@
	public void oddNumberSum1() {
		int i = 1;
		int sum = 0;
		while (i <= 10) {
			if (i % 2 == 0) {
				i++;
				continue;
			} else {
				sum = sum + i;
				i++;
			}
		}
		System.out.println("1��10�_�ƪ��`�M���G " + sum);
	}

	@Test // ��k�G
	public void oddNumberSum2() {
		int i = 1;
		int sum = 0;
		while (i <= 10) {
			if (i % 2 == 1) {
				sum = sum + i;
			}
			i++;
		}
		System.out.println("1��10�_�ƪ��`�M���G " + sum);
	}

	@Test // ��k�T
	public void oddNumberSum3() {
		int i = 1;
		int sum = 0;
		do {
			if (i % 2 == 1) {
				sum = sum + i;
			}
			i++;
		} while (i <= 10);
		System.out.println("1��10�_�ƪ��`�M���G " + sum);
	}

	@Test // ��k�|
	public void oddNumberSum4() {
		int i = 1;
		int sum = 0;
		while (i <= 9) {
			switch (i % 2) {
			case 0:
				break;
			case 1:
				sum = sum + i;
			}
			i++;
		}
		System.out.println(sum);
	}

	// ���ҡG�W�٦ۭq�q�A�H�U�R�W��a
	@Test
	public void labelTest() {
		a: for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j == 5) {
//					break a;  //�Q�μ���a���X�е���a���j�� �� �������A����
					continue a; // ���X���е���a���j�� �� ����@�~���A����
				}
				System.out.printf("%d*%d=%2d  ", i, j, i * j);
			}
			System.out.println("");
		}
	}

	// ��@�G�q�Ʀr�C�� Java 06 P.25
	@Test // �ۤv�g��
	public void guessNumberTest() {
		Random ran = new Random();
		int target = ran.nextInt(2, 99); // �H�����ͤ���j�󵥩�2�B�p��99���Ʀr�A2 <= N < 99 (�]���n�ƥX1��99)
		int lower = 1;
		int higher = 99;
		System.out.println(target);

		Scanner scan = new Scanner(System.in);
		System.out.printf("%d��%d�����ӭӼƦr�I", lower, higher);

		int input = scan.nextInt();
		for (;;) {
			if (target == input) {
				System.out.println("��������q���F!");
				break;
			} else {
				if (input > target) {
					higher = input;
				} else {
					lower = input;
				}
				System.out.printf("�òq�I%d��%d�����A�ӭӼơI", lower, higher);
				input = scan.nextInt();

				while (input < lower || input > higher) {
					System.out.printf("��áI%d��%d�����I", lower, higher);
					input = scan.nextInt();
				}
			}
		}
	}

	@Test // �Ѯv�g��
	public void guessNumberTestAnswer() {
		Random ran = new Random();
		int target = ran.nextInt(2, 99); // �H�����ͤ���j�󵥩�2�B�p��99���Ʀr�A2 <= N < 99 (�]���n�ƥX1��99)
		int lower = 1;
		int higher = 99;
		System.out.println(target);
		Scanner scan = new Scanner(System.in);
		System.out.printf("%d��%d�����ӭӼƦr�I\n", lower, higher);
		for (;;) {
			int input = scan.nextInt();
			if (target == input) {
				System.out.println("��������q���F!");
				break;
			}
			if (input < lower || input > higher) { // �o�̬O���b
				System.out.printf("%d��%d�����ӭӼƦr�I\n", lower, higher);
				continue;
			}
			if (input > target) {
				higher = input; // �o�̬O��s�W��
			} else {
				lower = input; // �o�̬O��s�U��
			}
			System.out.printf("%d��%d�����ӭӼƦr�I\n", lower, higher);
		}
	}

	// �m�ߡG���ߦPŢ
	// 35���Y��100���}�A�а�����ߦU���X��
	@Test // ��k�@
	public void chickenRabbitNum1() {
		int chicken = 0;
		int rabbit;
		while (true) {
			rabbit = 35 - chicken;
			if (2 * chicken + 4 * rabbit == 100) {
				System.out.printf("���� %2d ���A�ߦ� %2d ��", chicken, rabbit);
				break;
			}
			chicken += 1;
		}
	}

	@Test // ��k�G
	public void chickenRabbitNum2() {
		int chicken;
		int rabbit = 0;
		while (true) {
			chicken = 35 - rabbit;
			if (2 * chicken + 4 * rabbit == 100) {
				System.out.printf("���� %2d ���A�ߦ� %2d ��", chicken, rabbit);
				break;
			}
			rabbit += 1;
		}
	}

	// ���������� �m���D�G��X100�H������ƨæC�L ����������
	@Test
	public void test1() {
		a: for (int i = 2; i <= 100; i++) {
			if (i % 2 == 0 && i > 2) {
				continue;
			}
			for (int j = 3; j < i; j += 2) {
				if (i % j == 0) {
					continue a;
				}
			}
			System.out.println(i);
		}
	}

	@Test // �Ѯv��
	public void test11() {
		a: for (int i = 2; i <= 100; i++) {
			if (i != 2 && i % 2 == 0) {
				continue;
			}
			for (int j = 3; j <= Math.sqrt(i); j++) { // �Ѯv�ҹ�gj+=2�|���(�Ʀr�h��)
				if (i % j == 0) {
					continue a;
				}
			}
			System.out.println(i);
		}
	}

	// ���������� �m���D�G��X10�H�᪺20�ӽ�ƨæC�L ����������
	@Test
	public void test2() {
		int count = 0;
		a: for (int i = 2; i <= 100; i++) {
			if (i % 2 == 0 && i > 2) {
				continue;
			}
			for (int j = 3; j < i; j += 2) {
				if (i % j == 0) {
					continue a;
				}
			}
			if (i > 10 && count < 20) {
				count++;
				System.out.println(i);
			}
		}
	}
	
	// ���������� �m���D�G�T�{��J���Ʀr�O�_����� ����������
	@Test
	public void test3() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�ӭӼƦr�I");
		int input = scan.nextInt();
		if ((input <= 0 || input == 1 || input % 2 == 0) && input != 2) {
			System.out.println(input + "���O���!");
			return;
		}
		for (int i = 3; i <= Math.sqrt(input); i += 2) {
			if (input % i == 0) {
				System.out.println(input + "���O���!");
				return;
			}
		}
		System.out.println(input + "�O���!");
	}
}
