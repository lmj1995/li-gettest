package com.lmj.demo;
/**
 * 
 * 数组中  第一个和最后一个交换，第二个和倒数第二个交换；
 *
 */



public class Array1 {
        
	public void arr(){
		int[] arr={12,98,76,54,30};
//		arr.length赋予c；
	    int c=arr.length;
//	    交换的话只能交换一次  所以要给长度除以2
		for(int i=0; i<c/2;i++){
//			j比作一个容器   把arr[i]赋予j
			int j=arr[i];
//			c-i=1是长度减去第一次循环的再减去一就是下标相对的倒数的数；
			 arr [i]=arr[c-i-1];
//			 把已经得到的倒数的数赋予j  循环
			 arr[c-i-1]=j;
		}
//		再次循环上面所有条件；
		for(int i=0; i<c;i++){
//			得到结果
			System.out.print(arr[i]+" ");
		}
	}
}
       
        
        	
       









