package com.lmj.dome2;
/**
 * 
 * 两个普通类  没有用静态
 * 两个普通类  但是第二个类 也就是内部类可以把第一个类里面的输出的值再次输出??
 */
public class Out3 {

	//属性
	private String name1;
	private int count=100;
	//构造
	public Out3(String name1){
		this.name1=name1;
	}
	//方法
	public String toString() {
		return "name1:" + name1;
	}
	public void test1(){
		System.out.println("这是我的第一个类");
	}
	public  void  test3(){
		count++;
		System.out.println("count="+count);
	}
	
	//第二个类
	public class In{
		//属性
		private String name2="";
		private int count=20;
		//构造
		
		public In(String name2){
			this.name2=name2;
		}
		//方法
		public String toString() {
			return "name2:" + name2;
		}
		public void test2(){
			System.out.println("这是我的第二个类");
		}
		public void test3(){
			count++;
			System.out.println("count="+count);
		}
		}
	}







