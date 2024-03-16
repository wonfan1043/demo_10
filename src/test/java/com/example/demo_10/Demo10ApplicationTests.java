package com.example.demo_10;

import java.util.Scanner;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

//@SpringBootTest //加上此註解annotation表示會執行專案中 Application 的 main，一般來說都要加，只是現在main沒東西所以註解掉
public class Demo10ApplicationTests {

	@Test
	public void contextLoads() { // 方法method
		System.out.println(100); // 數字在Java內統稱數字int
		System.out.println("ABC"); // 文字在Java內統稱字串String，字串要用雙引號""框起來才正確，沒加就會出紅蚯蚓
		System.out.println("100"); // 用文字方式輸出後其實看不出來，但是在Java程式碼內要分清楚數字跟字串
		System.out.println('A'); // ABC用單引號''不行，因為只能一個字，只能寫A，即字元char

		// 以上為資料型態int、sting、char

		// 單行註解

		/*
		 * 多行註解
		 */

		/**
		 * 文件註解
		 */
	}

	@Test // 這個區塊跟上面的Test分開是不同的，但同樣都在class類別裡面 → 類別的有效範圍永遠是最大的
	public void dataTypeTest() { // dataTypeTest，多個單字的組合時，下一個單字的首字母要大寫，這樣比較好閱讀
		int x = 10; // 還沒寫進下方的print前會有黃蚯蚓(無害)，只是在提醒有寫出這個東西但沒有使用到，在下面的print寫入x後黃蚯蚓就會消失
		System.out.println(x);
		x = x + 5; // 程式碼的概念：把等號右邊的值賦予給等號左邊的變數，即將原本的x=10加上5後再賦予回左邊的x，所以最後的x是15
		System.out.println(x);
	}

	@Test
	public void printTest() {
		int hourlySalary = 200; // 變數一定要先宣告後才能夠使用，如果把int拿掉就會出錯
		System.out.println("時薪：" + hourlySalary); // 前方的字串叫做寫死，即固定的資料，也叫做hard code，字串跟其他資料的串接用+
		hourlySalary = 250; // 在同一個大括號裡面的相同變數名稱不能重複宣告，上方已經宣告為int，所以不能再宣告，直接重複使用即可
		System.out.println("時薪：" + hourlySalary);

		// -------我是分隔線-------

		System.out.printf("時薪： %d", hourlySalary); // %d是固定的寫法，佔位符號%表示占了一個位置，d代表資料型態是整數，所以後面要再帶入變數
		// System.out.printf("時薪： %d","ABC"); → 這個會印出「時薪：」然後就出錯，因為給了d但沒有給變數卻給了字串，另外程式只要出錯就會停下來，所以下方都印不出來
		System.out.printf("時薪： %d \n", hourlySalary); // 如果要換行就加入「 \n」
		System.out.printf("時薪： %s", "ABC"); // s代表資料型態是字串，所以後面要再帶入字串
	}
	
	@Test
	public void primitiveDataType() {
		byte w = 127;
		short q = 32767;
		int x = 2147483647; //預設資料型態 → 後面啥都不用加
		long y = 2147483648l; //非預設資料型態 → 後面要加大寫或小寫的L
		long z = 2147483648L; //同上
		float a = 5.0f; //非預設資料型態 → 後面要加大寫或小寫的F
		float b = 5.0F; //同上
		double c = 5.1; //預設資料型態 → 後面啥都不用加
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
		System.out.println(c); //a是整數、b是整數，所以在程式語言內a除以b必定是整數
		
		// -------我是分隔線-------
		
		double d = a/b;
		System.out.println(d); //同上，整數轉成浮點數，即把c的結果轉為浮點數，並不是像一般數學一樣的運算，因為程式語言是將右邊的結果賦予給左邊
		
		// -------我是分隔線-------
		
		System.out.println(a);
		System.out.println((double)a); //原本a是整數5，強制改成double的5.0
		double e = (double)a/b; //將數字做強制轉型：強制將a的資料型態從int改成double，不能轉型成String，只能轉成相關的資料型態
		System.out.println(e);
		
		// -------我是分隔線-------
		
		System.out.println(5 > 10); //比大小就是成立true或不成立false，所以會印出false
		boolean f = 5 > 10; //比大小就是成立true或不成立false，所以f為false
		System.out.println(f);
		boolean f1 = false; //直接定義f1就是false
		System.out.println(f1);
	}
	
	@Test
	public void test1() {
		//一/單元(Unary)運算子
		int i = 5;
		System.out.println(i);
		i++; //就是i=i+1，把i加一後回傳給i
		System.out.println(i);
		i--; //就是i=i-1，把i減一後回傳給i
		System.out.println(i);
		
		// -------我是分隔線-------
		
		//三元(Ternary)運算子
		int a = 5;
		int b = 10;
		//假設a>b，str顯示a比較大；反之b比較大
		String str = a > b ? "a比較大" : "b比較大";
		System.out.println(str);
		
		// -------我是分隔線-------
		
		//反向運算：根據運算解果把他反過來
		int x = 15;
		int y = 10;
		boolean boo = x > y;
		System.out.println(boo);
		System.out.println(!boo); //用!把結果強制翻轉
		boolean boo1 = !(x > y); //用!把結果強制翻轉
		System.out.println(boo1);
		System.out.println(!boo1); //用!把結果強制翻轉
	}
	
	@Test //比較i++與++i的差異
	public void test2() {
		int ii = 10;
		ii++;
		System.out.println(ii);
		int jj = 20;
		++jj;
		System.out.println(jj);
		
		// -------我是分隔線-------
		
		int i = 10;
		System.out.println("i = " + i);
		int j = i++*10; //i++ → 後置運算：先運算後才遞增/減，i先乘以10之後才對i加1
		System.out.println("i = " + i); //運算算完後加1所以是11
		System.out.println("j = " + j); //運算算完了就是i乘以10所以是100
		System.out.println("-------我是分隔線-------");
		int a = 10;
		System.out.println("a = " + a);
		int b = ++a*10; //++i → 前置運算：先遞增/減後才運算，先對a加一後才乘以10
		System.out.println("a = " + a); //運算前先加1所以是11
		System.out.println("b = " + b); //運算前加1了所以是11乘以10，因此結果為110
	}
	
	@Test //寬和窄化型態轉換
	public void test3() {
		byte b = 127;
		int i;
		i = b;
		System.out.println(i); //int可以容納127，所以會成功印出127
		System.out.println("-------我是分隔線-------");
		int j = 128;
		byte b1;
//		b1 = j; //byte只能容納到127，無法容納128所以會出現紅蚯蚓
		b1 = (byte)j; //強制轉型，不太會用到「數字上」的強制轉型
		System.out.println(b1); //強制轉型後變成負的
	}
	
	@Test //螢幕輸入
	public void inputTest() {
		Scanner scan = new Scanner(System.in);
		/*System.out.println("請輸入一個數字"); //這一行是提醒使用者要幹嘛
		int input = scan.nextInt(); //使用scan變數，用「.」去使用Scanner類別內的nextInt方法來取得輸入的整數
		System.out.println("你輸入的數字是" + input);
		// -------我是分隔線-------
		System.out.println("請輸入一個字串");
		String str = scan.next(); //取得輸入的字串
		System.out.println("你輸入的字串是 " + str);*/
		// -------我是分隔線-------
//		String str = scan.next(); //取得輸入的字串，如果輸入「ABC DEF」則指會取得ABC(空格前面)
		System.out.println("請輸入一個字串");
		String str1 = scan.nextLine(); //取得輸入的一整行文字，但只能自己單獨執行，必須要把177到183註解掉才能執行
		System.out.println("你輸入的是 " + str1);
		
		//通常只會scan.nextInt跟scan.next混著用，如果要連同scan.nextLine一起用要重新宣告一個Scanner
		
	}

}

