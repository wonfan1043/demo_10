package com.example.demo_10;

import java.util.Random;

import org.junit.jupiter.api.Test;

public class ClassTest {
	
	// ■■■■■ 類別、屬性、方法 ■■■■■
	
	@Test
	public void test1() {
		DeadDog dog = new DeadDog();  //建立一個新的 Dog 類別
		System.out.println(dog);  //印出記憶體位置
	    int age = dog.getAge();
	    System.out.println(age);  //如果沒有給預設值，印出來是0(只有宣告沒有值，整數的預設值為0)
	    String name = dog.getName();
	    System.out.println(name);  //如果沒有給預設值，印出來是null(除了8個基本資料型態有自己的預設值以外，剩下的資料型態的預設值皆為null)
	}
	
	@Test
	public void test2() {
		//建立一個新的 Dog 類別
		DeadDog dog = new DeadDog();
	    //設定(賦予)屬性name、color新的值
	    //因為原本的存取權限是private，所以必須透過Dog類別中的setName以及setColor來給予新的值
	    dog.setName("Lilly");
	    dog.setColor("blue");
	    //因為原本的存取權限是private，所以必須透過Dog類別中的getName以及getColor來取得該屬性的值
	    System.out.println("狗的名字： " + dog.getName());
	    System.out.println("狗的顏色： " + dog.getColor());
        //沒有設定(賦予)age新的值，但取得的值為3，因為在Dog類別中age的屬性有設定預設值為3
	    System.out.println("狗的年齡： " + dog.getAge());
	    
	    dog.sleep(); //呼叫方法，因為方法本身就已經是印字了，所以只需要呼叫方法就可以印字
	}
	
	@Test
	public void bankTest1() {
		TaipeiBank bank = new TaipeiBank();
		System.out.println(bank.getBalance()); //預設是0
		bank.setBalance(1000); //存入1000
		System.out.println(bank.getBalance()); //存入1000所以印出1000
	}
	
	@Test
	public void bankTest2() {
		TaipeiBank bank = new TaipeiBank();
//		bank.saving(1000);
		bank.withdraw(2000);
	}
	
	//new出來的就是一個新的記憶體位置！
	//因為bank1跟bank2是一樣的記憶體位置，只要資料有改，兩邊都會取出同樣的新資料！
	@Test
	public void bankTest3() {
		TaipeiBank bank1 = new TaipeiBank();
		TaipeiBank bank2 = bank1;
		TaipeiBank bank3 = new TaipeiBank();
		System.out.println(bank1);
		System.out.println(bank2);
		System.out.println(bank3);
	}
	
	//回傳值and址：String是類別但是回傳值
	@Test
	public void bankTest4() {
		TaipeiBank bank = new TaipeiBank();
		DeadDog dog = new DeadDog();
		System.out.println(dog);
		String str = "ABC";
		System.out.println(str);
		bank.buyDog(dog, str);
	}
	
	//可變式參數
	@Test
	public void bankTest5() {
		TaipeiBank bank = new TaipeiBank();
		bank.buyDog0(new DeadDog(), "ABC", 5, 6, 7, 8);
	}
	
	//匿名
	@Test
	public void bankTest6() {
		TaipeiBank bank = new TaipeiBank();
//		Dog dog = new Dog();
//		String str = "ABC";
//		bank.buyDog(dog, str);
		bank.buyDog(new DeadDog(), "ABC");  //new Dog()跟"ABC"只用一次，所以可以省略宣告步驟，直接用他
	}
	
	//建構方法/建構子 Constructor
	@Test
	public void constructorTest() {
//		TaipeiBank bank = new TaipeiBank();
//		bank.setBranchTitle("Taipei");
//		bank.setUser("AAA");
//		bank.setBalance(5000);
		TaipeiBank bank = new TaipeiBank("Taipei", "AAA", 5000);
		System.out.println("分行名稱： " + bank.getBranchTitle());
		System.out.println("使用者： " + bank.getUser());
		System.out.println("餘額： " + bank.getBalance());
	}
	
	//static關鍵字
	//ctrl+左鍵點進下方兩個類別，有static的不用new，沒static的要new
	@Test
	public void test3() {
		//Random類別無static關鍵字，要先new才能用
		Random ran = new Random();
		int num1 = ran.nextInt(2, 99);
		//Math類別有static關鍵字，不用new就能用
		double num2 = Math.random();
	}
}
