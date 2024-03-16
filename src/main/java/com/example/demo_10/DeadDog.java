package com.example.demo_10;

// ■■■■■ 類別、屬性、方法！ ■■■■■

public class DeadDog {
	
	private String name;
	
	private String color;
	
	private int age = 3;

	public String getName() {  //此處的String是指回傳值return name的資料型態
		return name;
	}

	public void setName(String name) {  //void不回傳值，基本上可以不寫return，另小括號內為傳回來的參數(資料型態+變數/容器)
		this.name = name;  //前面有this.的原因是因為，上方參數的名稱也是name，所以需要區分，如果參數名稱更換可以不寫this.
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
		System.out.println(this.name + " 正在睡覺yooo！！！");
	}

}
