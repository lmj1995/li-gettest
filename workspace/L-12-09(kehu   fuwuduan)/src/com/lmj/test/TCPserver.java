package com.lmj.test;

import java.io.File;
import java.io.FileInputStream;
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

import javax.xml.crypto.Data;

public class TCPserver {

	/**
	 * �����
	 */
	          public static final int PORT_SERVER =9603;
	          private ServerSocket serverSocket=null;
	          private DatagramSocket socket = null;
	          
	          public void test(){
	        	  //������
	        	  String data = "���Ƿ����";
	        	  try {
	        		  //new ����
					serverSocket = new ServerSocket(PORT_SERVER);
					
					//����
					Socket client = serverSocket.accept();
					System.out.println("����˽��ܿͻ���");
					OutputStream os = client.getOutputStream();
					os.write(data.getBytes());
					System.out.println("������������ݣ�"+data);

				    // �ر�
					
					client.close();
					stop();
					System.out.println("����˹ر�");
				} catch (IOException e) {
					e.printStackTrace();
				}
	        	  
	          }
	          /**
	           * ����˽�������
	           */
	          public void test2(){
	        	  
	        	  String path = "G:/321";
	        	  try {
	        		  
					serverSocket = new ServerSocket(PORT_SERVER);
					System.out.println("����˴���");
					
					Socket client = serverSocket.accept();
					InputStream is = client.getInputStream();
					FileOutputStream fos = new FileOutputStream(new File(path));
					
					byte[] b = new byte[1024];
					int len =0; 
					while ((len = is.read(b)) !=-1) {
						fos.write(b,0, len);
						
					}
					 
			    	   
					//�ر�
					fos.close();
					stop();
					System.out.println("�������ر�");
					
				} catch (UnknownHostException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
	        	  
	        	  
	          }
	          
	          public void test3(){
	        	     
	        	     
	        	  

	      		//ͼƬ��ַ
	      		String path = "E:/lingling.jpeg";

	      		try {
	      			// new
	      			serverSocket = new ServerSocket(PORT_SERVER);
	      			System.out.println("server start");
	      			// ����
	      			Socket client = serverSocket.accept();
	      			System.out.println("server accept client");
	      			
	      			OutputStream os = client.getOutputStream();
	      			
	      			//�ȴ��ļ�������
	      			File file = new File(path); 
	      			FileInputStream fis = new FileInputStream(file);
	      		
	      			long total = file.length();
	      			System.out.println("total:" + total + "Byte");
	      			long per = 0;
	      			float percent = 0;
	      			
	      			byte[] b = new byte[1024];
	      			int len = 0;
	      			while ((len = fis.read(b)) != -1) {
	      				per += len;
	      				os.write(b, 0, len);
	      				
	      				percent = (float)per/total;//�ٷֱ�
	      				
	      				percent = percent * 100;
	      				
	      				System.out.println("Server data:" + (int)percent + "%");
	      				
	      				Thread.sleep(500);
	      				
	      			}

	      			// �ر�
	      			fis.close();
	      			client.close();
	      			stop();
	      			System.out.println("server close");

	      		} catch (IOException e) {
	      			e.printStackTrace();
	      		} catch (InterruptedException e) {
	      			e.printStackTrace();
	      		}

	      	}
	        	   
	        	  
	         
	          
	          
	          
	         public void stop(){
	        	 if (serverSocket != null && !serverSocket.isClosed()) {
					try {
						serverSocket.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
	         }
	
	
}




