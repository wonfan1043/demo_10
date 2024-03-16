package com.example.demo_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class CollectionTest {
	
	@Test
	public void listTest1() {
		int a = 5;
		int [] b = new int[5]; //�}�C�A�ŧi���׫�Y�T�w
        b[0] = 2;
        DeadDog dog = new DeadDog();
		
		//List�A<>�̭����ƫ��A�A�åB�u������O�B�����8�Ӱ򥻸�ƫ��A�A�]�N�O�n�j�g
		//�O�@�Ӥ���interface�Ӥ��O���O�A�����L�knew�X�ӡA�u�O�Ψөw�q��k�A���P��@�ӪŴߡA�����w�q�@�Ӥ�k���O�S���g���椺�e
		//�]���L�knew�Xinterface�A�ҥH�n�����Oclass�hnew�L
		List<Integer> list = new ArrayList<>();
		list.add(5); //index = 0
		list.add(2); //index = 1
		list.add(3); //index = 2  �H�U�̦�����
		//List�G(1)���ǡA�Y���ӿ�J�����ǩ�������index�̭� (2)���װʺA�W��
	}
	
	@Test
	public void listTest2() {
		int[] a = {5,4,2,6,3}; //�ŧi�}�C���P�ɵ��ȡA���שT�w
		List<Integer> list = Arrays.asList(5,4,2,6,3); //�ŧi�}�C���P�ɵ��ȡA���שT�w
		//�u�n�bTest���U�A�򥻤WasList���|import���~�A�n�R��import org.assertj.core.util.Arrays�M��import�Gimport java.util.Arrays;
		List<Integer> list2 = List.of(5,4,2,6,3); //�ŧi�}�C���P�ɵ��ȡA���שT�w�A�B�L�k�W�R
		List<Integer> List3 = new ArrayList<>(list); //�ŧi���P�ɵ��ȡA���װʺA�W�R
		List<Integer> List4 = new ArrayList<>(list2); //�ŧi���P�ɵ��ȡA���װʺA�W�R
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
		//foreach�j��
		for(int item : a) { //�M���Aa�N�O��H�Aitem�N�O�@���ܼƦW��(�۩w�q)�A�N��a�̭����C�ӭ���
			System.out.println(item);
		}
		System.out.println("==========");
		for(Integer item : list) {
			System.out.println(item);
		}
		System.out.println("==========");
		//lambda�g�k
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
