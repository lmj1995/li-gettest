package com.lmj.dome1;
/**
 * 公司是一个大总管   boss  manage   worke都是他的子类
 * 抽象化company让子类继承
 *
 */
public abstract class Company {
	//属性
	private String name;
	private int age;
	private String post;
	
	
	//构造
	public Company(String name,int age, String pose){
		this.name=name;
		this.age=age;
		this.post=pose;
	}
	//方法
	public abstract void work();
	public abstract void play();
	public abstract void life();
	public abstract void family();
	//getter  setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	

	
}
