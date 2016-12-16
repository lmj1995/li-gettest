package com.lmj.test;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Dome1 {
 
	/**
	 * 研究UDP用到的类
	 * 
	 */
	public   void   test1(){
		
		try {
			InetAddress inetaddress = InetAddress.getLocalHost();
//		    String ip =	inetaddress.getHostName();
		    String ip = inetaddress.getHostAddress();
			System.out.println("local Ip"+ip);
			
			InetAddress inetAddress2 = inetaddress.getByName("www.baidu.com"); 
			String ip2 = inetaddress.getHostAddress();
			System.out.println("local Ip="+ip2);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * 
	 * Datagrampacket
	 * 
	 */
	        public void test2(){
	        	//数据包
	        	String str = "hello";
	        	byte[] buf = str.getBytes();
	        	
	        	InetAddress myAddress;
	        	try {
					myAddress = InetAddress.getLocalHost();
		        	//构造数据包
					DatagramPacket Packet = new DatagramPacket(buf, 0,buf.length, myAddress, 9000);
					
					//给包中装东西
					Packet.getLength();
					Packet.getData();
					Packet.getAddress();
					Packet.getPort();
					
					Packet.setAddress(myAddress);
					Packet.getData();
					Packet.getLength();
					Packet.getPort();
					
					System.out.println(Packet);
				} catch (UnknownHostException e) {
					e.printStackTrace();
				}
	        	
	        }
	        /**
	    	 * DatagramSocket.
	    	 * 
	    	 * 负责通信。
	    	 */
	
	        public void test3(){
	        	
	        	try {
					DatagramSocket socket = new DatagramSocket();
					
//					socket.send(null);
//					socket.receive(null);
//					
					socket.close();
				} catch (SocketException e) {
					e.printStackTrace();
				}
	        	
	        }
}








