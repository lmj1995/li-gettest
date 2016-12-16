package com.lmg.demo;
/**
 * 
 * 直角三角形
 *定义了两个循环变量  i和j  其中i为外层循环变量，j为内层循环变量。
 */
public class sanjiaoxing {

	    public void sjx(){
	    	int i, j;
	    	for(i=1;i<=9;i++){
	    		for(j=1;j<=i;j++){
	    			System.out.print( "*");
	    		}
	    		
	    		System.out.print("\n");
	    	}
	    	
	    }
	public void  sjx1(){
		int i,  j;
		for(i=0;i<=9;i++){
			for(j=0;j<=9-i;j++){
				System.out.print("*");
			}
			System.out.print("\n");
			
		}
	}
	public void sjx3(){
		  int i,j;
		  for( i=1;i<=5;i++){
			  for( j=1;j<=i;j++){
				  System.out.print("@");
			  }
			  System.out.println("\n");
		  }
	}
	
}
