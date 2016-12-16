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
 * 字节流 
 */
	
	
	//一次输出
	public void myio()  {
		//路径
		String path = "G:/aaa";
		
		//File
		File file =new File(path);
		
		//输出
		try {
			FileOutputStream fos = new FileOutputStream(file);
			
			fos.close();
			
			System.out.println("输出完成");
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
		/**
		 * 一次输入
		 */
		public  void  myio1(){
			//路径
			String path ="G:/aa";
			//file
			File file =new File(path);
			//输入
			try {
				FileInputStream fis = new FileInputStream(file);
				//读数据
				System.out.println("available"+fis.available());
				
				byte[] b = new byte[fis.available()];
				fis.read(b);
				//收编数据
				str = new String(b);
				
				//关闭
				fis.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("str="+str);
		}
	
		/**
		 * 多次输出
		 */
		
//		public void myio2(){
//			//数据
//			String[] data={"你好"};
//			
//			//路径
//			String path ="G:/bbb";
//			//File
//			File file =new File(path);
//			//IO流
//		
//			try {
//				//创建流
//				FileOutputStream fos = new FileOutputStream(file);
//				//写出
//				for (String s : data) {
//					fos.write(s.getBytes());
//					System.out.println("写出:"+s);
//				}
//				//；关闭流
//				fos.close();
//				System.out.println("写出完成");
//			} catch (FileNotFoundException e) {
//				
//				e.printStackTrace();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//		/**
//		 * 多次输入
//		 */
//		
//		public void myio3(){
//			//数据
//			
//		
//			
//		}
}















