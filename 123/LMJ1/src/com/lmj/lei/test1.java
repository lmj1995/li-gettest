package com.lmj.lei;



public class test1 {
	 public static void main(String[] args) {
//        Student s=new Student("����", "��", 20, 30, 60, 90);
//		 s.intro();
//		 s.total();
//		 s.avg();
//         
		 Student s =new Student("����", "��", 20, 30, 40, 90);
		 Student s1=new Student("����", "��", 20, 20, 60, 90);
		 Student s2=new Student("����", "��", 20, 30, 60, 90);
		 Student[] students={s,s1,s2};
		MyClass myClass=new MyClass("����", "wangwu", students );
//		myClass.intro();
		myClass.max();
//		myClass.min();
//		myClass.total();
//		myClass.sort();
//		
	}
}