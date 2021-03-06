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
	 * 服务端
	 */
	          public static final int PORT_SERVER =9603;
	          private ServerSocket serverSocket=null;
	          private DatagramSocket socket = null;
	          
	          public void test(){
	        	  //服务器
	        	  String data = "我是服务端";
	        	  try {
	        		  //new 对象
					serverSocket = new ServerSocket(PORT_SERVER);
					
					//操作
					Socket client = serverSocket.accept();
					System.out.println("服务端接受客户端");
					OutputStream os = client.getOutputStream();
					os.write(data.getBytes());
					System.out.println("服务器输出数据："+data);

				    // 关闭
					
					client.close();
					stop();
					System.out.println("服务端关闭");
				} catch (IOException e) {
					e.printStackTrace();
				}
	        	  
	          }
	          /**
	           * 服务端接收数据
	           */
	          public void test2(){
	        	  
	        	  String path = "G:/321";
	        	  try {
	        		  
					serverSocket = new ServerSocket(PORT_SERVER);
					System.out.println("服务端创建");
					
					Socket client = serverSocket.accept();
					InputStream is = client.getInputStream();
					FileOutputStream fos = new FileOutputStream(new File(path));
					
					byte[] b = new byte[1024];
					int len =0; 
					while ((len = is.read(b)) !=-1) {
						fos.write(b,0, len);
						
					}
					 
			    	   
					//关闭
					fos.close();
					stop();
					System.out.println("服务器关闭");
					
				} catch (UnknownHostException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
	        	  
	        	  
	          }
	          
	          public void test3(){
	        	     
	        	     
	        	  

	      		//图片地址
	      		String path = "E:/lingling.jpeg";

	      		try {
	      			// new
	      			serverSocket = new ServerSocket(PORT_SERVER);
	      			System.out.println("server start");
	      			// 操作
	      			Socket client = serverSocket.accept();
	      			System.out.println("server accept client");
	      			
	      			OutputStream os = client.getOutputStream();
	      			
	      			//先从文件拿数据
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
	      				
	      				percent = (float)per/total;//百分比
	      				
	      				percent = percent * 100;
	      				
	      				System.out.println("Server data:" + (int)percent + "%");
	      				
	      				Thread.sleep(500);
	      				
	      			}

	      			// 关闭
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





