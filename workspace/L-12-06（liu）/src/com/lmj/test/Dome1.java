package com.lmj.test;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.CharBuffer;
import java.util.Scanner;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Dome1 {

	/**
	 * ���
	 */
	
	public void  test1(){
		//����
		String date = "hello, li";
		//·��
		String  path = "G:/hello.txt";
		//file
		File file = new File(path);
		
		//io��
		
		try {
			FileWriter writer = new FileWriter(file);
			
			writer.write(date);
			
			writer.close();
			
			System.out.println("������");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * ����
	 */
	
	     public void test2(){
	    	 //����
	    	 String  data = "";
	    	 //·��
	    	 String  path = "G:/hello.txt";
	    	 //file
	    	 File file = new File(path);
	    	 //io��
	    	 try {
				FileReader reader = new FileReader(file);
				char[] cbuf = new char[256];
				int len = 0;
				while ((len=reader.read(cbuf))  !=-1) {
					data = new String(cbuf , 0 , len );
					System.out.println(data);
				}
				reader.read(cbuf);
				reader.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	     }
	     
	     public void test3(){
	    	 //·��
	    	 String path = "G:/hello.txt";
	    	 
	    	 try {
//				FileReader reader = new FileReader(path);
				FileReader reader = new FileReader(new File(path));
				//�ַ�������
				BufferedReader br = new BufferedReader(reader); 
				String line1 = br.readLine();
				String line2 = br.readLine();
				String line3 = br.readLine();
				String line4 = br.readLine();
				
				
				System.out.println("line1="+line1);
				System.out.println("line2="+line1);
				System.out.println("line3="+line1);
				System.out.println("line4="+line1);
				
				br.close();
				reader.close();
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	     }
	     
	     
	     /**
	      * ��׼��
	      */
	     
	     
	     
	     public void test4(){
	    	 try {
				PrintStream ps = new PrintStream(new File("G:/hello"));
				ps.println("hai");
				System.out.println(ps);
				ps.close();
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
	    	
	    	 
	    	InputStream is =System.in;
	    	byte[] b = new byte[256];
	    	
	    	try {
				int len = is.read(b);
				String data = new String(b, 0, len); 
				System.out.println(data);
				System.out.println("len:"+data.length());
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	     }
	     /**
	      *  ��׼���ض���
		  * System.in:  ����--����
		  * System.out: ���--��ʾ��
	      */
			//���
	     
	    public void test5(){
	     //����
	     String data = "�Ұ������ذ���";
	     //l·��
	     File file = new File("G:/love");
	     //liu
	   
	      try {
			FileOutputStream  fos = new FileOutputStream(file);
		    PrintStream ps  = new PrintStream(fos);
			
		    System.out.println(ps);
		    System.out.println(data);
		    
			fos.close();
			ps.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
}
	    
	       public void test6(){
	    	   try {
				FileInputStream fis = new FileInputStream(new File("G:/hello"));
				
				System.setIn(fis);
				
				Scanner scanner = new Scanner(System.in);
				
				String line  = scanner.nextLine();
				System.out.println(line);
				fis.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	       }
	       
	       public  void test7(){
	    	   try {
	    		   //�������
				FileOutputStream fos = new FileOutputStream(new File("G:/aaa"));
				DataOutputStream  dos = new DataOutputStream(fos);
				
				dos.writeInt(100);
				dos.write(10);
				dos.writeDouble(3.3);
				dos.writeFloat(1.5f);
				dos.writeBoolean(true);
				dos.writeChars("hai");
				System.out.println("���ݱ������");
				
				dos.close();
				
				
				
				DataInputStream dis = new DataInputStream(new FileInputStream(new File("G:/aaa")));
				byte a1 =dis.readByte();
				int  a2 = dis.readInt();
				double a3=dis.readDouble();
				float a4 =dis.readFloat();
				boolean a5 =dis.readBoolean();
				
				System.out.println("a1="+a1);
				System.out.println("a2="+a2);
				System.out.println("a3="+a3);
				System.out.println("a4="+a4);
				System.out.println("a5="+a5);
				
				dis.close();
 			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	       }
}













