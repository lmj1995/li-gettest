package com.lmj.dome1;

public class Manage extends Company{

	public Manage(String name, int age, String pose) {
		super(name, age, pose);
	}

	@Override
	public void work() {
		System.out.println(getName()+"ÿ�칤���Ÿ�Сʱ");
	}

	@Override
	public void play() {
		System.out.println(getName()+"�μӸ�������");
	}

	@Override
	public void life() {
		System.out.println(getName()+"����С��");
	}

	@Override
	public void family() {
		System.out.println(getName()+"�����ͬס");
	}

}
