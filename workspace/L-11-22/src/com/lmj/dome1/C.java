package com.lmj.dome1;
/**
 * c继承b，并且c会把b和a的所有方法进行输出
 *
 */
public class C  extends B{
   
	
	//构造
	public C(String name){
		super(name);
	}
	//方法

	@Override
	public void mul(int a, int b) {
		System.out.println(a+"*"+b+"="+(a*b));
		
	}

	@Override
	public void div(int a, int b) {
		
		System.out.println(a+"/"+b+"="+(a/b));
	}

	@Override
	public void add(int a, int b) {
		System.out.println(a+"+"+b+"="+(a+b));
	}

	@Override
	public void sub(int a, int b) {
		System.out.println(a+"-"+b+"="+(a-b));
	}
}
