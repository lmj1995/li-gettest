package com.lmj.dome2;
/**
 * ��̬�ڲ���
 * �������࣬��һ���ද̬  �ڶ����ྲ̬
 * ��̬��ֻ�ܷ��ʾ�̬��
 */
public class Out {

	//����
	private int a1=10;
	
	private static int a2=20;
	
	//����(�޲�)
	public Out(){
		
	}
	
	//����
	public void testa1(){
		
	}
	//�ڶ�����  ��ֹ����
	public static class In{
		//��ֹ����   
		private int b1=100;
		private int b2=200;
		
		//����
		public In(){
			
		}
		public void testb1(){
			System.out.println("b1"+b1+",b2"+b2);
		}
		//a2�ǵ�һ��������ľ�̬��  Ҳ�����ڵڶ�����̬�������
		public void testb2(){
			a2++;
			System.out.println("a2="+a2);
		}
		
		
		
		
		
	}
}





