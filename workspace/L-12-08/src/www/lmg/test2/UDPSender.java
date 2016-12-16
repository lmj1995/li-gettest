package www.lmg.test2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

import javax.xml.crypto.Data;

public class UDPSender {

	/**
	 * udp  发送端
	 */
	
	private DatagramSocket socket = null;
	
	public void send(String data){
		
		try {
			
			//创建socket 对象
			socket = new DatagramSocket(15578);
			System.out.println("发送端创建成功！15578端口");
			//发送数据
			//定义一个数据包
			byte[] buf =data.getBytes();
			//本机ip
//			InetAddress address =InetAddress.getLocalHost(); 
			//别的电脑的地址
			InetAddress address2 = InetAddress.getByName("192.168.2.132");
			System.out.println("ip:"+address2.getHostAddress());
			
			//封装数据
			DatagramPacket packet = new DatagramPacket(buf, buf.length, address2, 9233);
			
			socket.send(packet);
			System.out.println("发送端发送数据：" + data);
			
			//关闭
			socket.close();
			System.out.println("发送端关闭");
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	     public void send2(){
	    	 try {
				socket = new DatagramSocket(10001);
				System.out.println("输出成功，端口10001");
				//准备数据
				Scanner scanner = new Scanner(System.in);
			 
				while (true) {
					String line =scanner.nextLine();
					if (line.equals("hello")) {
						break;
					}
					
					byte[] buf =line.getBytes();
					InetAddress address = InetAddress.getLocalHost();
					InetAddress address2 = InetAddress.getByName("192.168.2.132");
					System.out.println("ip:"+address2.getHostAddress());
					DatagramPacket packet = new DatagramPacket(buf, 0, buf.length, address, 9235);
					
					// 发送数据
					socket.send(packet);
					System.out.println("发送数据：" + line);		
				}
					socket.close();
					scanner.close();
					System.out.println("发送端关闭");
					
				
				
			} catch (SocketException e) {
				e.printStackTrace();
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
}
}















