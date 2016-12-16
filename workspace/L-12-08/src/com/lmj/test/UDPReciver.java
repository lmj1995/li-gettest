package com.lmj.test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPReciver {
 
	     private DatagramSocket socket = null;
	     
	     public void strat(){
	    	  try {
	    		  //创建socket对象
				socket = new DatagramSocket(9114);
				 System.out.println("接收端启动成功。9114端口");
		    	 //接收数据
		    	 //定义一个空包
				byte[] buf = new byte[1024];
				DatagramPacket packet = new DatagramPacket(buf, buf.length);
				socket.receive(packet);
		    	 //处理数据
		    	 String  data = new String(packet.getData(), 0, packet.getLength());
		    	 //显示
		    	 System.out.println("rve="+data);
		    	 //关闭
				socket.close();
				System.out.println("接收端关闭");
				
			} catch (SocketException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	 
	     }
	
	       public void  start2(){
	    	  //创建socket 对象 
	    	   
	    	   try {
				socket = new DatagramSocket(9236);
				System.out.println("接收端口成功，9236");
				
				while (true) {
					byte[] buf=new byte[1024];
					DatagramPacket packet = new DatagramPacket(buf, buf.length);
					socket.receive(packet);
					//处理数据
					String data = new String(packet.getData(), 0, packet.getLength());
					//显示
					System.out.println("rev data="+data);
					if (data.equals("over")) {
						break;
					}
				}
			} catch (SocketException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	       }
	
	       public void stop(){
	    	   if (socket!=null&&!socket.isClosed()) {
				socket.close();
			}
	       }
}











