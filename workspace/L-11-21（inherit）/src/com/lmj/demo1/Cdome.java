package com.lmj.demo1;

public class Cdome extends Bdome {
/**
 * 还是子类    java中只支持单继承
 * 属性   构造  方法  （乘法）
 */
	
	//属性
	public int c=10;
	//构造
	public Cdome(){
		
	}
    public Cdome(int c){
		this.c=c;
	} 
	//方法
	public void mul(){
		c *=c;
		
		System.out.println("c="+c);
	}
}

