package com.lmj.demo1;
/**
 * ���� 
 *   ����  ����   ����   ��
 *
 */
public class Bdome extends Adome {

    //����
	public int b=10;
	
	//����
	public Bdome(){
		
	}
    public Bdome(int b){
		this.b=b;
	}
	//����
    public void sub(){
    	b--;
    	System.out.println("b="+b);
    }
	
	
}
