package www.lmj.test;

import java.util.ArrayList;
import java.util.LinkedList;

public class Demo3 {
 
	
	public void test1(){
//		ArrayList<String>  list1 = new ArrayList<String>();
//		LinkedList<String> list2 = new LinkedList<String>();
//		
//		list1.add("aaa");
//		list1.add("bbb");
//		list2.add("ccc");
//		list2.add("ddd");
//		
//		
//		long start1=System.currentTimeMillis();
//		for (int i = 0; i < 1000000; i++) {
//			String s="zhao"+i;
//			list1.add(s);
//			list1.set(10, s);//???
//			String res = list1.get(i);
//		}
//		list1.set(10, "10101010");
//		long end1= System.currentTimeMillis();
//		System.out.println("time:"+(end1-start1)+"ms");
//		
//		
//
//		long start2=System.currentTimeMillis();
//		for (int i = 0; i < 1000000; i++) {
//			String s="qiqi"+i;
//			list2.add(s);
//			list2.set(10, s);
//			String res = list2.get(i);
//		}
//		list1.set(10, "10101010");
//		long end2= System.currentTimeMillis();
//		System.out.println("time:"+(end2-start2)+"ms");
		}
//	
	
	
	/**
	 * Í¨¹ýLinkedList Ä£Äâ Stack
	 */
	      public void test2(){
	    	  LinkedList<String> list=new LinkedList<String>();
	    			  
//	    	  
//	    	  System.out.println(list);
	    	  list.push("aaa");
	    	  list.push("bbb");
	    	  list.push("ccc");
////	    	  System.out.println(list);
//	    	  showStack(list);
//	    	  System.out.println(list);
//	    	  
//	    	  
	    	  String s1 =  list.pop();
	    	  System.out.println("s:"+s1);
	    	  String s2 = list.pop();
	    	  System.out.println("s:"+s2);
	    	  String s3 = list.pop();
	    	  System.out.println("s:"+s2);
//	    	  
	    	  System.out.println(list);
	    	  
	    	  
	      }
           private void showStack(LinkedList<String> list) {
	
        	  
			for (int i = 0; i < list.size(); i++) {
				System.out.println("["+list.get(i)+"]");
			}
        	   
        	   
}
	        
	
}





