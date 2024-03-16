package com.example.demo_10;

public class TaipeiBank {

	private String branchTitle;

	private String user;

	private int balance = 1000;
	
	// ■■■■■ 建構方法/建構子 Constructor ■■■■■
	//預設建構方法：
	//右鍵 → Source → Generate Constructor using from Superclass → Generate → 註解拿掉
	public TaipeiBank() {
		super();
	}
	//帶有參數的建構方法：
    //右鍵 → Source → Generate Constructor using Fields → 有屬性可以點選(看方法的需要選擇) → Generate
	public TaipeiBank(String branchTitle, String user, int balance) {
		super();
		this.branchTitle = branchTitle;
		this.user = user;
		this.balance = balance;
	}

	
	
	public String getBranchTitle() {
		return branchTitle;
	}

	public void setBranchTitle(String branchTitle) {
		this.branchTitle = branchTitle;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void saving(int amount) {
		System.out.println("存款前餘額： " + this.balance);
		if(amount < 0) {
			System.out.println("存入金額不得為負！");
			return; //if敘述沒有break！用return一個空氣回去，也就是執行到return為止即跳出該方法，剩餘部分不執行
			        //所有的方法都可以用return:(1)void因為是不回傳值所以可以只寫return
					//					   (2)其他如int等需要回傳值的就需要加東西，如上方28列的return balance
		}
		this.balance += amount;
		System.out.println("存款後餘額： " + this.balance);
	}
	
	public void withdraw(int amount) {
		System.out.println("取款前餘額： " + this.balance);
		if(amount < 0) {
			System.out.println("取出金額不得為負！");
			return;
		} 
		if(this.balance < amount) {
			System.out.println("餘額不足！");
			return;
		}
		this.balance -= amount;
		System.out.println("取款後餘額： " + this.balance);
	}
	
	//回傳址
	public void buyDog(DeadDog dog, String str) {
		System.out.println(dog);
		System.out.println(str);
		System.out.println("=========================");
	}
	
	//可變式參數
	public void buyDog0(DeadDog dog, String str, int ...aaa) {
		System.out.println(dog);
		System.out.println(str);
		System.out.println("=========================");
		for(int i = 0; i < aaa.length; i++) {
			System.out.println(aaa[i]);
		}
	}
	
	public static void act(){
		
	}

}
