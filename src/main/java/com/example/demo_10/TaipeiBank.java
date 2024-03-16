package com.example.demo_10;

public class TaipeiBank {

	private String branchTitle;

	private String user;

	private int balance = 1000;
	
	// ――――― �愃cよ�k/�愃c�l Constructor ―――――
	//�w�]�愃cよ�k�G
	//�k槍 ＠ Source ＠ Generate Constructor using from Superclass ＠ Generate ＠ 漁狐�咳�
	public TaipeiBank() {
		super();
	}
	//�aΤ委柴�昆愃cよ�k�G
    //�k槍 ＠ Source ＠ Generate Constructor using Fields ＠ Τ紬�淵i�H�I随(�櫃茯k�沙櫚n随詳) ＠ Generate
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
		System.out.println("�s韓�e�l�B�G " + this.balance);
		if(amount < 0) {
			System.out.println("�s�J���Bぃ�o�悪t�I");
			return; //if鋭�z�SΤbreak�Iノreturn�@�唔溺隍^�h�A�]�N�O印�罔�return�阿逾Y候�X袴よ�k�A角�l魁だぃ印��
			        //�勁蟹困茯k械�i�Hノreturn:(1)void�]�穐Oぃ�^暁�肌劵H�i�H�u�greturn
					//					   (2)�筌L�pint汽旨�n�^暁�畑佐N旨�n�[�F�茵A�p�Wよ28�C��return balance
		}
		this.balance += amount;
		System.out.println("�s韓�畩l�B�G " + this.balance);
	}
	
	public void withdraw(int amount) {
		System.out.println("��韓�e�l�B�G " + this.balance);
		if(amount < 0) {
			System.out.println("���X���Bぃ�o�悪t�I");
			return;
		} 
		if(this.balance < amount) {
			System.out.println("�l�Bぃ━�I");
			return;
		}
		this.balance -= amount;
		System.out.println("��韓�畩l�B�G " + this.balance);
	}
	
	//�^暁�}
	public void buyDog(DeadDog dog, String str) {
		System.out.println(dog);
		System.out.println(str);
		System.out.println("=========================");
	}
	
	//�i怒Α委柴
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
