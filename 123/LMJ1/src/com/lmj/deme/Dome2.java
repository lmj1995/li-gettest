package com.lmj.deme;

public class Dome2 {
     
	public void test1(){
		System.out.println("hai");
		
				}
	
	
	public void test2(){
		
		int a = 10;
		int b = 20;
		int c =a + b;
		System.out.println("c=" +c);
	}
	public void test3(int a , int b){
		int c = a + b;
		System.out.println("c=" +c);
		
	}
	public int test4(int a,int b){
	    int c = a + b;
	    System.out.println("int");
	    
	    return c;
				
	}
	public double test5(double a, double b){
		return  a + b ;
	}
	public int test6 (float a, float b){
		System.out.println("float");
		return  (int)(a+b);
	}
	
	public int i= 0;
	public void test7(){
		 
		i++;
		System.out.println("i=" +i);
		if(i>=100){
			return;		
		}
		
		test7();
		
	}
}
