package com.lmj.dome1;
/**
 * 	����   �̳�   ���ǵ�һ������
 * ����    ����   ����  
 * 
 * �����������ͷ�������  ���ǲ����ڹ�������
 */

import org.omg.CORBA.PRIVATE_MEMBER;

//����
	public abstract class  A{
		
	private  String name;
	//����
	public A(String name){
		this.name=name;
	}
	//����
	public abstract void add(int a,int b);
			
	public abstract void sub(int a,int b);
		
	
	}
	
	
	
	
	
	
