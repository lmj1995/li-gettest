package com.lmj.test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPReciver {
 
	     private DatagramSocket socket = null;
	     
	     public void strat(){
	    	  try {
	    		  //����socket����
				socket = new DatagramSocket(9114);
				 System.out.println("���ն������ɹ���9114�˿�");
		    	 //��������
		    	 //����һ���հ�
				byte[] buf = new byte[1024];
				DatagramPacket packet = new DatagramPacket(buf, buf.length);
				socket.receive(packet);
		    	 //��������
		    	 String  data = new String(packet.getData(), 0, packet.getLength());
		    	 //��ʾ
		    	 System.out.println("rve="+data);
		    	 //�ر�
				socket.close();
				System.out.println("���ն˹ر�");
				
			} catch (SocketException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	 
	     }
	
	       public void  start2(){
	    	  //����socket ���� 
	    	   
	    	   try {
				socket = new DatagramSocket(9236);
				System.out.println("���ն˿ڳɹ���9236");
				
				while (true) {
					byte[] buf=new byte[1024];
					DatagramPacket packet = new DatagramPacket(buf, buf.length);
					socket.receive(packet);
					//��������
					String data = new String(packet.getData(), 0, packet.getLength());
					//��ʾ
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











