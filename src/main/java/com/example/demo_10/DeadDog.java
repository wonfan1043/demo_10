package com.example.demo_10;

// ���������� ���O�B�ݩʡB��k�I ����������

public class DeadDog {
	
	private String name;
	
	private String color;
	
	private int age = 3;

	public String getName() {  //���B��String�O���^�ǭ�return name����ƫ��A
		return name;
	}

	public void setName(String name) {  //void���^�ǭȡA�򥻤W�i�H���greturn�A�t�p�A�������Ǧ^�Ӫ��Ѽ�(��ƫ��A+�ܼ�/�e��)
		this.name = name;  //�e����this.����]�O�]���A�W��Ѽƪ��W�٤]�Oname�A�ҥH�ݭn�Ϥ��A�p�G�ѼƦW�٧󴫥i�H���gthis.
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void sleep() {
		System.out.println(this.name + " ���b��ıyooo�I�I�I");
	}

}
