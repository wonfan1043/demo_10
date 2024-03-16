package com.example.demo_10;

import java.util.Scanner;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;
import org.springframework.util.StringUtils;

public class StringTest {
	
	@Test //ctrl+shift+O → 快速import，單個時會自動import，多個時會出現視窗選擇
	public void stringTest1() {
		String str = new String("ABC"); //String()即為建構方法

		String str2 = "ABC"; //一般來說字串不會去new他，會直接給他值
		System.out.println(str == str2); 
		//答案為false，str有new為一個新的記憶體位址
        //str即使印出的也是ABC，因為比較時是記憶體位置
		
        String str3 = "ABC"; 
        System.out.println(str2 == str3); 
		//答案為true，用等號值皆塞值的時候，值會被塞到字串池String Pool
        //str2塞ABC時，ABC會進入到String Pool內
        //str3塞ABC時，會先到String Pool找看看有沒有ABC存在，有的話就會直接存取
        //即會先到String Pool找有沒有相同的字串值
		
        //一般在比較字串時不會用==
        //==用在比較：(1)八個基本資料形態 (2)記憶體位置
        //用在比較字串的值時，使用str.equals / str.equalsIgnorCase(忽略大小寫，會把所有字轉成大寫比較)
        System.out.println(str.equals(str2));
        System.out.println(str.equalsIgnoreCase(str3));
        System.out.println(str2.equals(str3));
        
        //中文字會轉成ASCII Code做比較
        //全形半形視為不同的所以都是false
        String str4 = "，";
        String str5 = ",";
        System.out.println(str4.equals(str5));
        System.out.println(str4.equalsIgnoreCase(str5));
	}
	
	@Test
	public void stringTest2() {
		String str = ""; //空字串
		String str2 = " "; //空白字串
		
		//isEmpty() → 判斷字串是否為空字串
		System.out.println(str.isEmpty()); //true
		System.out.println(str2.isEmpty()); //false，空白算一個長度
		
		System.out.println("==========");
		
		//isBlank() → 判斷字串是否為空字串或是內容值是否為全空白的空白字串
		System.out.println(str.isBlank()); //true
		System.out.println(str2.isBlank()); //true
	}
	
	//★當字串是null時無法使用以上兩個方法★
	@Test
	public void stringTest3() {
		DeadDog dog = new DeadDog();
		String name = dog.getName();
		System.out.println(name); //印出null
		System.out.println(name.isEmpty()); //報錯，在Java中只要是null.方法就會報錯：NullPointerException
		System.out.println(name.isBlank()); //null在Java內是一無所有的空，空字串是在記憶體位置內塞了一個空字串，所以還是可以印出東西
	}
	
	@Test
	public void stringTest3continue1(){
		DeadDog dog = new DeadDog();
		String name = dog.getName();
		System.out.println(name);
		if(name != null) {
			System.out.println(name.isBlank());
			return;
		}
		System.out.println("name is null");
	}
	
	@Test //常犯錯誤
	public void stringTest3continue2(){
		DeadDog dog = new DeadDog();
		String name = dog.getName(); //一開始就把null塞給name了
		System.out.println(name);
		dog.setName("AAA"); //這邊塞AAA給dog裡面的name而已，不是上方宣告的字串name
		name = dog.getName(); //要再取出一次dog裡面的name，否則還是印出name is null
		if(name != null) {
			System.out.println(name.isBlank());
			return;
		}
		System.out.println("name is null");
	}
	
	@Test
	public void stringUtilsTest() {
		DeadDog dog = new DeadDog();
		String name = dog.getName();
		System.out.println(name);
		if(name != null) {
			System.out.println(name.isBlank());
			return;
		}
		System.out.println("name is null");
		System.out.println("==========");
		//StringUtils.hasText()
		//當name==null或是name是空字串或全空白字串時為false，因為沒有文字(內容值)
		//判斷結果會跟isEmpty以及isBlank相反
		if(StringUtils.hasText(name)) {
			System.out.println("name");
			return;
		}
		System.out.println("name is null");
	}
	
	//「int indexOf(String str)」以及「int lastIndexOf(String str)」
	@Test
	public void stringSearch1() {
		String str = "ABCDACAD";
		System.out.println(str.indexOf("A")); //找到回傳位置
		System.out.println(str.lastIndexOf("A")); //找到回傳位置
		System.out.println(str.lastIndexOf("F")); //找不到時回傳-1
		System.out.println("==========");
		System.out.println(str.contains("A")); //找到回傳true
		System.out.println(str.contains("AB")); //找到回傳true
		System.out.println(str.contains("ABD")); //找不到回傳false
	}
	
	//「int indexOf(int ch)」以及「int lastIndexOf(int ch)」
	@Test
	public void stringSearch2() {
		String str = "ABCDACAD";
		System.out.println(str.indexOf(66)); 
		//int表示把字串轉成ASCII Code，66代表B所以會印出1
		System.out.println(str.lastIndexOf(65));
		//int表示把字串轉成ASCII Code，65代表A所以會印出6
	}
	
	// ■■■■■ 練習：小龍女 ■■■■■
	/* 神鵰俠侶是楊過與小龍女的故事,我不喜歡小龍女的甲仙,雖然小龍女在楊過眼中是清新脫俗
	   計算“小龍女”出現的次數
	   使用 indexOf 計算搜尋字段第一次出現的索引位置,
	   下一次搜尋的位置就從前一次索引值+搜尋字串長度開始 */
	
	@Test //自己第一次寫的，Noooooooooo good！
	public void stringTest4() {
		String str = "神鵰俠侶是楊過與小龍女的故事,我不喜歡小龍女的甲仙,雖然小龍女在楊過眼中是清新脫俗";
		int index = 0;
		int time = 0;
		while(index < str.length()) {
			int location = str.indexOf("小龍女", index);
//			if(location < 0) {
			if(location == str.lastIndexOf("小龍女")) {
				time += 1;
				break;
			}
			index = location + 3;
			time += 1;
		}
		System.out.println("小龍女共出現： " + time);
	}
	
	@Test //自己第二次寫的，還行？
	public void stringTest5() {
		String str = "神鵰俠侶是楊過與小龍女的故事,我不喜歡小龍女的甲仙,雖然小龍女在楊過眼中是清新脫俗";
		int location = str.indexOf("小龍女"); //小龍女的第一個位置
		int time = 0; //找到幾次
		while(location != -1) { //找不到就停止
			location = str.indexOf("小龍女", location + 3); //從前一次的小龍女後重新開始找
			time += 1; //每找到一次就加一
		}
		System.out.println("小龍女共出現： " + time); //印出找到幾次
	}
	
	@Test //老師解法一：不推薦
	public void stringTest6() {
		String str = "神鵰俠侶是楊過與小龍女的故事,我不喜歡小龍女的甲仙,雖然小龍女在楊過眼中是清新脫俗";
		String target = "小龍女";
		int count = 0;
		int startIndex = 0;
		while (true) {
			if(str.indexOf(target, startIndex) == -1){
				break;
			}
			startIndex = str.indexOf(target, startIndex) + target.length();
			count++;
		}
		System.out.println(count);
	}
	
	@Test //老師解法二：推薦
	public void stringTest7() {
		String str = "神鵰俠侶是楊過與小龍女的故事,我不喜歡小龍女的甲仙,雖然小龍女在楊過眼中是清新脫俗";
		String target = "小龍女";
		int count = 0;
		int startIndex = 0;
//		long t1 = System.currentTimeMillis();
		while (str.indexOf(target, startIndex) != -1) {
			startIndex = str.indexOf(target, startIndex) + target.length(); //不加3反而用target.length()是為了不要把程式碼寫死
			count++;
		}
//		long t2 = System.currentTimeMillis();
//		System.out.println(t2 - t1);
		//想算一段程式碼花了多少時間執行就用註解的部份去算
		System.out.println(count);
	}
	
	// ■■■■■ 擷取、取代、刪除字串的子字串或字元 ■■■■■
	@Test
	public void stringTest8() {
//		String str = "神鵰俠侶是楊過與小龍女的故事,我不喜歡小龍女的甲仙,雖然小龍女在楊過眼中是清新脫俗";
//		str.substring(8); //擷取後跟原本的字串是各自獨立的
//		System.out.println(str);
//		System.out.println(str.substring(8));
//		System.out.println(str.substring(0, 5));
//		System.out.println("==========");
//		str = str.replace("小龍女", "小魔女"); //要接回去str才印得出置換後的內容
//		System.out.println(str);
//		System.out.println("==========");
		String str2 = " 神鵰俠侶 是 楊過 與 小龍女 的 故事 ";
		str2 = str2.trim(); //去除頭尾的空白，中間的不會動
		System.out.println(str2);
		str2 = str2.replace(" ", ""); //用replace就可以取代所有空白(用空字串取代空白)
		System.out.println(str2);
	}
	
	// ■■■■■ 字串與數字的轉換 ■■■■■
	@Test
	public void stringTest9() {
		int a = 5;
		String stra = String.valueOf(a);
		System.out.println(stra.equals("5"));
		System.out.println("==========");
		Integer i = 5;
		String strb = i.toString();
		System.out.println(strb.equals("5"));
	}
	
	// ■■■■■ 字串的切割 ■■■■■
	@Test
	public void stringTest10() {
		String str = "I love Java!";
		String[] strArray = str.split(" ");
		for(int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		System.out.println("==========");
		String[] strArray2 = str.split("\\s"); //此處的 \\s 等同於有一個空白的字串
		for(int i = 0; i < strArray2.length; i++) {
			System.out.println(strArray2[i]);
		}
		System.out.println("==========");
		String[] strArray3 = str.split("love");
		for(int i = 0; i < strArray3.length; i++) {
			System.out.println(strArray3[i]);
		}
	}
	
	// ■■■■■ 練習：字串 ■■■■■
	/* 把一個字串 ABACADEF 的最後一個 A 換成 W */
	@Test //第一次想法：剪成ABACA跟DEF兩個字串，最後一個A換成W後再連接起來
	public void stringTest11() {
		String str = "ABACADEF";
		String before = "A";
		String after = "W";
		String last = "F";
		String str2 = str.replace(str.substring(str.lastIndexOf(before)), after);
//		System.out.println(str2);
		String str3 = str.substring(str.lastIndexOf(before)+1, str.lastIndexOf(last)+1);
//		System.out.println(str3);
//		System.out.println(str2.concat(str3)); //字串相接語法，但是用 + 就可以了
		System.out.println(str2 + str3);
	}
	
	@Test //第二次想法：把字串放進字串陣列中，更換A成W後再印出
	public void stringTest12() {
		String str = "ABACADEF";
		String[] str1 = new String[] {"A","B","A","C","A","D","E","F"};
//		String[] str1 = {"A","B","A","C","A","D","E","F"}; //其實new String[]可以不寫呵呵
		str1[str.lastIndexOf("A")] = "W";
		for(int i = 0; i < str.length(); i++) {
			System.out.printf(str1[i]);
		}
	}
	
	@Test //第三次想法：將字串複製進char陣列，更換A為W後再印出，這個不用自己打陣列的值
	public void stringTest13() {
		String str1 = "ABACADEF";
		int a = str1.lastIndexOf("A");
		char[] str2 = new char[str1.length()]; //宣告一個字元陣列char[]名為str2
		str1.getChars(0, str1.length(), str2, 0);;
//		System.out.println(str2); //此處為止已把str1的內容放進str2
		str2[a] = 'W';
		System.out.println(str2);
		}
	
	@Test //第四次想法：用spilt直接把String換成陣列，更換A為W後再印出，這個不用自己打陣列的值
	public void stringTest14() {
		String str1 = "ABACADEF";
		int a = str1.lastIndexOf("A");
		String[] str2= str1.split("");
		str2[a] = "W";
		for(int i = 0; i < str1.length(); i++) {
			System.out.printf(str2[i]);
		}
	}
	
	@Test //第五次想法：用toCharArray()直接把String換成陣列，更換A為W後再印出，這個不用自己打陣列的值
	public void stringTest15() {
		String str1 = "ABACADEF";
		int a = str1.lastIndexOf("A");
		char[] str2 = str1.toCharArray();
		str2[a] = 'W';
		System.out.println(str2);
	}
	
	@Test //老師解：用count跟迴圈去找A，這樣不管要第幾個A都行
	public void stringTest16() {
		String str1 = "ABACADEF";
		String target = "A";
		int count = 0;
		int startIndex = 0;
		while (str1.indexOf(target, startIndex) != -1) {
			startIndex = str1.indexOf(target, startIndex) + target.length();
			count++;
		}
	}
	
	// ■■■■■ StringBuffer與StringBuilder ■■■■■
	@Test
	public void stringBufferTest1() {
		String str = "ABCD";
		StringBuffer buf = new StringBuffer(str); //直接把初始值str帶入
//		buf.append("EFG");
//		buf.append("HIJ"); //這兩行可以像下面一樣寫在一起
		buf.append("EFG").append("HIJ");
		System.out.println(buf.toString()); //buffer不用再接回去buf，因為他是直接針對同一個記憶體位址的值去做修改
		buf.reverse(); //反轉字串
		System.out.println(buf.toString());
	}
	
	@Test
	public void stringBufferTest2() {
		StringBuffer buff = new StringBuffer("abab");
		System.out.println(buff.equals(buff.reverse())); //同一個記憶體位址所以是true
		System.out.println(buff == buff.reverse()); //同一個記憶體位址所以是true
		System.out.println(buff.toString().equals(buff.reverse().toString())); //buffer類要轉成字串，equals才會去比較內容值
		//「==」用在8個基本資料型態是比較內容值，用在類別是比較記憶體位置
		//「equals」用在字串是比較內容值，用在類別是比較記憶體位置
	}
	
	@Test
	public void stringBufferTest3() {
		Scanner scan = new Scanner(System.in);
		System.out.println("來個字串！");
		String input = scan.next();
//		StringBuffer buff = new StringBuffer(input); //只使用一次的話不用宣告變數去銜接
		if(input.equals(new StringBuffer(input).reverse().toString())) {
			System.out.println("迴文yo!");
		} else {
			System.out.println("非迴文la！");
		}
	}
	
	// ■■■■■ 實驗室 ■■■■■
	@Test
	public void yooo() {
//		String str1 = "        yo!";
//		String str2 = "\tyo!";
//		System.out.println(str1);
//		System.out.println(str2);
//		str1 = str1.toUpperCase();
//		System.out.println(str1);
//		System.out.println(str2.contains("y"));
//		
//		String str3 = "人生好難人生好累人生好煩!";
//		System.out.println(str3.substring(4));
//		System.out.println(str3.substring(4, 8));
		
//		String str = "0123456789";
//	    int a = Integer.parseInt(str);
////	    System.out.println(str);
//	    System.out.println(a);
//	    int b = Integer.valueOf(str);
//	    System.out.println(str);
//	    System.out.println(b);
	    
//		String str4 = "ABCD";
//	    String[] str4Array = str4.split(""); //切割str4後放進strArray陣列
//	    System.out.println(str4Array); //印出陣列str4Array的記憶體位址
//	    for(int i = 0; i < str4Array.length; i++) {
//	    	System.out.println(str4Array[i]); //印出陣列內容值
//	    }
//	    System.out.println(String.join("!", str4Array)); //用指定的字!串接後印出str4Array矩陣的內容值
	}
}