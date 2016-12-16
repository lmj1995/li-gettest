package com.lmj.demo2;
/**
 * 父类属性   
 * 属性   名字  年龄
 * 方法   getup   play   work   sleep
 * 子类不可能同用方法中的一个条件  所以要加role
 * 
 */
public class Family {
//属性 
	public  String name="";
	public  int age=0;
	public String role="";
			
			
// 构造
	public Family(){
		
	}
    public Family(String name, int age, String role){
		this.name=name;
		this.age=age;
		this.role=role;
		
	}
	//方法
    public void getup(){
    	System.out.println(getName()+",起床了");
    }
    public void play(){
    	System.out.println(getName()+",玩吧");
    }
    public void work(){
    	System.out.println(getName()+",工作吧");
    }
    public void sleep(){
    	System.out.println(getName()+",睡觉了");
    }
    //getter   setter
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
    
}
