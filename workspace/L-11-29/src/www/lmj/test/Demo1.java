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
 *���Ը�����ķ���
 * Collection�ӿ�
 * List�ӿ�
 * ArrayList��
 * LinkedList��
 * 
 * utility ����
 */
public class Demo1 {
  
	/**
	 * Collection   (�ӿ�)
	 */
	public void test1(){
		Collection<String> c=null;
		
		//��add
//		c.add("11");
//		System.out.println("c="+c);
//		c.addAll(c);
//		System.out.println("c="+c);
//		//ɾ    remove
//		c.remove("1");
//		System.out.println("c="+c);
//		c.removeAll(c);
//		System.out.println("c="+c);
		//�޸�   set  �޲�  get
		
		
		

		//		c.clear();//���
//		c.size();//��С
//		c.toArray(null);//����
//		c.isEmpty();//�յ�
//		c.equals(o);//��ȵ�
//		c.contains(o);//����  ����
	  }
	/**
	 * list�ӿ�    list����collection//����
	 */
	public void test2(){
		List list=null;
		//��
		
//		list.add(index, element);//������xx����������Ϊ����λ���ϡ�
		//ɾ
//		list.remove(0);
		//��
//		list.set(index, element);//������λ��Ϊ���Ķ��󻻳�xx
		//��
//		list.get(index);
		
		//����
//		list.size();
//		list.clear();
		//list�̳�collection	
		
		
//		list.indexOf(o);    ��
//		list.subList(fromIndex, toIndex);    ��
	}
	 /**
	  * Arraylist
	  * ��̬����
	  */
	 public void test3(){
//		 int []  arr={1,2,3,4,5,6};
//		 //Ĭ��ֵ
//		ArrayList<String> a1=new ArrayList<String>();
//		//��
//		a1.add("a");
//		//ɾ
//		a1.remove(2);
//		//��
//		a1.set(2, "4");
//		//��
//	    a1.get(2);
	   //Arraylist  ����ɾ���ģ��飬�������� 
		 
		 
				/**
				 * ���ʹ��
//				 */
//	
//		 ArrayList a2=new ArrayList();
//		 for (int i = 0; i <= 10; i++) {
//			a2.add("aaa"+i);
//		}
//		 System.out.println("a2="+a2);
//	
	//���帳ֵ
	    ArrayList<String>  a3=new ArrayList<String>();
	    for (int i =1; i <= 20; i++) {
			String s= "xixi"+i;
			a3.add(s);
		}
          System.out.println(a3);
//          //������ֵ
          String[] arr={"aaa","bbb","ccc","ddd","eee"};
          
          for (int i = 0; i < arr.length; i++) {
			String s=arr[i];
			a3.add(s);
		}
          System.out.println(a3);
          Component list;
		//����伯��(������)
//          List<String> a4=Arrays.asList(arr);
          //���ϱ�����(����)
//          String[] arr1=new String[list.size()];
          
          
          //���÷���
          a3.add("aaa");
          System.out.println("size:"+a3.size());
          System.out.println("empty:" + a3.isEmpty());
          System.out.println("contains:" + a3.contains("aaa"));
          System.out.println("get:" + a3.get(0));
          
	 } 
	 
	}

	
	











