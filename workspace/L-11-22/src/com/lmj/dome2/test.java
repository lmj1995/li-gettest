package com.lmj.dome2;

import com.lmj.dome2.Out3.In;


public class test {
public static void main(String[] args) {
//	 Out o=new Out();
	//�ⲿ��
	Out3 o=new Out3("123");
	System.out.println(o);
//	o.test1();
//	o.test3();
	
	
	//�ڲ���
	//In  i=new In();//�ڲ��಻��ֱ��new
//	In i=o.new In("321");
//	System.out.println(i);
//	i.test2();
//	i.test3();
	
	//�����ڲ���̬��
	
	Out.In b=new Out.In();
	b.testb1();
	
}
}
