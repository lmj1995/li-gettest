package com.lmj.dome2;

import com.lmj.dome2.Out3.In;


public class test {
public static void main(String[] args) {
//	 Out o=new Out();
	//外部类
	Out3 o=new Out3("123");
	System.out.println(o);
//	o.test1();
//	o.test3();
	
	
	//内部类
	//In  i=new In();//内部类不能直接new
//	In i=o.new In("321");
//	System.out.println(i);
//	i.test2();
//	i.test3();
	
	//测试内部静态类
	
	Out.In b=new Out.In();
	b.testb1();
	
}
}
