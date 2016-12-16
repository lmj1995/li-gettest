package com.lmj.dome2;
/**
 * 静态内部类
 * 类中有类，第一个类动态  第二个类静态
 * 静态类只能访问静态类
 */
public class Out {

	//属性
	private int a1=10;
	
	private static int a2=20;
	
	//构造(无参)
	public Out(){
		
	}
	
	//方法
	public void testa1(){
		
	}
	//第二个类  静止的类
	public static class In{
		//静止属性   
		private int b1=100;
		private int b2=200;
		
		//构造
		public In(){
			
		}
		public void testb1(){
			System.out.println("b1"+b1+",b2"+b2);
		}
		//a2是第一个类里面的静态类  也可以在第二个静态类中输出
		public void testb2(){
			a2++;
			System.out.println("a2="+a2);
		}
		
		
		
		
		
	}
}





