package com.lmj.demo1;
/**
 * �о���������д�� ����
 * ����    ����  ����
 * ����  �Ӽ�
 */
public class AAdome {
 
	
	//����
	public  int  a1=10;
	public  int   a2=9;
	//�ṹ
	public AAdome(){
		
	}
    public AAdome(int a1, int a2){
		this.a1=a1;
		this.a2=a2;
	}
  //����
    public void add(){
      a1++;
      a2++;
      System.out.println("a1="+a1);
      System.out.println("a2="+a2);
    	
    }
    public void sub(){
        a1--;
        a2--;
        System.out.println("a1="+a1);
        System.out.println("a2="+a2);
      	
      }
}
