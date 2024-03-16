package com.example.demo_10;

import java.util.Scanner;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;
import org.springframework.util.StringUtils;

public class StringTest {
	
	@Test //ctrl+shift+O �� �ֳtimport�A��Ӯɷ|�۰�import�A�h�Ӯɷ|�X�{�������
	public void stringTest1() {
		String str = new String("ABC"); //String()�Y���غc��k

		String str2 = "ABC"; //�@��ӻ��r�ꤣ�|�hnew�L�A�|�������L��
		System.out.println(str == str2); 
		//���׬�false�Astr��new���@�ӷs���O�����}
        //str�Y�ϦL�X���]�OABC�A�]������ɬO�O�����m
		
        String str3 = "ABC"; 
        System.out.println(str2 == str3); 
		//���׬�true�A�ε����ȬҶ�Ȫ��ɭԡA�ȷ|�Q���r���String Pool
        //str2��ABC�ɡAABC�|�i�J��String Pool��
        //str3��ABC�ɡA�|����String Pool��ݬݦ��S��ABC�s�b�A�����ܴN�|�����s��
        //�Y�|����String Pool�䦳�S���ۦP���r���
		
        //�@��b����r��ɤ��|��==
        //==�Φb����G(1)�K�Ӱ򥻸�ƧκA (2)�O�����m
        //�Φb����r�ꪺ�ȮɡA�ϥ�str.equals / str.equalsIgnorCase(�����j�p�g�A�|��Ҧ��r�ন�j�g���)
        System.out.println(str.equals(str2));
        System.out.println(str.equalsIgnoreCase(str3));
        System.out.println(str2.equals(str3));
        
        //����r�|�নASCII Code�����
        //���Υb�ε������P���ҥH���Ofalse
        String str4 = "�A";
        String str5 = ",";
        System.out.println(str4.equals(str5));
        System.out.println(str4.equalsIgnoreCase(str5));
	}
	
	@Test
	public void stringTest2() {
		String str = ""; //�Ŧr��
		String str2 = " "; //�ťզr��
		
		//isEmpty() �� �P�_�r��O�_���Ŧr��
		System.out.println(str.isEmpty()); //true
		System.out.println(str2.isEmpty()); //false�A�ťպ�@�Ӫ���
		
		System.out.println("==========");
		
		//isBlank() �� �P�_�r��O�_���Ŧr��άO���e�ȬO�_�����ťժ��ťզr��
		System.out.println(str.isBlank()); //true
		System.out.println(str2.isBlank()); //true
	}
	
	//����r��Onull�ɵL�k�ϥΥH�W��Ӥ�k��
	@Test
	public void stringTest3() {
		DeadDog dog = new DeadDog();
		String name = dog.getName();
		System.out.println(name); //�L�Xnull
		System.out.println(name.isEmpty()); //�����A�bJava���u�n�Onull.��k�N�|�����GNullPointerException
		System.out.println(name.isBlank()); //null�bJava���O�@�L�Ҧ����šA�Ŧr��O�b�O�����m����F�@�ӪŦr��A�ҥH�٬O�i�H�L�X�F��
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
	
	@Test //�`�ǿ��~
	public void stringTest3continue2(){
		DeadDog dog = new DeadDog();
		String name = dog.getName(); //�@�}�l�N��null�뵹name�F
		System.out.println(name);
		dog.setName("AAA"); //�o���AAA��dog�̭���name�Ӥw�A���O�W��ŧi���r��name
		name = dog.getName(); //�n�A���X�@��dog�̭���name�A�_�h�٬O�L�Xname is null
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
		//��name==null�άOname�O�Ŧr��Υ��ťզr��ɬ�false�A�]���S����r(���e��)
		//�P�_���G�|��isEmpty�H��isBlank�ۤ�
		if(StringUtils.hasText(name)) {
			System.out.println("name");
			return;
		}
		System.out.println("name is null");
	}
	
	//�uint indexOf(String str)�v�H�Ρuint lastIndexOf(String str)�v
	@Test
	public void stringSearch1() {
		String str = "ABCDACAD";
		System.out.println(str.indexOf("A")); //���^�Ǧ�m
		System.out.println(str.lastIndexOf("A")); //���^�Ǧ�m
		System.out.println(str.lastIndexOf("F")); //�䤣��ɦ^��-1
		System.out.println("==========");
		System.out.println(str.contains("A")); //���^��true
		System.out.println(str.contains("AB")); //���^��true
		System.out.println(str.contains("ABD")); //�䤣��^��false
	}
	
	//�uint indexOf(int ch)�v�H�Ρuint lastIndexOf(int ch)�v
	@Test
	public void stringSearch2() {
		String str = "ABCDACAD";
		System.out.println(str.indexOf(66)); 
		//int��ܧ�r���নASCII Code�A66�N��B�ҥH�|�L�X1
		System.out.println(str.lastIndexOf(65));
		//int��ܧ�r���নASCII Code�A65�N��A�ҥH�|�L�X6
	}
	
	// ���������� �m�ߡG�p�s�k ����������
	/* ����L�Q�O���L�P�p�s�k���G��,�ڤ����w�p�s�k���ҥP,���M�p�s�k�b���L�����O�M�s��U
	   �p�⡧�p�s�k���X�{������
	   �ϥ� indexOf �p��j�M�r�q�Ĥ@���X�{�����ަ�m,
	   �U�@���j�M����m�N�q�e�@�����ޭ�+�j�M�r����׶}�l */
	
	@Test //�ۤv�Ĥ@���g���ANoooooooooo good�I
	public void stringTest4() {
		String str = "����L�Q�O���L�P�p�s�k���G��,�ڤ����w�p�s�k���ҥP,���M�p�s�k�b���L�����O�M�s��U";
		int index = 0;
		int time = 0;
		while(index < str.length()) {
			int location = str.indexOf("�p�s�k", index);
//			if(location < 0) {
			if(location == str.lastIndexOf("�p�s�k")) {
				time += 1;
				break;
			}
			index = location + 3;
			time += 1;
		}
		System.out.println("�p�s�k�@�X�{�G " + time);
	}
	
	@Test //�ۤv�ĤG���g���A�٦�H
	public void stringTest5() {
		String str = "����L�Q�O���L�P�p�s�k���G��,�ڤ����w�p�s�k���ҥP,���M�p�s�k�b���L�����O�M�s��U";
		int location = str.indexOf("�p�s�k"); //�p�s�k���Ĥ@�Ӧ�m
		int time = 0; //���X��
		while(location != -1) { //�䤣��N����
			location = str.indexOf("�p�s�k", location + 3); //�q�e�@�����p�s�k�᭫�s�}�l��
			time += 1; //�C���@���N�[�@
		}
		System.out.println("�p�s�k�@�X�{�G " + time); //�L�X���X��
	}
	
	@Test //�Ѯv�Ѫk�@�G������
	public void stringTest6() {
		String str = "����L�Q�O���L�P�p�s�k���G��,�ڤ����w�p�s�k���ҥP,���M�p�s�k�b���L�����O�M�s��U";
		String target = "�p�s�k";
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
	
	@Test //�Ѯv�Ѫk�G�G����
	public void stringTest7() {
		String str = "����L�Q�O���L�P�p�s�k���G��,�ڤ����w�p�s�k���ҥP,���M�p�s�k�b���L�����O�M�s��U";
		String target = "�p�s�k";
		int count = 0;
		int startIndex = 0;
//		long t1 = System.currentTimeMillis();
		while (str.indexOf(target, startIndex) != -1) {
			startIndex = str.indexOf(target, startIndex) + target.length(); //���[3�Ϧӥ�target.length()�O���F���n��{���X�g��
			count++;
		}
//		long t2 = System.currentTimeMillis();
//		System.out.println(t2 - t1);
		//�Q��@�q�{���X��F�h�֮ɶ�����N�ε��Ѫ������h��
		System.out.println(count);
	}
	
	// ���������� �^���B���N�B�R���r�ꪺ�l�r��Φr�� ����������
	@Test
	public void stringTest8() {
//		String str = "����L�Q�O���L�P�p�s�k���G��,�ڤ����w�p�s�k���ҥP,���M�p�s�k�b���L�����O�M�s��U";
//		str.substring(8); //�^�����쥻���r��O�U�ۿW�ߪ�
//		System.out.println(str);
//		System.out.println(str.substring(8));
//		System.out.println(str.substring(0, 5));
//		System.out.println("==========");
//		str = str.replace("�p�s�k", "�p�]�k"); //�n���^�hstr�~�L�o�X�m���᪺���e
//		System.out.println(str);
//		System.out.println("==========");
		String str2 = " ����L�Q �O ���L �P �p�s�k �� �G�� ";
		str2 = str2.trim(); //�h���Y�����ťաA���������|��
		System.out.println(str2);
		str2 = str2.replace(" ", ""); //��replace�N�i�H���N�Ҧ��ť�(�ΪŦr����N�ť�)
		System.out.println(str2);
	}
	
	// ���������� �r��P�Ʀr���ഫ ����������
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
	
	// ���������� �r�ꪺ���� ����������
	@Test
	public void stringTest10() {
		String str = "I love Java!";
		String[] strArray = str.split(" ");
		for(int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		System.out.println("==========");
		String[] strArray2 = str.split("\\s"); //���B�� \\s ���P�󦳤@�Ӫťժ��r��
		for(int i = 0; i < strArray2.length; i++) {
			System.out.println(strArray2[i]);
		}
		System.out.println("==========");
		String[] strArray3 = str.split("love");
		for(int i = 0; i < strArray3.length; i++) {
			System.out.println(strArray3[i]);
		}
	}
	
	// ���������� �m�ߡG�r�� ����������
	/* ��@�Ӧr�� ABACADEF ���̫�@�� A ���� W */
	@Test //�Ĥ@���Q�k�G�Ŧ�ABACA��DEF��Ӧr��A�̫�@��A����W��A�s���_��
	public void stringTest11() {
		String str = "ABACADEF";
		String before = "A";
		String after = "W";
		String last = "F";
		String str2 = str.replace(str.substring(str.lastIndexOf(before)), after);
//		System.out.println(str2);
		String str3 = str.substring(str.lastIndexOf(before)+1, str.lastIndexOf(last)+1);
//		System.out.println(str3);
//		System.out.println(str2.concat(str3)); //�r��۱��y�k�A���O�� + �N�i�H�F
		System.out.println(str2 + str3);
	}
	
	@Test //�ĤG���Q�k�G��r���i�r��}�C���A��A��W��A�L�X
	public void stringTest12() {
		String str = "ABACADEF";
		String[] str1 = new String[] {"A","B","A","C","A","D","E","F"};
//		String[] str1 = {"A","B","A","C","A","D","E","F"}; //���new String[]�i�H���g����
		str1[str.lastIndexOf("A")] = "W";
		for(int i = 0; i < str.length(); i++) {
			System.out.printf(str1[i]);
		}
	}
	
	@Test //�ĤT���Q�k�G�N�r��ƻs�ichar�}�C�A��A��W��A�L�X�A�o�Ӥ��Φۤv���}�C����
	public void stringTest13() {
		String str1 = "ABACADEF";
		int a = str1.lastIndexOf("A");
		char[] str2 = new char[str1.length()]; //�ŧi�@�Ӧr���}�Cchar[]�W��str2
		str1.getChars(0, str1.length(), str2, 0);;
//		System.out.println(str2); //���B����w��str1�����e��istr2
		str2[a] = 'W';
		System.out.println(str2);
		}
	
	@Test //�ĥ|���Q�k�G��spilt������String�����}�C�A��A��W��A�L�X�A�o�Ӥ��Φۤv���}�C����
	public void stringTest14() {
		String str1 = "ABACADEF";
		int a = str1.lastIndexOf("A");
		String[] str2= str1.split("");
		str2[a] = "W";
		for(int i = 0; i < str1.length(); i++) {
			System.out.printf(str2[i]);
		}
	}
	
	@Test //�Ĥ����Q�k�G��toCharArray()������String�����}�C�A��A��W��A�L�X�A�o�Ӥ��Φۤv���}�C����
	public void stringTest15() {
		String str1 = "ABACADEF";
		int a = str1.lastIndexOf("A");
		char[] str2 = str1.toCharArray();
		str2[a] = 'W';
		System.out.println(str2);
	}
	
	@Test //�Ѯv�ѡG��count��j��h��A�A�o�ˤ��ޭn�ĴX��A����
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
	
	// ���������� StringBuffer�PStringBuilder ����������
	@Test
	public void stringBufferTest1() {
		String str = "ABCD";
		StringBuffer buf = new StringBuffer(str); //�������l��str�a�J
//		buf.append("EFG");
//		buf.append("HIJ"); //�o���i�H���U���@�˼g�b�@�_
		buf.append("EFG").append("HIJ");
		System.out.println(buf.toString()); //buffer���ΦA���^�hbuf�A�]���L�O�����w��P�@�ӰO�����}���ȥh���ק�
		buf.reverse(); //����r��
		System.out.println(buf.toString());
	}
	
	@Test
	public void stringBufferTest2() {
		StringBuffer buff = new StringBuffer("abab");
		System.out.println(buff.equals(buff.reverse())); //�P�@�ӰO�����}�ҥH�Otrue
		System.out.println(buff == buff.reverse()); //�P�@�ӰO�����}�ҥH�Otrue
		System.out.println(buff.toString().equals(buff.reverse().toString())); //buffer���n�ন�r��Aequals�~�|�h������e��
		//�u==�v�Φb8�Ӱ򥻸�ƫ��A�O������e�ȡA�Φb���O�O����O�����m
		//�uequals�v�Φb�r��O������e�ȡA�Φb���O�O����O�����m
	}
	
	@Test
	public void stringBufferTest3() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�ӭӦr��I");
		String input = scan.next();
//		StringBuffer buff = new StringBuffer(input); //�u�ϥΤ@�����ܤ��Ϋŧi�ܼƥh�α�
		if(input.equals(new StringBuffer(input).reverse().toString())) {
			System.out.println("�j��yo!");
		} else {
			System.out.println("�D�j��la�I");
		}
	}
	
	// ���������� ����� ����������
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
//		String str3 = "�H�ͦn���H�ͦn�֤H�ͦn��!";
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
//	    String[] str4Array = str4.split(""); //����str4���istrArray�}�C
//	    System.out.println(str4Array); //�L�X�}�Cstr4Array���O�����}
//	    for(int i = 0; i < str4Array.length; i++) {
//	    	System.out.println(str4Array[i]); //�L�X�}�C���e��
//	    }
//	    System.out.println(String.join("!", str4Array)); //�Ϋ��w���r!�걵��L�Xstr4Array�x�}�����e��
	}
}