package com.example.demo_10;

public class TaipeiBank {

	private String branchTitle;

	private String user;

	private int balance = 1000;
	
	// ���������� �غc��k/�غc�l Constructor ����������
	//�w�]�غc��k�G
	//�k�� �� Source �� Generate Constructor using from Superclass �� Generate �� ���Ѯ���
	public TaipeiBank() {
		super();
	}
	//�a���Ѽƪ��غc��k�G
    //�k�� �� Source �� Generate Constructor using Fields �� ���ݩʥi�H�I��(�ݤ�k���ݭn���) �� Generate
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
		System.out.println("�s�ګe�l�B�G " + this.balance);
		if(amount < 0) {
			System.out.println("�s�J���B���o���t�I");
			return; //if�ԭz�S��break�I��return�@�ӪŮ�^�h�A�]�N�O�����return����Y���X�Ӥ�k�A�Ѿl����������
			        //�Ҧ�����k���i�H��return:(1)void�]���O���^�ǭȩҥH�i�H�u�greturn
					//					   (2)��L�pint���ݭn�^�ǭȪ��N�ݭn�[�F��A�p�W��28�C��return balance
		}
		this.balance += amount;
		System.out.println("�s�ګ�l�B�G " + this.balance);
	}
	
	public void withdraw(int amount) {
		System.out.println("���ګe�l�B�G " + this.balance);
		if(amount < 0) {
			System.out.println("���X���B���o���t�I");
			return;
		} 
		if(this.balance < amount) {
			System.out.println("�l�B�����I");
			return;
		}
		this.balance -= amount;
		System.out.println("���ګ�l�B�G " + this.balance);
	}
	
	//�^�ǧ}
	public void buyDog(DeadDog dog, String str) {
		System.out.println(dog);
		System.out.println(str);
		System.out.println("=========================");
	}
	
	//�i�ܦ��Ѽ�
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
