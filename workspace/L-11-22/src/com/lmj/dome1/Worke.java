package com.lmj.dome1;

public class Worke extends Company{

	public Worke(String name, int age, String pose) {
		super(name, age, pose);
	}

	@Override
	public void work() {
		System.out.println(getName()+"ÿ�칤��ʮ����Сʱ");
	}

	@Override
	public void play() {
		System.out.println(getName()+"����ǼӰడ");
	}

	@Override
	public void life() {
		System.out.println(getName()+"ÿ������ĺ�æµ");
	}

	@Override
	public void family() {
		System.out.println(getName()+"��һ�������ס��һ��");
	}

}
