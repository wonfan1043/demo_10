package com.example.demo_10;

import java.util.Random;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class LoopTest {

	// for迴圈：語法以及基本概念
	@Test
	public void forLoopTest() {
		for (int i = 1; i <= 10; i++) {
//			System.out.println(i);	//印出1到10
			if (i == 5) {
//				break;		//跳出整個for迴圈
				continue; // 跳出當次的迴圈，即i=5時會不執行下方的印字、直接回到上方的i++
			}
			System.out.println(i);
		}
	}

	// for迴圈：計算1+2+3+....+10
	@Test
	public void forLoopTest2() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
//			int sum = 0;	//如果sum放在迴圈中，會重複宣告sum為0，即每次進入迴圈都重新把0塞給sum，所以最後的sum會變成10而非總和55
			sum = sum + i; // 也可以寫 sum += i;
		}
		System.out.println("1加到10的總和為： " + sum);
	}

	// 巢狀for迴圈：九九乘法表
	@Test
	public void netForLoopTest3() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
//				System.out.println(i + "*" + j + "=" + i*j);  //印出來超長很難看！！！寫起來也很難看！！！
//				System.out.printf("%d*%d=%d  ", i, j, i*j);  //印出來會因為有個位數和雙位數所以歪歪斜斜，難看！！！
				System.out.printf("%d*%d=%2d  ", i, j, i * j); // %2d代表有兩個位置可以放數字，如果是個位數那第一個位置會空白
			}
			System.out.println(""); // 在i跳下一個數字的時候換行
		}
	}

	// while迴圈：語法以及基本概念
	@Test // 計算1+2+3+....+10
	public void whileLoopTest() {
		int i = 1;
		int sum = 0;
		while (i <= 10) {
//			System.out.println(i);
			sum = sum + i; // 等同先做for迴圈的執行區塊
			i++; // 然後再進行迭代更換數值
		}
		System.out.println("1加到10的總和為： " + sum);
	}

	// 巢狀while迴圈：九九乘法表
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

	// 回家作業：用迴圈求1到10的奇數和
	@Test // 方法一
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
		System.out.println("1到10奇數的總和為： " + sum);
	}

	@Test // 方法二
	public void oddNumberSum2() {
		int i = 1;
		int sum = 0;
		while (i <= 10) {
			if (i % 2 == 1) {
				sum = sum + i;
			}
			i++;
		}
		System.out.println("1到10奇數的總和為： " + sum);
	}

	@Test // 方法三
	public void oddNumberSum3() {
		int i = 1;
		int sum = 0;
		do {
			if (i % 2 == 1) {
				sum = sum + i;
			}
			i++;
		} while (i <= 10);
		System.out.println("1到10奇數的總和為： " + sum);
	}

	@Test // 方法四
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

	// 標籤：名稱自訂義，以下命名為a
	@Test
	public void labelTest() {
		a: for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j == 5) {
//					break a;  //利用標籤a跳出標註有a的迴圈 → 直接不再執行
					continue a; // 跳出當次標註有a的迴圈 → 後續作業不再執行
				}
				System.out.printf("%d*%d=%2d  ", i, j, i * j);
			}
			System.out.println("");
		}
	}

	// 實作：猜數字遊戲 Java 06 P.25
	@Test // 自己寫的
	public void guessNumberTest() {
		Random ran = new Random();
		int target = ran.nextInt(2, 99); // 隨機產生介於大於等於2且小於99的數字，2 <= N < 99 (因為要排出1跟99)
		int lower = 1;
		int higher = 99;
		System.out.println(target);

		Scanner scan = new Scanner(System.in);
		System.out.printf("%d到%d之間來個數字！", lower, higher);

		int input = scan.nextInt();
		for (;;) {
			if (target == input) {
				System.out.println("神機妙算猜中了!");
				break;
			} else {
				if (input > target) {
					higher = input;
				} else {
					lower = input;
				}
				System.out.printf("亂猜！%d到%d之間再來個數！", lower, higher);
				input = scan.nextInt();

				while (input < lower || input > higher) {
					System.out.printf("賣亂！%d到%d之間！", lower, higher);
					input = scan.nextInt();
				}
			}
		}
	}

	@Test // 老師寫的
	public void guessNumberTestAnswer() {
		Random ran = new Random();
		int target = ran.nextInt(2, 99); // 隨機產生介於大於等於2且小於99的數字，2 <= N < 99 (因為要排出1跟99)
		int lower = 1;
		int higher = 99;
		System.out.println(target);
		Scanner scan = new Scanner(System.in);
		System.out.printf("%d到%d之間來個數字！\n", lower, higher);
		for (;;) {
			int input = scan.nextInt();
			if (target == input) {
				System.out.println("神機妙算猜中了!");
				break;
			}
			if (input < lower || input > higher) { // 這裡是防呆
				System.out.printf("%d到%d之間來個數字！\n", lower, higher);
				continue;
			}
			if (input > target) {
				higher = input; // 這裡是更新上限
			} else {
				lower = input; // 這裡是更新下限
			}
			System.out.printf("%d到%d之間來個數字！\n", lower, higher);
		}
	}

	// 練習：雞兔同籠
	// 35個頭跟100隻腳，請問雞跟兔各有幾隻
	@Test // 方法一
	public void chickenRabbitNum1() {
		int chicken = 0;
		int rabbit;
		while (true) {
			rabbit = 35 - chicken;
			if (2 * chicken + 4 * rabbit == 100) {
				System.out.printf("雞有 %2d 隻，兔有 %2d 隻", chicken, rabbit);
				break;
			}
			chicken += 1;
		}
	}

	@Test // 方法二
	public void chickenRabbitNum2() {
		int chicken;
		int rabbit = 0;
		while (true) {
			chicken = 35 - rabbit;
			if (2 * chicken + 4 * rabbit == 100) {
				System.out.printf("雞有 %2d 隻，兔有 %2d 隻", chicken, rabbit);
				break;
			}
			rabbit += 1;
		}
	}

	// ■■■■■ 練習題：找出100以內的質數並列印 ■■■■■
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

	@Test // 老師解
	public void test11() {
		a: for (int i = 2; i <= 100; i++) {
			if (i != 2 && i % 2 == 0) {
				continue;
			}
			for (int j = 3; j <= Math.sqrt(i); j++) { // 老師證實寫j+=2會更快(數字多時)
				if (i % j == 0) {
					continue a;
				}
			}
			System.out.println(i);
		}
	}

	// ■■■■■ 練習題：找出10以後的20個質數並列印 ■■■■■
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
	
	// ■■■■■ 練習題：確認輸入的數字是否為質數 ■■■■■
	@Test
	public void test3() {
		Scanner scan = new Scanner(System.in);
		System.out.println("來個數字！");
		int input = scan.nextInt();
		if ((input <= 0 || input == 1 || input % 2 == 0) && input != 2) {
			System.out.println(input + "不是質數!");
			return;
		}
		for (int i = 3; i <= Math.sqrt(input); i += 2) {
			if (input % i == 0) {
				System.out.println(input + "不是質數!");
				return;
			}
		}
		System.out.println(input + "是質數!");
	}
}
