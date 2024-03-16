package com.example.demo_10;

import java.util.Random;

import org.junit.jupiter.api.Test;

public class ClassTest {
	
	// ���������� ���O�B�ݩʡB��k ����������
	
	@Test
	public void test1() {
		DeadDog dog = new DeadDog();  //�إߤ@�ӷs�� Dog ���O
		System.out.println(dog);  //�L�X�O�����m
	    int age = dog.getAge();
	    System.out.println(age);  //�p�G�S�����w�]�ȡA�L�X�ӬO0(�u���ŧi�S���ȡA��ƪ��w�]�Ȭ�0)
	    String name = dog.getName();
	    System.out.println(name);  //�p�G�S�����w�]�ȡA�L�X�ӬOnull(���F8�Ӱ򥻸�ƫ��A���ۤv���w�]�ȥH�~�A�ѤU����ƫ��A���w�]�ȬҬ�null)
	}
	
	@Test
	public void test2() {
		//�إߤ@�ӷs�� Dog ���O
		DeadDog dog = new DeadDog();
	    //�]�w(�ᤩ)�ݩ�name�Bcolor�s����
	    //�]���쥻���s���v���Oprivate�A�ҥH�����z�LDog���O����setName�H��setColor�ӵ����s����
	    dog.setName("Lilly");
	    dog.setColor("blue");
	    //�]���쥻���s���v���Oprivate�A�ҥH�����z�LDog���O����getName�H��getColor�Ө��o���ݩʪ���
	    System.out.println("�����W�r�G " + dog.getName());
	    System.out.println("�����C��G " + dog.getColor());
        //�S���]�w(�ᤩ)age�s���ȡA�����o���Ȭ�3�A�]���bDog���O��age���ݩʦ��]�w�w�]�Ȭ�3
	    System.out.println("�����~�֡G " + dog.getAge());
	    
	    dog.sleep(); //�I�s��k�A�]����k�����N�w�g�O�L�r�F�A�ҥH�u�ݭn�I�s��k�N�i�H�L�r
	}
	
	@Test
	public void bankTest1() {
		TaipeiBank bank = new TaipeiBank();
		System.out.println(bank.getBalance()); //�w�]�O0
		bank.setBalance(1000); //�s�J1000
		System.out.println(bank.getBalance()); //�s�J1000�ҥH�L�X1000
	}
	
	@Test
	public void bankTest2() {
		TaipeiBank bank = new TaipeiBank();
//		bank.saving(1000);
		bank.withdraw(2000);
	}
	
	//new�X�Ӫ��N�O�@�ӷs���O�����m�I
	//�]��bank1��bank2�O�@�˪��O�����m�A�u�n��Ʀ���A���䳣�|���X�P�˪��s��ơI
	@Test
	public void bankTest3() {
		TaipeiBank bank1 = new TaipeiBank();
		TaipeiBank bank2 = bank1;
		TaipeiBank bank3 = new TaipeiBank();
		System.out.println(bank1);
		System.out.println(bank2);
		System.out.println(bank3);
	}
	
	//�^�ǭ�and�}�GString�O���O���O�^�ǭ�
	@Test
	public void bankTest4() {
		TaipeiBank bank = new TaipeiBank();
		DeadDog dog = new DeadDog();
		System.out.println(dog);
		String str = "ABC";
		System.out.println(str);
		bank.buyDog(dog, str);
	}
	
	//�i�ܦ��Ѽ�
	@Test
	public void bankTest5() {
		TaipeiBank bank = new TaipeiBank();
		bank.buyDog0(new DeadDog(), "ABC", 5, 6, 7, 8);
	}
	
	//�ΦW
	@Test
	public void bankTest6() {
		TaipeiBank bank = new TaipeiBank();
//		Dog dog = new Dog();
//		String str = "ABC";
//		bank.buyDog(dog, str);
		bank.buyDog(new DeadDog(), "ABC");  //new Dog()��"ABC"�u�Τ@���A�ҥH�i�H�ٲ��ŧi�B�J�A�����ΥL
	}
	
	//�غc��k/�غc�l Constructor
	@Test
	public void constructorTest() {
//		TaipeiBank bank = new TaipeiBank();
//		bank.setBranchTitle("Taipei");
//		bank.setUser("AAA");
//		bank.setBalance(5000);
		TaipeiBank bank = new TaipeiBank("Taipei", "AAA", 5000);
		System.out.println("����W�١G " + bank.getBranchTitle());
		System.out.println("�ϥΪ̡G " + bank.getUser());
		System.out.println("�l�B�G " + bank.getBalance());
	}
	
	//static����r
	//ctrl+�����I�i�U�������O�A��static������new�A�Sstatic���nnew
	@Test
	public void test3() {
		//Random���O�Lstatic����r�A�n��new�~���
		Random ran = new Random();
		int num1 = ran.nextInt(2, 99);
		//Math���O��static����r�A����new�N���
		double num2 = Math.random();
	}
}
