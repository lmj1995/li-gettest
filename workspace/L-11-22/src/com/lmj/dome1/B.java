package com.lmj.dome1;
/**
 * b继承a  但是b也抽象
 *
 */
public abstract class B extends A {
//属性
	private String name;
	//构造
	public B(String name){
		super(name);		
	}
	//方法
	public abstract void mul(int a,int b);
	
	public abstract void div(int a,int b);
}
