package com.lmj.mian;
/**
 * 
 * 爷爷：  属性：   name   age   hobby
 *  
 *  方法：  起床  工作   娱乐   睡觉
 */
public class Grandpa {
     //属性
	private String name="";
	private int age=0;
	private String hobby="";
	
	// 构造
	public  Grandpa (String name, int age, String hobby){
		this.name=name;
		this.age=age;
		this.hobby=hobby;
	}	
	//方法
	public void getup(){
		System.out.println(getName()+"起床");
	}
	public void worke(){
		System.out.println(getName()+"遛鸟");
	}
	public void play(){
		System.out.println(getName()+"下棋");		
	}	
	public void sleep(){
		System.out.println(getName()+"晚安");
	}
	public  void infor(){
		System.out.println("name:"+getName()+"age:"+getAge()+"hobby:"+getHobby());
	}
	
	//get   set
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



