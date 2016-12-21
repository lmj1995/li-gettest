package com.lmj.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPclient {

	        public static final int PORT_SERVER= 9602; 
	        
	        private Socket client = null;
	        private DatagramSocket socket = null;
	        
	        public void test1(){
	        	try {
	        		//��ַ
					InetAddress address = InetAddress.getLocalHost();
					//new ����
					client = new Socket(address, PORT_SERVER);
					System.out.println("�ͻ��˴���");
					//����
					InputStream is =client.getInputStream(); 
					byte[] b = new byte[1024];
					int len = is.read(b);
					System.out.println("�ͻ��˽�������");
					String data = new String(b, 0, len);
					System.out.println("�ͻ�����:" + data);
 					//�ر�
					disConnect();
					System.out.println("�ͻ��˹ر�");
				} catch (UnknownHostException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
	        	 
	        	
	        }

   
	        /**
	         * �ͻ��˷�������
	         * 
	         */
	        
	             public void test2(){
	            	 
	            	 //���͵�ַ
	            	 String path = "G:/123.jpg";
	            	 
	            	 InetAddress address;
					try {
						 address = InetAddress.getLocalHost();
						 client = new Socket(address, PORT_SERVER);
						 System.out.println("�ͻ��˴����ɹ�");
						 
						 OutputStream  os = client.getOutputStream();
						 
						 //�ȴ��ļ�������
						 File file = new File(path);
						 FileOutputStream  fos = new FileOutputStream(file);
						 
						 
						 long total = file.length();
						 System.out.println("total:" + total + "Byte");
						 
						 
						
						 //�ر�
						 fos.close();
						 disConnect();
						 System.out.println("�ͻ��˹ر�");
		            	 
					} catch (UnknownHostException e) {
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					}
	            	 
	             }
	        
	             public void test3() {
	         		
	         		String path = "D:/bbb.jpeg";

	         		try {

	         			InetAddress address = InetAddress.getLocalHost();
	         			client = new Socket(address, PORT_SERVER);
	         			System.out.println("client create");

	         			InputStream is = client.getInputStream();
	         			FileOutputStream fos = new FileOutputStream(new File(path));

	         			byte[] b = new byte[1024];
	         			int len = 0;
	         			while((len = is.read(b)) != -1){
	         				fos.write(b, 0, len);
	         			}

	         			fos.close();
	         			disConnect();
	         			System.out.println("client disconnection");

	         		} catch (UnknownHostException e) {
	         			e.printStackTrace();
	         		} catch (IOException e) {
	         			e.printStackTrace();
	         		}
	         	}

	           
			private void disConnect() {
				if (client!=null&& !client.isClosed()) {
					try {
						client.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
					
				}
				
			}
	       
}