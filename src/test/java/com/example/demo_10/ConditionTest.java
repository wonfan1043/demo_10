package com.example.demo_10;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class ConditionTest {

	@Test // 剛寫完會有黃蚯蚓，要記得import
	public void ifTest() {

		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入年齡");
		int age = scan.nextInt(); // 取得輸入的年齡後放到age
		if (age < 20) {
			System.out.println("你的年齡太小，滿20歲才能買酒，滾！");
		}

	}

	@Test
	public void ifElseTest() {

		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入年齡");
		int age = scan.nextInt(); // 取得輸入的年齡後放到age
		if (age < 20) {
			System.out.println("你的年齡太小，滿20歲才能買酒，滾！");
		} else {
			System.out.println("呼乾啦！");
		}

		System.out.println("-------我是分隔線-------");

		// 改用三元運算子撰寫：假設a>b，str顯示a比較大；反之b比較大
		String str = age < 20 ? "你的年齡太小，滿20歲才能買酒，滾！" : "呼乾啦！";
		System.out.println(str);
	}

	// 練習題：計算麥當勞一週薪水
	// 基本時薪150，當週小於40小時則時薪為基本薪資的0.8倍，等於40小時則為基本時薪150
	@Test
	public void ifElseTestWeeklyPay() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入本週工時");
		int workingHour = scan.nextInt();
		if (workingHour < 40) {
			System.out.println("臭懶鬼，時薪以120計算。本週薪水： " + workingHour * 120);
		} else {
			System.out.println("臭社畜，時薪以150計算。本週薪水： " + workingHour * 150);
		}
	}

	@Test
	public void ifElseIfTestBreakFast() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入購買金額");
		int money = scan.nextInt();

		// 寫法一
//		if (money <= 50) {
//			System.out.println("窮鬼，只能吃三明治加豆漿呵！");
//		} else if (money <= 80) {
//			System.out.println("有點小錢了不起？可以吃漢堡加奶茶啦ㄌㄩㄝ!");
//		} else {
//			System.out.println("這麼有錢？隨便點啦！");
//		}

		// 寫法二
		// 如沒有寫money>50 → 因條件已符合<=80所以印漢堡奶茶，但應該印下面的三明治豆漿
		if (money > 50 && money <= 80) {
			System.out.println("有點小錢了不起？可以吃漢堡加奶茶啦ㄌㄩㄝ!");
		} else if (money <= 50) {
			System.out.println("窮鬼，只能吃三明治加豆漿呵！");
		} else {
			System.out.println("這麼有錢？隨便點啦！");
		}
	}

	// 練習題：票價
	// 票價收費標準100元，小於等於6歲或大於80歲打2折，7到12歲或60到79歲打5折
	@Test
	public void IfElseIfTestTicketPrice() {
		Scanner scan = new Scanner(System.in);
		System.out.println("貴庚？？？？？");
		int age = scan.nextInt();
		int price = 100;
		if (age <= 6 || age >= 80) {
			System.out.println("剛出生？快回天？票價： " + price * 0.2);
		} else if ((age >= 7 && age <= 12) || (age >= 60 && age <= 79)) {
			System.out.println("小屁還？LKK？票價： " + price * 0.5);
		} else {
			System.out.println("笑你沒折扣！票價： " + price);
		}

		// 其實age>=7跟age<=79可以拿掉，因為在其他條件式已經滿足
		// 可以參考PDF檔案Java_05的第14頁

		if (age <= 6 || age >= 80) {
			System.out.println("剛出生？快回天？票價： " + price * 0.2);
		} else if (age <= 12 || age >= 60) {
			System.out.println("小屁還？LKK？票價： " + price * 0.5);
		} else {
			System.out.println("笑你沒折扣！票價： " + price);
		}
	}

	@Test
	public void switchTest() {

		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入成績");
		int score = scan.nextInt();
		switch (score / 10) {
//			case 10:                      
//				System.out.println("A");	//要執行的事情跟case9相同，可以直接合併，也就是省略case10的行為跟break，如下
//				break;						//要執行的事情跟case9相同，可以直接合併，也就是省略case10的行為跟break，如下
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
