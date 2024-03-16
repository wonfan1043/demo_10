package com.example.demo_10;

import org.junit.jupiter.api.Test;

public class InheritanceTest {
	
	@Test
	public void test1() {
		Animal ani = new Animal();
		System.out.println(ani.getName());
		ani.eat();
		System.out.println("==========");
		Dog dog = new Dog();
		System.out.println(dog.getName());
		dog.setName("Lily");
		System.out.println(dog.getName());
		System.out.println("==========");
		dog.eat();
	}
	
	@Test //�L�׫غc��k���S���gsuper�Anew�l���O�X�ӫ᳣�|���]�����O���غc��k�A�M��~�]�l���O���غc��k
	public void test2() {
		Dog dog = new Dog(); 
	}
	
	@Test
	public void test3() {
		Animal ani = new Animal();
//		Dog dog = new Dog();
		Animal dog = new Dog();
		ani.eat();
		dog.eat();
		
		//�b�~�Ӥ��i�Hnew�l���O�X�ӫ�Τ����O�ӱ��A�Y�g�� Animal dog = new Dog();
		//���O�Τ����O�ӱ����ܷ|�L�k�ϥ�dog�ۤv�W�����ݩʩM��k
		//�Y�ϨϥΤ����O�ӱ��A����ڤW���檺�٬O�l���O���u���s�w�qOverride�v�L����k
		
		System.out.println("==========");
		
		act(ani);
		act(dog);
	}
	
	private void act(Animal ani) {  //��Animal�o�����O�a�i�ӥh�I�seat
		ani.eat();
	}
	
	// ���������� �ΦW���O ����������
	
	@Test
	public void test4() {
		Animal ani = new Animal();
		act(ani); //ani�ŧi��u�ϥΤF�@��
		// ==========
		act(new Animal()); //�]���u�ϥΤ@���A�ҥH�i�H���ΰѼƱ��^�A��H�ΦW���O���覡���g�A�Y������new Animal()���ѼƱa�J
		
		//�n�B�G�i�H�٤U�@�ӥh�sani���O����Ŷ�
	}
	
	// ���������� �ΦW�������O ����������
	
	@Test 
	public void test5() {
		Dog dog = new Dog();
		dog.barking(); //�L�k�����ק�barking�����椺�e
		System.out.println("==========");
		Dog doggg = new Dog() {  //���F�ק�barking�����椺�e�A�bDog doggg = new Dog();����¦�W�[�W{}�ӭק��@���e
			@Override
			public void barking() {
				System.out.println("���b�f�f��!!!");
			}
		};
		doggg.barking();
	}
}
