package com.lmj.dome1;

public class Manage extends Company{

	public Manage(String name, int age, String pose) {
		super(name, age, pose);
	}

	@Override
	public void work() {
		System.out.println(getName()+"每天工作九个小时");
	}

	@Override
	public void play() {
		System.out.println(getName()+"参加各种相亲");
	}

	@Override
	public void life() {
		System.out.println(getName()+"生活小资");
	}

	@Override
	public void family() {
		System.out.println(getName()+"与爸妈同住");
	}

}
