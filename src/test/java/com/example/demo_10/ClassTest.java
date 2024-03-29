package com.example.demo_10;

import java.util.Random;

import org.junit.jupiter.api.Test;

public class ClassTest {
	
	// ――――― 寵�O�B紬�福Bよ�k ―――――
	
	@Test
	public void test1() {
		DeadDog dog = new DeadDog();  //�悒澆@�啖s�� Dog 寵�O
		System.out.println(dog);  //�L�X�O笑悼�豸m
	    int age = dog.getAge();
	    System.out.println(age);  //�p�G�SΤ宜�w�]�函A�L�X�哮O0(�uΤ�擢i�SΤ�函A障柴�差w�]�八�0)
	    String name = dog.getName();
	    System.out.println(name);  //�p�G�SΤ宜�w�]�函A�L�X�哮Onull(娃�F8�唹鬟燦螫陶��AΤ�曚v�差w�]�肇H�~�A角�U�左螫陶��A�差w�]�八飭�null)
	}
	
	@Test
	public void test2() {
		//�悒澆@�啖s�� Dog 寵�O
		DeadDog dog = new DeadDog();
	    //�]�w(潤ぉ)紬��name�Bcolor�s�梱�
	    //�]�悪譽鯖墾s���v���Oprivate�A�劵Hゲ況�z�LDog寵�Oい��setName�HのsetColor�啜垢��s�梱�
	    dog.setName("Lilly");
	    dog.setColor("blue");
	    //�]�悪譽鯖墾s���v���Oprivate�A�劵Hゲ況�z�LDog寵�Oい��getName�HのgetColor�哦��o袴紬�物梱�
	    System.out.println("���墾W�r�G " + dog.getName());
	    System.out.println("���挫C�癲G " + dog.getColor());
        //�SΤ�]�w(潤ぉ)age�s�梱函A�����o�梱八�3�A�]�愛bDog寵�Oいage�債櫞弗崖]�w�w�]�八�3
	    System.out.println("���墾~綴�G " + dog.getAge());
	    
	    dog.sleep(); //�I�sよ�k�A�]�阿茯kセ┃�N�w�g�O�L�r�F�A�劵H�u旨�n�I�sよ�k�N�i�H�L�r
	}
	
	@Test
	public void bankTest1() {
		TaipeiBank bank = new TaipeiBank();
		System.out.println(bank.getBalance()); //�w�]�O0
		bank.setBalance(1000); //�s�J1000
		System.out.println(bank.getBalance()); //�s�J1000�劵H�L�X1000
	}
	
	@Test
	public void bankTest2() {
		TaipeiBank bank = new TaipeiBank();
//		bank.saving(1000);
		bank.withdraw(2000);
	}
	
	//new�X�唔佐N�O�@�啖s�紺O笑悼�豸m�I
	//�]��bank1交bank2�O�@舎�紺O笑悼�豸m�A�u�n瑚�豆皆錙A�眞箜７|���X�P舎�嵯s瑚�董I
	@Test
	public void bankTest3() {
		TaipeiBank bank1 = new TaipeiBank();
		TaipeiBank bank2 = bank1;
		TaipeiBank bank3 = new TaipeiBank();
		System.out.println(bank1);
		System.out.println(bank2);
		System.out.println(bank3);
	}
	
	//�^暁��and�}�GString�O寵�O���O�^暁��
	@Test
	public void bankTest4() {
		TaipeiBank bank = new TaipeiBank();
		DeadDog dog = new DeadDog();
		System.out.println(dog);
		String str = "ABC";
		System.out.println(str);
		bank.buyDog(dog, str);
	}
	
	//�i怒Α委柴
	@Test
	public void bankTest5() {
		TaipeiBank bank = new TaipeiBank();
		bank.buyDog0(new DeadDog(), "ABC", 5, 6, 7, 8);
	}
	
	//偉�W
	@Test
	public void bankTest6() {
		TaipeiBank bank = new TaipeiBank();
//		Dog dog = new Dog();
//		String str = "ABC";
//		bank.buyDog(dog, str);
		bank.buyDog(new DeadDog(), "ABC");  //new Dog()交"ABC"�uノ�@Ω�A�劵H�i�H�找か擢i�B�J�A�襲汽離L
	}
	
	//�愃cよ�k/�愃c�l Constructor
	@Test
	public void constructorTest() {
//		TaipeiBank bank = new TaipeiBank();
//		bank.setBranchTitle("Taipei");
//		bank.setUser("AAA");
//		bank.setBalance(5000);
		TaipeiBank bank = new TaipeiBank("Taipei", "AAA", 5000);
		System.out.println("だ�网W細�G " + bank.getBranchTitle());
		System.out.println("�魯葎漫G " + bank.getUser());
		System.out.println("�l�B�G " + bank.getBalance());
	}
	
	//static猪槍�r
	//ctrl+オ槍�I�i�Uよ�皚喘��O�AΤstatic�困�ノnew�A�Sstatic�梱nnew
	@Test
	public void test3() {
		//Random寵�O�Lstatic猪槍�r�A�n��new�~�爛�
		Random ran = new Random();
		int num1 = ran.nextInt(2, 99);
		//Math寵�OΤstatic猪槍�r�Aぃノnew�N�爛�
		double num2 = Math.random();
	}
}
