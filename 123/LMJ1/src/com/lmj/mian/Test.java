package com.lmj.mian;

public class Test {
    public static void main(String[] args) {
//		  Grandpa g1=new Grandpa("��:", 70, "����");
//		  g1. getup();
//		  g1. worke();
//		  g1. play();
//		  g1. sleep();
//		  g1. infor();
    	Grandpa pa = new Grandpa("��һ��", 67,"����");
		Grandma ma = new Grandma("ĸһ��", 70,"���㳡��");	
		Mum mo = new Mum("ĸ����", 38,"����");
		
    	Family fam=new Family(ma, pa, mo);
    	fam.daystart();
    	fam.day();
    	fam.infor();
    	
	}
    
}