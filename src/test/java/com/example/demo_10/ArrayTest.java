package com.example.demo_10;

import org.junit.jupiter.api.Test;

public class ArrayTest {
	
	/* ■■■■■ 陣列應用：計算一週的平均溫度 ■■■■■ */
	@Test 
	public void arrayTestTemparatureAvg1() {  //Test內一定是寫public方法或是甚麼都不寫，但是不能寫private，否則程式無法執行(因為權限：公開/私有)
		double avg = 0;
		double total = 0;
		double[] degree = new double[7];  //陣列！長度為7
		degree[0] = 25;
//		degree[0] = 22;	 //相同的索引值是後蓋前，所以0會變成22
		degree[1] = 22;
		degree[2] = 24;
		degree[3] = 20;
		degree[4] = 26;
		degree[5] = 21;
		degree[6] = 21;
		
		//陣列可以用for迴圈去跑，就不用一個一個寫了
		for(int i = 0; i < degree.length; i++) {  //遍歷，用degree.length抓陣列長度，就不用寫i<7
			total += degree[i];
		}
		avg = total/7;
		System.out.println("平均溫度： " + avg);
		
		/*
		<需要修改的地方>
		1. avg在很遠處就宣告，但在很後面才宣告，其實不會有甚麼問題但最好不要離這麼遠，所以可以把double avg = 0移到avg = total/7的上面
		2. avg其實也可以不用先給他0，然後其實可以直接合併寫成 double avg = total/7 來減少行數
		3. 宣告一個變數出來後若沒使用到他做運算(單純印字出來不算)，其實可以不宣告他
		4. total/7 是因為我們知道長度，如果不知道時就用degree.length抓陣列長度
		修改後版本請見下方arrayTestTemparatureAvg2
	    */
	}
	
	@Test
	public void arrayTestTemparatureAvg2() {
		double total = 0;
		double[] degree = new double[7];
		degree[0] = 25;
		degree[1] = 22;
		degree[2] = 24;
		degree[3] = 20;
		degree[4] = 26;
		degree[5] = 21;
		degree[6] = 21;
		for(int i = 0; i < degree.length; i++) {
			total += degree[i];
		}
		System.out.println("平均溫度： " + total/degree.length);
	}
	
	/* ★★★ ↓↓↓如何在宣告陣列時同時給值↓↓↓ ★★★ */
	
	@Test
	public void arrayTestTemparatureAvg3() {
		double total = 0;
		double[] degree = {25, 22, 24, 20, 26, 21, 21};  //宣告陣列時同時給值
		for(int i = 0; i < degree.length; i++) {  //遍歷
			total += degree[i];  //degree[i]會得到的是該索引位置的值
		}
		System.out.println("平均溫度： " + total/degree.length);
		System.out.println(degree);
	}
}
