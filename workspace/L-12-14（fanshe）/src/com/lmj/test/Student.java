package com.lmj.test;
/**
 * 学生类
 *
 */
public class Student {
    //属性
	private String name = "";
	private int age = 0;
	//构造
	
	//无参
	public Student(){
		
	}
	//有参
	public Student(String name , int age){
		this.name="uknow";
		this.age=0;
		
	}
	//方法
	public void student(){
		System.out.println(name+"i  like computer");
	}
	public void infor(){
		System.out.println("name="+name+",age="+age);
	}
}






