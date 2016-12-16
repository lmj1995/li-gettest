package com.lmj.demo1;
/**
 * 父类
 * 属性   构造   方法
 * 
 */
public class Adome {
	//属性
	public  int a=10;
	//构造
	public Adome(){
		
	}
	public Adome(int a){
		this.a=a;
	}
	//方法
    public void add(){
    	a++;
    	System.out.println("a="+a);
    	
    	
    }
}
