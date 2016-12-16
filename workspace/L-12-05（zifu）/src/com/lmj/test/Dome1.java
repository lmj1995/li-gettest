package com.lmj.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 *字符流
 * 
 *
 */
public class Dome1 {
/**
 * 研究 reader   writer
 * 
 */
	
	
	     public  void  myio(){
//	    	 Reader reader = null;
//	    	  reader.read(cbuf, off, len);
//	    	  reader.close();//关闭
//	    	  reader.reset();//重置
//	    	  reader.equals(reader);//同样的
//	    	Writer writer  = null;
//	    	  writer.write(str);
//	    	  writer.write(cbuf, off, len);
//	    	  writer.close();
//	    	  writer.flush();
	     }
	     
              public void myio1(){
            	  char ch = '我';
            	  //路径
            	  String path ="G:/aaa";
            	  //文件
            	  File file = new File(path);
            	  //io
            	try {
					FileWriter writer = new FileWriter(file);
					
					writer.write(ch);
					
					writer.close();
					
					System.out.println("输出完成");
				} catch (IOException e) {
					e.printStackTrace();
				}
              }	     
	     
              
              /**
               * 输出多个字符
               */
              
              public void myio2(){
            	  char[] cha = {'我','要','睡','觉'};
            	  //路径
            	  String path = "G:/bbb";
            	  //file
            	  File file = new File(path);
            	  //io
            	  try {
					FileWriter writer = new FileWriter(file);
					writer.write(cha);
					System.out.println("输出完成");
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
            	  
              }
              /**
               * 输出一串字符
               */
              
              public void myio3(){
            	  
            	  String str = "好困，想睡觉";
            	  
            	  String path = "G:/sleep";
            	  
            	  File file = new File(path);
            	  
            	  try {
					FileWriter writer = new FileWriter(file);
					
					writer.write(str);
					
					System.out.println("输出完成");
					writer.close();
            		  
            		  
				} catch (Exception e) {
					// TODO: handle exception
				}
            	  
              }
              
              /**
               * 输入一个字符
               */
              
              public void myio4(){
            	  //缓冲区
            	 char ch ='0';
            	  //路径
            	 String path = "G/aaa";
            	 //file
            	 File file = new File(path);
            	 //io
            	
            	 
            	 try {
					FileReader reader = new FileReader(file);
					
					int c = reader.read();
					ch = (char) c;
					System.out.println("read:"+c);
					System.out.println("read:"+ch);
					reader.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
              }
              
}











