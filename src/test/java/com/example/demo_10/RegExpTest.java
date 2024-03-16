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
		System.out.println("電話拿來！ 格式：4碼-3碼-3碼");
		String input = scan.next();
		String pattern = "\\d\\d\\d\\d-\\d\\d\\d-\\d\\d\\d";
		// ↓ {}用來表示重複的字串，但只限於此符號之前的一個，這邊會是\\d，因為一個\\d是一組表示一個數字
		String pattern1 = "\\d{4}-\\d{3}-\\d{3}";
		// ↓ patter1是「-\\d{3}」重複了兩次，但「-」和「\\d{3}」屬於不同符號意思
	    //   如果寫 \\d{4}-\\d{3}{2} 會變成 4碼-3碼3碼
		//   解法：用小括號()將同一組的行為框起來，告訴程式這是一組的、要重複這些 → (-\\d{3})
		String pattern2 = "\\d{4}(-\\d{3}){2}";
//		System.out.println(pattern);
		if(input.matches(pattern)) {
			System.out.println("收到！噁心！滾！");
		} else {
			System.out.println("眼瞎？看不懂格式？");
		}
	}
	
	// 市內電話號碼比對
	// 區碼有 2 碼
	// 電話號碼 7~8 碼
	// 區碼和號碼有以下2種格式
	// 區碼有小括號,後面接連電話號碼,例如 (02)12345678
	// 區碼沒有小括號,但區碼和電話號碼用 – 連接,例如 02-1234567
	
	@Test
	public void test2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("電話！ (XX)XXXXXXXX或XX-XXXXXXX！");
		String input = scan.next();
		String pattern = "(\\(\\d{2}\\))||(\\d{2}-)\\d{7,8}";
		if(input.matches(pattern)) {
			System.out.println("GOOOOOD!!!");
		} else {
			System.out.println("格式錯誤!!!");
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
	
	// 市內電話號碼比對
	// 使用範圍符號 []
	// 區碼 0 開頭,總共會有 2~4 碼，剩下3碼不得為0
	// 電話號碼 7~8 碼
	// 區碼和號碼中間以 – 連接,例如 02-12345678
	
	@Test
	public void test4() {
		String pattern = "0[1-9]{1,3}-\\d{7,8}";
		Scanner scan = new Scanner(System.in);
		System.out.println("電話! 0開頭區碼共2至4碼，剩餘號碼7至8碼，中間以「-」隔開！");
		String input = scan.next();
		if(input.matches(pattern)) {
			System.out.println("GOOOOOD!!!");
		} else {
			System.out.println("格式錯誤!");
		}
	}
	
	@Test
	public void test5() {
		//「^」符號：
		//(1)用在中括號內表示排除，只能放在開頭，如[^ABC]表示排除 A 或 B 或 C
		//(2)用在中括號外表示開頭，例如^[ABV]，如^[ABC]表示必須以 A 或 B 或 C 開頭
		//(3)用在其他符號時也表示開頭的意思，如^A表示必須以A開頭
		//   → 「^」符號表示開頭，但是在中括號中時表示排除，但必需放在開頭
		String pattern = "^A.";
		String str1 = "AB";
		String str2 = "aB";
		System.out.println(str1.matches(pattern));
		System.out.println(str2.matches(pattern));
	}
	
	// 身份證字號檢查(Scanner 輸入)
	// 10碼
	// 第一個字為英文字母(大小寫皆可)
	// 英文字母後面接著的第一個數字只會是 1 或 2
	// 請用正規表達式完成

	// 完成後,請再寫個排除6都的英文字母(A、B、D、E、F、H)
	// 版本1,可用暴力破解
	// 版本2,請用特殊字元
	
	@Test
	public void test6() {
		Scanner scan = new Scanner(System.in);
		String pattern = "[\\w&&[^\\d_]][1-2]\\d{8}";
		System.out.println("身分證字號頂戴!");
		String input = scan.next();
		if(input.matches(pattern)) {
			System.out.println("個資GET!!!!!");
		} else {
			System.out.println("亂寫!");
		}
	}
	
	@Test
	public void tes7() {
		Scanner scan = new Scanner(System.in);
		String pattern = "[\\w&&[^ABDEFHabdefh\\d_]][1-2]\\d{8}";
		System.out.println("身分證字號頂戴!");
		String input = scan.next();
		if(input.matches(pattern)) {
			System.out.println("個資GET!!!!!");
		} else {
			System.out.println("六都人走開!!!!! or 格式NO亂寫!!!!!");
		}
		}
	
	@Test //老師解法
	public void test8() {
		String pattern1 = "[A-Za-z&&[^ABDEFHabdefh]][1-2]\\{8}";
		String pattern2 = "[^ABDEFHabdefh\\W\\d_][1-2]\\d{8}";
		String pattern3 = "[\\w&&[^\\d_ABDEFHabdefh]][1-2]\\d{8}"; //老師推薦！
		String pattern4 = "[CGI-Zcgi-z][1-2]\\d{8}";
	}
	
	@Test //亂寫的不要看!!!
	public void test9() {
		String pattern = "[\\W+\\w&&[^_]]{8,16}";
		String test = "0123456789";
		System.out.println(test.matches(pattern));
	}
}
