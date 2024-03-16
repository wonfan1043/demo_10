package com.example.demo_10;

import org.junit.jupiter.api.Test;

public class ArrayTest {
	
	/* ���������� �}�C���ΡG�p��@�g�������ū� ���������� */
	@Test 
	public void arrayTestTemparatureAvg1() {  //Test���@�w�O�gpublic��k�άO�ƻ򳣤��g�A���O����gprivate�A�_�h�{���L�k����(�]���v���G���}/�p��)
		double avg = 0;
		double total = 0;
		double[] degree = new double[7];  //�}�C�I���׬�7
		degree[0] = 25;
//		degree[0] = 22;	 //�ۦP�����ޭȬO��\�e�A�ҥH0�|�ܦ�22
		degree[1] = 22;
		degree[2] = 24;
		degree[3] = 20;
		degree[4] = 26;
		degree[5] = 21;
		degree[6] = 21;
		
		//�}�C�i�H��for�j��h�]�A�N���Τ@�Ӥ@�Ӽg�F
		for(int i = 0; i < degree.length; i++) {  //�M���A��degree.length��}�C���סA�N���μgi<7
			total += degree[i];
		}
		avg = total/7;
		System.out.println("�����ūסG " + avg);
		
		/*
		<�ݭn�ק諸�a��>
		1. avg�b�ܻ��B�N�ŧi�A���b�ܫ᭱�~�ŧi�A��ꤣ�|���ƻ���D���̦n���n���o�򻷡A�ҥH�i�H��double avg = 0����avg = total/7���W��
		2. avg���]�i�H���Υ����L0�A�M����i�H�����X�ּg�� double avg = total/7 �Ӵ�֦��
		3. �ŧi�@���ܼƥX�ӫ�Y�S�ϥΨ�L���B��(��¦L�r�X�Ӥ���)�A���i�H���ŧi�L
		4. total/7 �O�]���ڭ̪��D���סA�p�G�����D�ɴN��degree.length��}�C����
		�ק�᪩���Ш��U��arrayTestTemparatureAvg2
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
		System.out.println("�����ūסG " + total/degree.length);
	}
	
	/* ������ �������p��b�ŧi�}�C�ɦP�ɵ��ȡ����� ������ */
	
	@Test
	public void arrayTestTemparatureAvg3() {
		double total = 0;
		double[] degree = {25, 22, 24, 20, 26, 21, 21};  //�ŧi�}�C�ɦP�ɵ���
		for(int i = 0; i < degree.length; i++) {  //�M��
			total += degree[i];  //degree[i]�|�o�쪺�O�ӯ��ަ�m����
		}
		System.out.println("�����ūסG " + total/degree.length);
		System.out.println(degree);
	}
}
