package www.lmj.dome3;

import www.lmj.dome3.Baby.Lei;

/**
 *����   ����д��    ����д������    ����д�ӿ�
 *
 */
public class Baby {

	public class Chou {

	}
	public class Lei {

	}
	//����
	private String name="";
	
	//����
	public Baby(String name){
		this.name=name;
	}
	//����
	public void eat(){
		System.out.println(name+"�Զ���");
	}
	//���ǵڶ�����
//	class Lei{
//		//����
//		private int age=0;
//		//����
//		public Lei(int age){
//			this.age=age;
//		}
//		//����
//		public void  play(){
//			System.out.println(name+"�����ڲ���������");
//		}
//	}
	//����һ��������
//	public   abstract  class Chou{
//		//����
//		private String name="";
//		//����
//		public Chou(String name){
//			this.name=name;
//		}
//		//����
//		public abstract void Test();
//		}
	//����һ���ӿ�
	public interface USB1{
		void test1();
	}
	
	
	
	
	
	
}
