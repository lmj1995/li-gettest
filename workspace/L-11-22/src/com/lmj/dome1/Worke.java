package com.lmj.dome1;

public class Worke extends Company{

	public Worke(String name, int age, String pose) {
		super(name, age, pose);
	}

	@Override
	public void work() {
		System.out.println(getName()+"每天工作十几个小时");
	}

	@Override
	public void play() {
		System.out.println(getName()+"玩就是加班啊");
	}

	@Override
	public void life() {
		System.out.println(getName()+"每天生活的很忙碌");
	}

	@Override
	public void family() {
		System.out.println(getName()+"有一大家子人住在一起");
	}

}
