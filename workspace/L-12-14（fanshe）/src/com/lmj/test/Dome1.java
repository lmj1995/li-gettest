package com.lmj.test;
/**
 * 
 *�������
 *
 */
public class Dome1 {
/**
 * �ڱ���ʱ֪��student������  ����  ����
 * 
 */
	public void test1(){
		Student s = new Student("zhang",1);
		s.student();
		s.infor();
	}
	/**
	 * ͨ���������֪�������Ϣ
	 */
	public void test2(){
		//��������
		Class c = Student.class;
		//ͨ��class �����������Ϣ
		System.out.println("name="+c.getName());
		System.out.println("SimpleName="+c.getSimpleName());
		System.out.println("Type="+c.getTypeName());
		System.out.println("package name=:"+c.getPackage().getName());
	}
	/**
	 * ͨ�����class����ļ��ַ�ʽ
	 */
	public void test3(){
	//����һ   ͨ�����ȫ��
	  Class c1 = null ;
	  try {
		c1=Class.forName("java.long.string");
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	//������  ͨ����.class����
	Class c2 = Student.class;
	
	//������ ͨ��getclass����
	String s = "ni";
	Class c3  = s.getClass();
	System.out.println("c1 name="+c1.getSimpleName());
	System.out.println("c2 name="+c2.getSimpleName());
	System.out.println("c3 name="+c3.getSimpleName());
	}
}







