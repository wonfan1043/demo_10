package com.example.demo_10;

// ――――― 寵�O�B紬�福Bよ�k�I ―――――

public class DeadDog {
	
	private String name;
	
	private String color;
	
	private int age = 3;

	public String getName() {  //�抗B��String�O���^暁��return name�左螫陶��A
		return name;
	}

	public void setName(String name) {  //voidぃ�^暁�函A芋セ�W�i�Hぃ�greturn�A�t�p�A弦ず�斡忍^�唔紺兌�(瑚�陶��A+怒柴/�e捷)
		this.name = name;  //�e�右�this.�梱讀]�O�]�亜A�Wよ委柴�墾W細�]�Oname�A�劵H旨�n囲だ�A�p�G委柴�W細�鶸��i�Hぃ�gthis.
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
		System.out.println(this.name + " タ�b採脹yooo�I�I�I");
	}

}
