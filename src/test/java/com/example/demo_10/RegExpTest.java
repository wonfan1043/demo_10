package com.example.demo_10;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class RegExpTest {

	@Test
	public void test1() {
//		String str = "ABC";
//		System.out.println(str);
//		str = "\"ABC\"";
//		System.out.println(str);
		Scanner scan = new Scanner(System.in);
		System.out.println("�q�ܮ��ӡI �榡�G4�X-3�X-3�X");
		String input = scan.next();
		String pattern = "\\d\\d\\d\\d-\\d\\d\\d-\\d\\d\\d";
		// �� {}�ΨӪ�ܭ��ƪ��r��A���u���󦹲Ÿ����e���@�ӡA�o��|�O\\d�A�]���@��\\d�O�@�ժ�ܤ@�ӼƦr
		String pattern1 = "\\d{4}-\\d{3}-\\d{3}";
		// �� patter1�O�u-\\d{3}�v���ƤF�⦸�A���u-�v�M�u\\d{3}�v�ݩ󤣦P�Ÿ��N��
	    //   �p�G�g \\d{4}-\\d{3}{2} �|�ܦ� 4�X-3�X3�X
		//   �Ѫk�G�Τp�A��()�N�P�@�ժ��欰�ذ_�ӡA�i�D�{���o�O�@�ժ��B�n���Ƴo�� �� (-\\d{3})
		String pattern2 = "\\d{4}(-\\d{3}){2}";
//		System.out.println(pattern);
		if(input.matches(pattern)) {
			System.out.println("����I���ߡI�u�I");
		} else {
			System.out.println("���M�H�ݤ����榡�H");
		}
	}
	
	// �����q�ܸ��X���
	// �ϽX�� 2 �X
	// �q�ܸ��X 7~8 �X
	// �ϽX�M���X���H�U2�خ榡
	// �ϽX���p�A��,�᭱���s�q�ܸ��X,�Ҧp (02)12345678
	// �ϽX�S���p�A��,���ϽX�M�q�ܸ��X�� �V �s��,�Ҧp 02-1234567
	
	@Test
	public void test2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�q�ܡI (XX)XXXXXXXX��XX-XXXXXXX�I");
		String input = scan.next();
		String pattern = "(\\(\\d{2}\\))||(\\d{2}-)\\d{7,8}";
		if(input.matches(pattern)) {
			System.out.println("GOOOOOD!!!");
		} else {
			System.out.println("�榡���~!!!");
		}
	}
	
	@Test
	public void test3() {
		String pattern = ".ab";
		String str1 = "\nab";
		String str2 = "\tab";
		System.out.println(str1.matches(pattern));
		System.out.println(str2.matches(pattern));
	}
	
	// �����q�ܸ��X���
	// �ϥνd��Ÿ� []
	// �ϽX 0 �}�Y,�`�@�|�� 2~4 �X�A�ѤU3�X���o��0
	// �q�ܸ��X 7~8 �X
	// �ϽX�M���X�����H �V �s��,�Ҧp 02-12345678
	
	@Test
	public void test4() {
		String pattern = "0[1-9]{1,3}-\\d{7,8}";
		Scanner scan = new Scanner(System.in);
		System.out.println("�q��! 0�}�Y�ϽX�@2��4�X�A�Ѿl���X7��8�X�A�����H�u-�v�j�}�I");
		String input = scan.next();
		if(input.matches(pattern)) {
			System.out.println("GOOOOOD!!!");
		} else {
			System.out.println("�榡���~!");
		}
	}
	
	@Test
	public void test5() {
		//�u^�v�Ÿ��G
		//(1)�Φb���A������ܱư��A�u���b�}�Y�A�p[^ABC]��ܱư� A �� B �� C
		//(2)�Φb���A���~��ܶ}�Y�A�Ҧp^[ABV]�A�p^[ABC]��ܥ����H A �� B �� C �}�Y
		//(3)�Φb��L�Ÿ��ɤ]��ܶ}�Y���N��A�p^A��ܥ����HA�}�Y
		//   �� �u^�v�Ÿ���ܶ}�Y�A���O�b���A�����ɪ�ܱư��A�����ݩ�b�}�Y
		String pattern = "^A.";
		String str1 = "AB";
		String str2 = "aB";
		System.out.println(str1.matches(pattern));
		System.out.println(str2.matches(pattern));
	}
	
	// �����Ҧr���ˬd(Scanner ��J)
	// 10�X
	// �Ĥ@�Ӧr���^��r��(�j�p�g�ҥi)
	// �^��r���᭱���۪��Ĥ@�ӼƦr�u�|�O 1 �� 2
	// �ХΥ��W��F������

	// ������,�ЦA�g�ӱư�6�����^��r��(A�BB�BD�BE�BF�BH)
	// ����1,�i�μɤO�}��
	// ����2,�ХίS��r��
	
	@Test
	public void test6() {
		Scanner scan = new Scanner(System.in);
		String pattern = "[\\w&&[^\\d_]][1-2]\\d{8}";
		System.out.println("�����Ҧr������!");
		String input = scan.next();
		if(input.matches(pattern)) {
			System.out.println("�Ӹ�GET!!!!!");
		} else {
			System.out.println("�üg!");
		}
	}
	
	@Test
	public void tes7() {
		Scanner scan = new Scanner(System.in);
		String pattern = "[\\w&&[^ABDEFHabdefh\\d_]][1-2]\\d{8}";
		System.out.println("�����Ҧr������!");
		String input = scan.next();
		if(input.matches(pattern)) {
			System.out.println("�Ӹ�GET!!!!!");
		} else {
			System.out.println("�����H���}!!!!! or �榡NO�üg!!!!!");
		}
		}
	
	@Test //�Ѯv�Ѫk
	public void test8() {
		String pattern1 = "[A-Za-z&&[^ABDEFHabdefh]][1-2]\\{8}";
		String pattern2 = "[^ABDEFHabdefh\\W\\d_][1-2]\\d{8}";
		String pattern3 = "[\\w&&[^\\d_ABDEFHabdefh]][1-2]\\d{8}"; //�Ѯv���ˡI
		String pattern4 = "[CGI-Zcgi-z][1-2]\\d{8}";
	}
	
	@Test //�üg�����n��!!!
	public void test9() {
		String pattern = "[\\W+\\w&&[^_]]{8,16}";
		String test = "0123456789";
		System.out.println(test.matches(pattern));
	}
}
