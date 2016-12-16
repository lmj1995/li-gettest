package com.lmg.demo;

public class Dome {
  
	   public void test1(int a,int b){
		   int c= 0;
		   
		   if(a==0){
			   System.out.println("c=" +c);
			   
			   return;			   
		   }  
		   if(b !=0){
			   c=a/b;
			   System.out.println("c=" +c);
		   }
	   }
	   
	   public void test2(int a, int b){
		    int c=0;
		    
		    if(b==0){
		    	System.out.println("除数不能为零");
		    }else{
		    	c=a/b;
		    	System.out.println("c="+c);		    	
		    }    	
		    }

	   public void test3(int income){
		   if(income==0){
		   System.out.println("参数有误");
		   return;
		   }
		   
		   String s="xxx";
		   if(income<=3000){
		    s="小市民";
		    } else  if(income<=5000){
		    s="小白领";
		    } else if (income<=8000){
		    s="白领";
		    } else if (income<=1000){
		    s="金领";
		    } else{
		    s="土豪";
		    }
		   System.out.println("收入:"+income+"阶层:"+s);
	   }	
	   public void test4(int gender,int age,int height ){
		   if(gender==1 && age<=30 && height>180){
			   System.out.println("合格");
		   }
	   }
	   public void test5(int a, int b, int c){
		   if(a<=0 || b<=0 || c<=0){
			  System.out.println("参数有误");
			   return;
//			   接下来写组成三角形的必要条件
		 
			   
			   
		   }
		   
	   }
}
