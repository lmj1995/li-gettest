package com.lmj.demo2;
/**
 * ��������   
 * ����   ����  ����
 * ����   getup   play   work   sleep
 * ���಻����ͬ�÷����е�һ������  ����Ҫ��role
 * 
 */
public class Family {
//���� 
	public  String name="";
	public  int age=0;
	public String role="";
			
			
// ����
	public Family(){
		
	}
    public Family(String name, int age, String role){
		this.name=name;
		this.age=age;
		this.role=role;
		
	}
	//����
    public void getup(){
    	System.out.println(getName()+",����");
    }
    public void play(){
    	System.out.println(getName()+",���");
    }
    public void work(){
    	System.out.println(getName()+",������");
    }
    public void sleep(){
    	System.out.println(getName()+",˯����");
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
