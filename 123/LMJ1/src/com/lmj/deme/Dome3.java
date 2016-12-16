package com.lmj.deme;

import java.util.Arrays;

public class Dome3 {
 
	/**
	 * 研究数组  格式  取值 类型  定义
	 * 
	 */
	public void test1(){
		
		int a =1;
		int[] arr ={1 ,2 , 3, 4, 5};
		System.out.println("a=:"+a);
		System.out.println("arr[0]=:"+arr[0]);
		System.out.println("arr[1]=:"+arr[1]);
		System.out.println("arr[2]=:"+arr[2]);
		System.out.println("arr[3]=:"+arr[3]);
		System.out.println("arr[4]=:"+arr[4]);
		
	}
	public void test2(){
		int[] arr = new int[5];
		
		System.out.println("arr=" +arr);
		System.out.println("arr"+ Arrays.toString(arr));
		
//		赋值
		        arr[0]=1;
				arr[1]=2;
				arr[2]=3;
				arr[3]=4;
				arr[4]=5;
	   System.out.println("arr"+ Arrays.toString(arr));
	   
	   
	   int a = arr[3];
	   
//	取值
	   System.out.println ("arr[3]:" +a);
//	   长度 
	   System.out.println ("len:" +arr.length);
	   
	}
	public void arr1(){
		int arr[]=new int[5];
		double arr1[]=new double[5];
		char arr2[]=new char[5];
		boolean arr3[]=new boolean[5];
		String arr4[]=new String[5];
		
		System.out.println("arr:" + Arrays.toString(arr));
		System.out.println("arr1:" + Arrays.toString(arr1));
		System.out.println("arr2:" + Arrays.toString(arr2));
		System.out.println("arr3:" + Arrays.toString(arr3));
		System.out.println("arr4:" + Arrays.toString(arr4));
		
//	  赋值
		arr[0]=100;
		arr1[1]=1.14;
		arr2[2]='A';
		arr3[3]=true;
		arr4[4]="hall";
		
		System.out.println("arr:" + Arrays.toString(arr));
		System.out.println("arr1:" + Arrays.toString(arr1));
		System.out.println("arr2:" + Arrays.toString(arr2));
		System.out.println("arr3:" + Arrays.toString(arr3));
		System.out.println("arr4:" + Arrays.toString(arr4));
		
	}
}
