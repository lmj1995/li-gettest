package com.lmj.demo1;
/**
 * 子类 
 *   属性  构造   方法   减
 *
 */
public class Bdome extends Adome {

    //属性
	public int b=10;
	
	//构造
	public Bdome(){
		
	}
    public Bdome(int b){
		this.b=b;
	}
	//方法
    public void sub(){
    	b--;
    	System.out.println("b="+b);
    }
	
	
}
