package com.lmj.lei;
/**
 * 老师
 * 属性：  姓名  年龄   爱好  科目
 * 
 *行为：  介绍  教学   作业
 */
public class Teacher {
//	属性
	private String name="张三";
	private String age="12";
	private String love="学习";
	private String subject="语文";
	
//	行为
	public void intro(){
		String info = "My name:" + name + "\nMy age:" + age + "\nMy love:" + love+"\nMysubject:"+subject;
		System.out.println(info);
	}
	
	public void teach(){
		System.out.println(name+":爱好:"+love);
	}
	public void subject(){
		System.out.println(name+":科目:"+subject);
	}
}
