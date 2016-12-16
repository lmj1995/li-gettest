package com.lmj.demo1;
/**
 * AA是父类   
 *    属性   方法   (乘除) 覆盖  重写
 *    父类中有个变量是a1=10.
 */
public class BBdome extends AAdome{
	//属性
  public int b1=10;
  public int b2=20;
    //方法
  public void mul(){
	  b1  *=100;
	  b2  *=20;
	  System.out.println("b1="+b1);
	  System.out.println("b2="+b2);
  }
  public void div(){
	  b1 /=2;
	  
	  b2 /=5;
	  System.out.println("b1="+b1);
	  System.out.println("b1="+b1);
  }
  //方法重写
  public void add(){
	  int b=b1+b2;
	  System.out.println("b="+b);
  }
  //测试父类属性
  public void test1(){
	  int x=super.a1;
	  int y=super.a2;
	  
	  System.out.println("x="+x);
	  System.out.println("y="+y);
	  
  }
  public void test2(){
	  super.add();
	  super.sub();	  
  }
}
