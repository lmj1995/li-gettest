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
	 * udp  ���Ͷ�
	 */
	
	private DatagramSocket socket = null;
	
	public void send(String data){
		
		try {
			
			//����socket ����
			socket = new DatagramSocket(15578);
			System.out.println("���Ͷ˴����ɹ���15578�˿�");
			//��������
			//����һ�����ݰ�
			byte[] buf =data.getBytes();
			//����ip
//			InetAddress address =InetAddress.getLocalHost(); 
			//��ĵ��Եĵ�ַ
			InetAddress address2 = InetAddress.getByName("192.168.2.132");
			System.out.println("ip:"+address2.getHostAddress());
			
			//��װ����
			DatagramPacket packet = new DatagramPacket(buf, buf.length, address2, 9233);
			
			socket.send(packet);
			System.out.println("���Ͷ˷������ݣ�" + data);
			
			//�ر�
			socket.close();
			System.out.println("���Ͷ˹ر�");
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
				System.out.println("����ɹ����˿�10001");
				//׼������
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
					
					// ��������
					socket.send(packet);
					System.out.println("�������ݣ�" + line);		
				}
					socket.close();
					scanner.close();
					System.out.println("���Ͷ˹ر�");
					
				
				
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















