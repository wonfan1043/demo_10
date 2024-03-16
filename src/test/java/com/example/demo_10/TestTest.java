package com.example.demo_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

import ch.qos.logback.core.util.SystemInfo;

public class TestTest {

	@Test
	public void test1() {

		Random ran = new Random();
		List<Integer> number = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
		int index;
		int count = 0;
		String[] answer = new String[4];
		for (int i = 0; i < 4; i++) {
			answer[i] = String.valueOf(number.get(index = ran.nextInt(0, 10)));
			number.remove(index);
		}
		for (int j = 0; j < 4; j++) {
			System.out.printf(answer[j]);
		}
		System.out.println("");

		Scanner scan = new Scanner(System.in);
		for (;;) {
			System.out.println("0~9來4個數字且不重複!");
			String input1 = scan.next();
			String[] input2 = input1.split("");
			
			int a = 0;
			int b = 0;
			for(int x = 0; x < 4; x++) {
				if(answer[x].equals(input2[x]) ) {
					a++;
				} else {
					b++;
				}
			}
			System.out.println(a + "A" + b + "B");
			if(a == 4) {
				System.out.println("BINGO!!!");
				break;
			}
		}
	}

	@Test
	public void test2() {
		List<String> target = new ArrayList<>();
		Random random = new Random();
		for (;;) {
			String a = String.valueOf(random.nextInt(0, 10)); //產生的數字轉成字串，方便後續切割比較
			if (target.contains(a)) {
				continue;
			}
			target.add(a);
			if (target.size() == 4) {
				break;
			}
		}
		System.out.println(target);
		Scanner scan = new Scanner(System.in);
		for(;;) {
			int countA = 0;
			int countB = 0;
			System.out.println("來個數字!");
			String guess = scan.next();  //本來是nextInt，但為了要字串所以用next
			String[] array = guess.split("");
			for(int i = 0; i < array.length; i++) {
				if(!target.contains(array[i])) {
					continue;
				}
				if(target.get(i).equals(array[i])) {
					countA++;
				} else {
					countB++;
				}
			}
			System.out.println(countA + "A" + countB + "B");
			if(countA == 4) {
				System.out.println("BINGO!!!!!");
				break;
			}
		}
	}

}
