package com.example.demo_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class CollectionTest {
	
	@Test
	public void listTest1() {
		int a = 5;
		int [] b = new int[5]; //陣列，宣告長度後即固定
        b[0] = 2;
        DeadDog dog = new DeadDog();
		
		//List，<>裡面放資料型態，並且只能放類別、不能用8個基本資料型態，也就是要大寫
		//是一個介面interface而不是類別，介面無法new出來，只是用來定義方法，等同於一個空殼，類似定義一個方法但是沒有寫執行內容
		//因為無法new出interface，所以要用類別class去new他
		List<Integer> list = new ArrayList<>();
		list.add(5); //index = 0
		list.add(2); //index = 1
		list.add(3); //index = 2  以下依此類推
		//List：(1)有序，即按照輸入的順序放到對應的index裡面 (2)長度動態增長
	}
	
	@Test
	public void listTest2() {
		int[] a = {5,4,2,6,3}; //宣告陣列的同時給值，長度固定
		List<Integer> list = Arrays.asList(5,4,2,6,3); //宣告陣列的同時給值，長度固定
		//只要在Test底下，基本上asList都會import錯誤，要刪掉import org.assertj.core.util.Arrays然後import：import java.util.Arrays;
		List<Integer> list2 = List.of(5,4,2,6,3); //宣告陣列的同時給值，長度固定，且無法增刪
		List<Integer> List3 = new ArrayList<>(list); //宣告的同時給值，長度動態增刪
		List<Integer> List4 = new ArrayList<>(list2); //宣告的同時給值，長度動態增刪
		List<Integer> List31 = new ArrayList<>(Arrays.asList(5,4,2,6,3));
		List<Integer> List41 = new ArrayList<>(List.of(5,4,2,6,3));
		// ==========
		//for loop
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("==========");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("==========");
		//foreach迴圈
		for(int item : a) { //遍歷，a就是對象，item就是一個變數名稱(自定義)，代表a裡面的每個個體
			System.out.println(item);
		}
		System.out.println("==========");
		for(Integer item : list) {
			System.out.println(item);
		}
		System.out.println("==========");
		//lambda寫法
		list.forEach(item -> {
			System.out.println(item);
		});
	}
	
	@Test
	public void listTest3() {
		List<Integer> list = new ArrayList<>(Arrays.asList(1,9));
		int size = list.size();
		int number = 0;
		for(int i = 0; i < size; i++) {
			number = (int)(number + list.get(i) * Math.pow(10, size - i - 1 ));
		}
		System.out.println(number);
	}
	
	@Test
	public void listTest4() {
		List<Integer> list = new ArrayList<>(Arrays.asList(9,9,9,9));
		int size = list.size();
		int number = 0;
		for(int i = 0; i < size; i++) {
			number = (int)(number + list.get(i) * Math.pow(10, size - i - 1 ));
		}
		System.out.println(number);
	}		
	
	@Test
	public void listTest5() {
		List<Integer> list = new ArrayList<>(Arrays.asList(9,9,9,9));
		int size = list.size();
		int number = 0;
		for(Integer item : list) {
			number = number + (int)(item*Math.pow(10, size - 1));
			size --;
		}
		System.out.println(number);
		number+=1;
		System.out.println(number);
		String str = String.valueOf(number);
		System.out.println(Arrays.toString(str.split("")));
	}	
}
