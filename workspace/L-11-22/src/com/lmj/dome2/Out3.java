package com.lmj.dome2;
/**
 * 
 * ������ͨ��  û���þ�̬
 * ������ͨ��  ���ǵڶ����� Ҳ�����ڲ�����԰ѵ�һ��������������ֵ�ٴ����??
 */
public class Out3 {

	//����
	private String name1;
	private int count=100;
	//����
	public Out3(String name1){
		this.name1=name1;
	}
	//����
	public String toString() {
		return "name1:" + name1;
	}
	public void test1(){
		System.out.println("�����ҵĵ�һ����");
	}
	public  void  test3(){
		count++;
		System.out.println("count="+count);
	}
	
	//�ڶ�����
	public class In{
		//����
		private String name2="";
		private int count=20;
		//����
		
		public In(String name2){
			this.name2=name2;
		}
		//����
		public String toString() {
			return "name2:" + name2;
		}
		public void test2(){
			System.out.println("�����ҵĵڶ�����");
		}
		public void test3(){
			count++;
			System.out.println("count="+count);
		}
		}
	}







