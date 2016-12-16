package www.lmj.test;

import java.awt.Component;
import java.awt.List;
import java.awt.event.FocusAdapter;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Collection;

import javax.swing.Spring;
import javax.swing.text.StyledEditorKit.ForegroundAction;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 *测试各个类的方法
 * Collection接口
 * List接口
 * ArrayList类
 * LinkedList类
 * 
 * utility 工具
 */
public class Demo1 {
  
	/**
	 * Collection   (接口)
	 */
	public void test1(){
		Collection<String> c=null;
		
		//增add
//		c.add("11");
//		System.out.println("c="+c);
//		c.addAll(c);
//		System.out.println("c="+c);
//		//删    remove
//		c.remove("1");
//		System.out.println("c="+c);
//		c.removeAll(c);
//		System.out.println("c="+c);
		//无改   set  无查  get
		
		
		

		//		c.clear();//清除
//		c.size();//大小
//		c.toArray(null);//数组
//		c.isEmpty();//空的
//		c.equals(o);//相等的
//		c.contains(o);//包含  容纳
	  }
	/**
	 * list接口    list属于collection//索引
	 */
	public void test2(){
		List list=null;
		//增
		
//		list.add(index, element);//将对象xx索引到对象为几的位置上。
		//删
//		list.remove(0);
		//改
//		list.set(index, element);//将索引位置为几的对象换成xx
		//查
//		list.get(index);
		
		//其他
//		list.size();
//		list.clear();
		//list继承collection	
		
		
//		list.indexOf(o);    ？
//		list.subList(fromIndex, toIndex);    ？
	}
	 /**
	  * Arraylist
	  * 动态数组
	  */
	 public void test3(){
//		 int []  arr={1,2,3,4,5,6};
//		 //默认值
//		ArrayList<String> a1=new ArrayList<String>();
//		//增
//		a1.add("a");
//		//删
//		a1.remove(2);
//		//改
//		a1.set(2, "4");
//		//查
//	    a1.get(2);
	   //Arraylist  增，删，改，查，方法都有 
		 
		 
				/**
				 * 如何使用
//				 */
//	
//		 ArrayList a2=new ArrayList();
//		 for (int i = 0; i <= 10; i++) {
//			a2.add("aaa"+i);
//		}
//		 System.out.println("a2="+a2);
//	
	//整体赋值
	    ArrayList<String>  a3=new ArrayList<String>();
	    for (int i =1; i <= 20; i++) {
			String s= "xixi"+i;
			a3.add(s);
		}
          System.out.println(a3);
//          //挨个赋值
          String[] arr={"aaa","bbb","ccc","ddd","eee"};
          
          for (int i = 0; i < arr.length; i++) {
			String s=arr[i];
			a3.add(s);
		}
          System.out.println(a3);
          Component list;
		//数组变集合(不明白)
//          List<String> a4=Arrays.asList(arr);
          //集合变数组(不懂)
//          String[] arr1=new String[list.size()];
          
          
          //常用方法
          a3.add("aaa");
          System.out.println("size:"+a3.size());
          System.out.println("empty:" + a3.isEmpty());
          System.out.println("contains:" + a3.contains("aaa"));
          System.out.println("get:" + a3.get(0));
          
	 } 
	 
	}

	
	











