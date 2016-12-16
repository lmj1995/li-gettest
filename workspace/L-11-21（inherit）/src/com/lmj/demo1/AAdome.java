package com.lmj.demo1;
/**
 * 研究方法的重写， 覆盖
 * 属性    构造  方法
 * 方法  加减
 */
public class AAdome {
 
	
	//属性
	public  int  a1=10;
	public  int   a2=9;
	//结构
	public AAdome(){
		
	}
    public AAdome(int a1, int a2){
		this.a1=a1;
		this.a2=a2;
	}
  //方法
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
