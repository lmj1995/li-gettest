package com.lmj.dome1;
/**
 *
 *
 */
public class Boss extends Company {

	public Boss(String name, int age, String pose) {
		super(name, age, pose);
		
	}

	@Override
	public void work() {
		System.out.println(getName()+"����8Сʱ");
	}

	@Override
	public void play() {
		System.out.println(getName()+"��߶���");
	}

	@Override
	public void life() {
		System.out.println(getName()+"���������");
	}

	@Override
	public void family() {
		System.out.println(getName()+"�Լ�����");
	}

}
