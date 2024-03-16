package com.example.demo_10;

import java.util.Scanner;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

//@SpringBootTest //�[�W������annotation��ܷ|����M�פ� Application �� main�A�@��ӻ����n�[�A�u�O�{�bmain�S�F��ҥH���ѱ�
public class Demo10ApplicationTests {

	@Test
	public void contextLoads() { // ��kmethod
		System.out.println(100); // �Ʀr�bJava���κټƦrint
		System.out.println("ABC"); // ��r�bJava���κ٦r��String�A�r��n�����޸�""�ذ_�Ӥ~���T�A�S�[�N�|�X���L�C
		System.out.println("100"); // �Τ�r�覡��X����ݤ��X�ӡA���O�bJava�{���X���n���M���Ʀr��r��
		System.out.println('A'); // ABC�γ�޸�''����A�]���u��@�Ӧr�A�u��gA�A�Y�r��char

		// �H�W����ƫ��Aint�Bsting�Bchar

		// ������

		/*
		 * �h�����
		 */

		/**
		 * ������
		 */
	}

	@Test // �o�Ӱ϶���W����Test���}�O���P���A���P�˳��bclass���O�̭� �� ���O�����Ľd��û��O�̤j��
	public void dataTypeTest() { // dataTypeTest�A�h�ӳ�r���զX�ɡA�U�@�ӳ�r�����r���n�j�g�A�o�ˤ���n�\Ū
		int x = 10; // �٨S�g�i�U�誺print�e�|�����L�C(�L�`)�A�u�O�b�������g�X�o�ӪF����S���ϥΨ�A�b�U����print�g�Jx����L�C�N�|����
		System.out.println(x);
		x = x + 5; // �{���X�������G�ⵥ���k�䪺�Ƚᤩ���������䪺�ܼơA�Y�N�쥻��x=10�[�W5��A�ᤩ�^���䪺x�A�ҥH�̫᪺x�O15
		System.out.println(x);
	}

	@Test
	public void printTest() {
		int hourlySalary = 200; // �ܼƤ@�w�n���ŧi��~����ϥΡA�p�G��int�����N�|�X��
		System.out.println("���~�G" + hourlySalary); // �e�誺�r��s���g���A�Y�T�w����ơA�]�s��hard code�A�r����L��ƪ��걵��+
		hourlySalary = 250; // �b�P�@�Ӥj�A���̭����ۦP�ܼƦW�٤��୫�ƫŧi�A�W��w�g�ŧi��int�A�ҥH����A�ŧi�A�������ƨϥΧY�i
		System.out.println("���~�G" + hourlySalary);

		// -------�ڬO���j�u-------

		System.out.printf("���~�G %d", hourlySalary); // %d�O�T�w���g�k�A����Ÿ�%��ܥe�F�@�Ӧ�m�Ad�N���ƫ��A�O��ơA�ҥH�᭱�n�A�a�J�ܼ�
		// System.out.printf("���~�G %d","ABC"); �� �o�ӷ|�L�X�u���~�G�v�M��N�X���A�]�����Fd���S�����ܼƫo���F�r��A�t�~�{���u�n�X���N�|���U�ӡA�ҥH�U�賣�L���X��
		System.out.printf("���~�G %d \n", hourlySalary); // �p�G�n����N�[�J�u \n�v
		System.out.printf("���~�G %s", "ABC"); // s�N���ƫ��A�O�r��A�ҥH�᭱�n�A�a�J�r��
	}
	
	@Test
	public void primitiveDataType() {
		byte w = 127;
		short q = 32767;
		int x = 2147483647; //�w�]��ƫ��A �� �᭱ԣ�����Υ[
		long y = 2147483648l; //�D�w�]��ƫ��A �� �᭱�n�[�j�g�Τp�g��L
		long z = 2147483648L; //�P�W
		float a = 5.0f; //�D�w�]��ƫ��A �� �᭱�n�[�j�g�Τp�g��F
		float b = 5.0F; //�P�W
		double c = 5.1; //�w�]��ƫ��A �� �᭱ԣ�����Υ[
		System.out.println(w);
		System.out.println(q);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	@Test
	public void test() {
		int a = 5;
		int b = 3;
		int c = a/b;
		System.out.println(c); //a�O��ơBb�O��ơA�ҥH�b�{���y����a���Hb���w�O���
		
		// -------�ڬO���j�u-------
		
		double d = a/b;
		System.out.println(d); //�P�W�A����ন�B�I�ơA�Y��c�����G�ର�B�I�ơA�ä��O���@��ƾǤ@�˪��B��A�]���{���y���O�N�k�䪺���G�ᤩ������
		
		// -------�ڬO���j�u-------
		
		System.out.println(a);
		System.out.println((double)a); //�쥻a�O���5�A�j��令double��5.0
		double e = (double)a/b; //�N�Ʀr���j���૬�G�j��Na����ƫ��A�qint�令double�A�����૬��String�A�u���ন��������ƫ��A
		System.out.println(e);
		
		// -------�ڬO���j�u-------
		
		System.out.println(5 > 10); //��j�p�N�O����true�Τ�����false�A�ҥH�|�L�Xfalse
		boolean f = 5 > 10; //��j�p�N�O����true�Τ�����false�A�ҥHf��false
		System.out.println(f);
		boolean f1 = false; //�����w�qf1�N�Ofalse
		System.out.println(f1);
	}
	
	@Test
	public void test1() {
		//�@/�椸(Unary)�B��l
		int i = 5;
		System.out.println(i);
		i++; //�N�Oi=i+1�A��i�[�@��^�ǵ�i
		System.out.println(i);
		i--; //�N�Oi=i-1�A��i��@��^�ǵ�i
		System.out.println(i);
		
		// -------�ڬO���j�u-------
		
		//�T��(Ternary)�B��l
		int a = 5;
		int b = 10;
		//���]a>b�Astr���a����j�F�Ϥ�b����j
		String str = a > b ? "a����j" : "b����j";
		System.out.println(str);
		
		// -------�ڬO���j�u-------
		
		//�ϦV�B��G�ھڹB��ѪG��L�ϹL��
		int x = 15;
		int y = 10;
		boolean boo = x > y;
		System.out.println(boo);
		System.out.println(!boo); //��!�⵲�G�j��½��
		boolean boo1 = !(x > y); //��!�⵲�G�j��½��
		System.out.println(boo1);
		System.out.println(!boo1); //��!�⵲�G�j��½��
	}
	
	@Test //���i++�P++i���t��
	public void test2() {
		int ii = 10;
		ii++;
		System.out.println(ii);
		int jj = 20;
		++jj;
		System.out.println(jj);
		
		// -------�ڬO���j�u-------
		
		int i = 10;
		System.out.println("i = " + i);
		int j = i++*10; //i++ �� ��m�B��G���B���~���W/��Ai�����H10����~��i�[1
		System.out.println("i = " + i); //�B��⧹��[1�ҥH�O11
		System.out.println("j = " + j); //�B��⧹�F�N�Oi���H10�ҥH�O100
		System.out.println("-------�ڬO���j�u-------");
		int a = 10;
		System.out.println("a = " + a);
		int b = ++a*10; //++i �� �e�m�B��G�����W/���~�B��A����a�[�@��~���H10
		System.out.println("a = " + a); //�B��e���[1�ҥH�O11
		System.out.println("b = " + b); //�B��e�[1�F�ҥH�O11���H10�A�]�����G��110
	}
	
	@Test //�e�M���ƫ��A�ഫ
	public void test3() {
		byte b = 127;
		int i;
		i = b;
		System.out.println(i); //int�i�H�e��127�A�ҥH�|���\�L�X127
		System.out.println("-------�ڬO���j�u-------");
		int j = 128;
		byte b1;
//		b1 = j; //byte�u��e�Ǩ�127�A�L�k�e��128�ҥH�|�X�{���L�C
		b1 = (byte)j; //�j���૬�A���ӷ|�Ψ�u�Ʀr�W�v���j���૬
		System.out.println(b1); //�j���૬���ܦ��t��
	}
	
	@Test //�ù���J
	public void inputTest() {
		Scanner scan = new Scanner(System.in);
		/*System.out.println("�п�J�@�ӼƦr"); //�o�@��O�����ϥΪ̭n�F��
		int input = scan.nextInt(); //�ϥ�scan�ܼơA�Ρu.�v�h�ϥ�Scanner���O����nextInt��k�Ө��o��J�����
		System.out.println("�A��J���Ʀr�O" + input);
		// -------�ڬO���j�u-------
		System.out.println("�п�J�@�Ӧr��");
		String str = scan.next(); //���o��J���r��
		System.out.println("�A��J���r��O " + str);*/
		// -------�ڬO���j�u-------
//		String str = scan.next(); //���o��J���r��A�p�G��J�uABC DEF�v�h���|���oABC(�Ů�e��)
		System.out.println("�п�J�@�Ӧr��");
		String str1 = scan.nextLine(); //���o��J���@����r�A���u��ۤv��W����A�����n��177��183���ѱ��~�����
		System.out.println("�A��J���O " + str1);
		
		//�q�`�u�|scan.nextInt��scan.next�V�ۥΡA�p�G�n�s�Pscan.nextLine�@�_�έn���s�ŧi�@��Scanner
		
	}

}

