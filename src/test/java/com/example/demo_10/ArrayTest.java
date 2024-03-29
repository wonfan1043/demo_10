package com.example.demo_10;

import org.junit.jupiter.api.Test;

public class ArrayTest {
	
	/* ――――― �}�C棲ノ�G�p財�@�g�坤�А慧�� ――――― */
	@Test 
	public void arrayTestTemparatureAvg1() {  //Testず�@�w�O�gpublicよ�k�略O�道魍�ぃ�g�A���Oぃ�犲gprivate�A�_�h�{Α�L�k印��(�]�暗v���Gそ�}/�pΤ)
		double avg = 0;
		double total = 0;
		double[] degree = new double[7];  //�}�C�I���廳�7
		degree[0] = 25;
//		degree[0] = 22;	 //�昿P�痕舛洵八O�畛\�e�A�劵H0�|怒Θ22
		degree[1] = 22;
		degree[2] = 24;
		degree[3] = 20;
		degree[4] = 26;
		degree[5] = 21;
		degree[6] = 21;
		
		//�}�C�i�Hノfor�j育�h�]�A�Nぃノ�@�咾@�喙g�F
		for(int i = 0; i < degree.length; i++) {  //�M醸�Aノdegree.lengthъ�}�C���廖A�Nぃノ�gi<7
			total += degree[i];
		}
		avg = total/7;
		System.out.println("キА慧�廖G " + avg);
		
		/*
		<旨�n�廡鍼墾aよ>
		1. avg�b�椹軍B�N�擢i�A���b�棠甅韻~�擢i�A�箙蠅７|Τ�道魄歟D��殻�nぃ�n託�o賜桟�A�劵H�i�Hрdouble avg = 0仮��avg = total/7�困W��
		2. avg�箙蠅]�i�Hぃノ��宜�L0�A�M�瓱箙螢i�H�襲畿X�崋gΘ double avg = total/7 �售遒乢羲�
		3. �擢i�@�單楴謄X�哽甅Y�S�魯率譽L圧�B財(恰�側L�r�X�咾�財)�A�箙螢i�Hぃ�擢i�L
		4. total/7 �O�]�挨抬蜜捷D���廖A�p�Gぃ�捷D�百Nノdegree.lengthъ�}�C����
		�廡鍮瓷�セ出┌�UよarrayTestTemparatureAvg2
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
		System.out.println("キА慧�廖G " + total/degree.length);
	}
	
	/* 々々々 ＆＆＆�p�鵙b�擢i�}�C�髭P�謬広函�＆＆ 々々々 */
	
	@Test
	public void arrayTestTemparatureAvg3() {
		double total = 0;
		double[] degree = {25, 22, 24, 20, 26, 21, 21};  //�擢i�}�C�髭P�謬広�
		for(int i = 0; i < degree.length; i++) {  //�M醸
			total += degree[i];  //degree[i]�|�o�讓根O袴�舛洟豸m�梱�
		}
		System.out.println("キА慧�廖G " + total/degree.length);
		System.out.println(degree);
	}
}
