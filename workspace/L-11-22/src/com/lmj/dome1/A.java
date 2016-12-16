package com.lmj.dome1;
/**
 * 	抽象   继承   这是第一个父类
 * 属性    构造   方法  
 * 
 * 抽象可以在类和方法中用  但是不能在构造中用
 */

import org.omg.CORBA.PRIVATE_MEMBER;

//属性
	public abstract class  A{
		
	private  String name;
	//构造
	public A(String name){
		this.name=name;
	}
	//方法
	public abstract void add(int a,int b);
			
	public abstract void sub(int a,int b);
		
	
	}
	
	
	
	
	
	
