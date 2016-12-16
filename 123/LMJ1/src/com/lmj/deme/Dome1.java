package com.lmj.deme;


       
	    /**
	     * 类 Dome1,测试++，--运算符。1.简单用法  2.放在前面。3.放在后面。。
	     * 
	     */
	public class Dome1 {
//		简单用法
		
		public void test1(){
			
//			a++,先运算再相加。
			
			int a = 10;
			    
		    a++;
			System.out.println("a++:" + a++);
			
//		    ++b，先加再运算。
		    int b=10;

		     System.out.println("++b:" + ++b );
		}
		
		public void test2(){
//			 a--,先运算再减
			int a = 10;
			a--;
			System.out.println("a--:"+ a--);
			
//			--b，先减再运算
			
			int b = 20;
			   
			    System.out.println("--b:"+ --b);
//						
		}
		public void test3(){
			
			int a = 10;
			int b = 20;
			
			int m=a>b ? a:b;
			    
			     System.out.println("m:" +m);
			     
		    int c = 59;
		    
		    boolean p=c >=60 ?  true : false;
		    
		       System.out.println("p:" +p);
		       
		       
		   int d =30;
		   
		   char L = d >= 80 ? 'A' : (d >= 60 ? 'B' : 'C');
		   
		        System.out.println("L:" +L);
		}
		
		
		
		
	}
	
	       
	       
	
	
	
	
	
	
	
	
	
	
	
	
