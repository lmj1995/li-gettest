package com.lmj.test;

public class Test {
public static void main(String[] args) {
	
	Student s1 = new Student();
//	s1.student();
//	s1.infor();
	
	Dome1  d1= new Dome1();
//	d1.test1();
//	d1.test2();
//	d1.test3();
	Dome2 d2 = new Dome2();
//	d2.test1();
	try {
		d2.test2();
	} catch (NoSuchFieldException e) {
		e.printStackTrace();
	}
	d2.test3();
}
}
