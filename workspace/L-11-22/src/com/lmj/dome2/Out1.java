package com.lmj.dome2;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 *�����඼�Ƕ�̬  �趨��һ������һ������Ϊ��̬   ���ڶ������Ƿ��ܹ����ʵĵ�
 * 
 *
 */
public class Out1 {

	//����
	//���ö�̬����
	private int a1=10;
	//���þ�̬����
	private static int a2=20;
	
	//����
	public Out1(){
		
	}	
	//����
	public void test(){
		
	}
	public  static void test2(){
		System.out.println("a2="+a2);
	}
	//�ڶ�����   Ҳ�Ƕ�̬
	public class Out2{
		//���ԣ�1�����嶯̬����
		
		private int b1=100;
		//(2)���徲̬����
//		private static int b2=200;(�ڲ����Ƕ�̬  ���Բ������þ�̬����)
		
		//����
		public Out2(){
			
		}
		//����
		public void test3(){
			a1++;
			System.out.println("a1="+a1);
		}
		public void test4(){
			System.out.println("b1="+b1);
		}
		//a2�ǵ�һ��������ľ�̬���� �����ڵڶ�����̬��Ҳ�����ڲ�������������
		public void test5(){
			a2++;
			System.out.println("a2="+a2);
		}
	}
}




