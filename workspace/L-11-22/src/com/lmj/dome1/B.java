package com.lmj.dome1;
/**
 * b�̳�a  ����bҲ����
 *
 */
public abstract class B extends A {
//����
	private String name;
	//����
	public B(String name){
		super(name);		
	}
	//����
	public abstract void mul(int a,int b);
	
	public abstract void div(int a,int b);
}
