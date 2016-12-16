package com.lmj.mian;

import java.security.Principal;

import javax.swing.text.InternationalFormatter;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * 奶奶
 * 属性： name   age   hobby
 * 方法  起床  工作   娱乐 睡觉
 * 
 */
public class Grandma {
    //属性
	private String name="";
	private int age=0;
	private String hobby="";
	
	//构造
	public Grandma(String name,int age,String hobby){
		this.name=name;
		this.age=age;
		this.hobby=hobby;

	}
	//方法
	public void getup(){
		System.out.println(getName()+"起床了");
	}
	public void worke(){
		System.out.println(getName()+"做饭");
	}
	public void play(){
		System.out.println(getName()+"跳广场舞");
	}
	public void sleep(){
		System.out.println(getName()+"晚安");
	}
//自我介绍
	public void infor(){
		System.out.println("name:"+getName()+"age"+getAge()+"hobby"+getHobby()
				);
		
	}
	
	
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

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	
}
