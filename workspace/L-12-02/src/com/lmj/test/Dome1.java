package com.lmj.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Dome1 {
private String str;

/**
 * �ֽ��� 
 */
	
	
	//һ�����
	public void myio()  {
		//·��
		String path = "G:/aaa";
		
		//File
		File file =new File(path);
		
		//���
		try {
			FileOutputStream fos = new FileOutputStream(file);
			
			fos.close();
			
			System.out.println("������");
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
		/**
		 * һ������
		 */
		public  void  myio1(){
			//·��
			String path ="G:/aa";
			//file
			File file =new File(path);
			//����
			try {
				FileInputStream fis = new FileInputStream(file);
				//������
				System.out.println("available"+fis.available());
				
				byte[] b = new byte[fis.available()];
				fis.read(b);
				//�ձ�����
				str = new String(b);
				
				//�ر�
				fis.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("str="+str);
		}
	
		/**
		 * ������
		 */
		
//		public void myio2(){
//			//����
//			String[] data={"���"};
//			
//			//·��
//			String path ="G:/bbb";
//			//File
//			File file =new File(path);
//			//IO��
//		
//			try {
//				//������
//				FileOutputStream fos = new FileOutputStream(file);
//				//д��
//				for (String s : data) {
//					fos.write(s.getBytes());
//					System.out.println("д��:"+s);
//				}
//				//���ر���
//				fos.close();
//				System.out.println("д�����");
//			} catch (FileNotFoundException e) {
//				
//				e.printStackTrace();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//		/**
//		 * �������
//		 */
//		
//		public void myio3(){
//			//����
//			
//		
//			
//		}
}















