package com.lmj.demo1;

public class Cdome extends Bdome {
/**
 * ��������    java��ֻ֧�ֵ��̳�
 * ����   ����  ����  ���˷���
 */
	
	//����
	public int c=10;
	//����
	public Cdome(){
		
	}
    public Cdome(int c){
		this.c=c;
	} 
	//����
	public void mul(){
		c *=c;
		
		System.out.println("c="+c);
	}
}

