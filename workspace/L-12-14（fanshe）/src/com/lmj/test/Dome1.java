package com.lmj.test;
/**
 * 
 *反射机制
 *
 */
public class Dome1 {
/**
 * 在编译时知道student的属性  构造  方法
 * 
 */
	public void test1(){
		Student s = new Student("zhang",1);
		s.student();
		s.infor();
	}
	/**
	 * 通过反射机制知道类的信息
	 */
	public void test2(){
		//类的类对象
		Class c = Student.class;
		//通过class 对象获得类的信息
		System.out.println("name="+c.getName());
		System.out.println("SimpleName="+c.getSimpleName());
		System.out.println("Type="+c.getTypeName());
		System.out.println("package name=:"+c.getPackage().getName());
	}
	/**
	 * 通过获得class对象的几种方式
	 */
	public void test3(){
	//方法一   通过类的全名
	  Class c1 = null ;
	  try {
		c1=Class.forName("java.long.string");
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	//方法二  通过类.class属性
	Class c2 = Student.class;
	
	//方法三 通过getclass方法
	String s = "ni";
	Class c3  = s.getClass();
	System.out.println("c1 name="+c1.getSimpleName());
	System.out.println("c2 name="+c2.getSimpleName());
	System.out.println("c3 name="+c3.getSimpleName());
	}
}







