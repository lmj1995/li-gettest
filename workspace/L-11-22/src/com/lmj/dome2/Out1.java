package com.lmj.dome2;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 *两个类都是动态  设定第一个类中一个变量为静态   看第二个类是否能够访问的到
 * 
 *
 */
public class Out1 {

	//属性
	//设置动态变量
	private int a1=10;
	//设置静态变量
	private static int a2=20;
	
	//构造
	public Out1(){
		
	}	
	//方法
	public void test(){
		
	}
	public  static void test2(){
		System.out.println("a2="+a2);
	}
	//第二个类   也是动态
	public class Out2{
		//属性（1）定义动态变量
		
		private int b1=100;
		//(2)定义静态变量
//		private static int b2=200;(内部类是动态  所以不能设置静态变量)
		
		//构造
		public Out2(){
			
		}
		//方法
		public void test3(){
			a1++;
			System.out.println("a1="+a1);
		}
		public void test4(){
			System.out.println("b1="+b1);
		}
		//a2是第一个类里面的静态变量 但是在第二个动态类也就是内部类里面可以输出
		public void test5(){
			a2++;
			System.out.println("a2="+a2);
		}
	}
}




