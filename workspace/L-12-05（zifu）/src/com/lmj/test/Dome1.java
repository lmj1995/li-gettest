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
 *�ַ���
 * 
 *
 */
public class Dome1 {
/**
 * �о� reader   writer
 * 
 */
	
	
	     public  void  myio(){
//	    	 Reader reader = null;
//	    	  reader.read(cbuf, off, len);
//	    	  reader.close();//�ر�
//	    	  reader.reset();//����
//	    	  reader.equals(reader);//ͬ����
//	    	Writer writer  = null;
//	    	  writer.write(str);
//	    	  writer.write(cbuf, off, len);
//	    	  writer.close();
//	    	  writer.flush();
	     }
	     
              public void myio1(){
            	  char ch = '��';
            	  //·��
            	  String path ="G:/aaa";
            	  //�ļ�
            	  File file = new File(path);
            	  //io
            	try {
					FileWriter writer = new FileWriter(file);
					
					writer.write(ch);
					
					writer.close();
					
					System.out.println("������");
				} catch (IOException e) {
					e.printStackTrace();
				}
              }	     
	     
              
              /**
               * �������ַ�
               */
              
              public void myio2(){
            	  char[] cha = {'��','Ҫ','˯','��'};
            	  //·��
            	  String path = "G:/bbb";
            	  //file
            	  File file = new File(path);
            	  //io
            	  try {
					FileWriter writer = new FileWriter(file);
					writer.write(cha);
					System.out.println("������");
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
            	  
              }
              /**
               * ���һ���ַ�
               */
              
              public void myio3(){
            	  
            	  String str = "��������˯��";
            	  
            	  String path = "G:/sleep";
            	  
            	  File file = new File(path);
            	  
            	  try {
					FileWriter writer = new FileWriter(file);
					
					writer.write(str);
					
					System.out.println("������");
					writer.close();
            		  
            		  
				} catch (Exception e) {
					// TODO: handle exception
				}
            	  
              }
              
              /**
               * ����һ���ַ�
               */
              
              public void myio4(){
            	  //������
            	 char ch ='0';
            	  //·��
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











