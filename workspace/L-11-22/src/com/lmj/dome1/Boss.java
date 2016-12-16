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
		System.out.println(getName()+"工作8小时");
	}

	@Override
	public void play() {
		System.out.println(getName()+"打高尔夫");
	}

	@Override
	public void life() {
		System.out.println(getName()+"生活很休闲");
	}

	@Override
	public void family() {
		System.out.println(getName()+"自己独处");
	}

}
