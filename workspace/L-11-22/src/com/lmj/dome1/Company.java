package com.lmj.dome1;
/**
 * ��˾��һ�����ܹ�   boss  manage   worke������������
 * ����company������̳�
 *
 */
public abstract class Company {
	//����
	private String name;
	private int age;
	private String post;
	
	
	//����
	public Company(String name,int age, String pose){
		this.name=name;
		this.age=age;
		this.post=pose;
	}
	//����
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
