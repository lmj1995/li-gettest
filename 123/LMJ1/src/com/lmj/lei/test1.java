package com.lmj.lei;



public class test1 {
	 public static void main(String[] args) {
//        Student s=new Student("张三", "男", 20, 30, 60, 90);
//		 s.intro();
//		 s.total();
//		 s.avg();
//         
		 Student s =new Student("张三", "男", 20, 30, 40, 90);
		 Student s1=new Student("李四", "男", 20, 20, 60, 90);
		 Student s2=new Student("王五", "男", 20, 30, 60, 90);
		 Student[] students={s,s1,s2};
		MyClass myClass=new MyClass("二班", "wangwu", students );
//		myClass.intro();
		myClass.max();
//		myClass.min();
//		myClass.total();
//		myClass.sort();
//		
	}
}
