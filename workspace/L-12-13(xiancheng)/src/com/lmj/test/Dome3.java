package com.lmj.test;

import java.nio.channels.SelectableChannel;

/**
 *ʵ��runable�ӿ� 
 *
 */
public class Dome3 implements  Runnable {

//
//	@Override
//	public void run() {
//
//		int count = 100;
//		int i = 0;
//		while (i<count) {
////           ��ȡ������δ������������
//			String name = Thread.currentThread().getName();
//			System.out.println(name+";i="+i);
//			i++;
//		}
//		
//		
//	}
	    private int tikets= 100;
	    public void Seel(){
	    	String name = Thread.currentThread().getName();
	    	System.out.println(name+"�߳���Ʊ��"+tikets--);
	    			
	    }
	@Override
	public void run() {
		 while (true) {

			 if (tikets<=0) {
//				System.out.println("��Ʊ����");
				break;
			}
			 Seel();
		}
		
	}

}





