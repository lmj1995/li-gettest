package com.lmj.test2;
/**
 * �߳�״̬
 * 1.�½�״̬
 * 2.����״̬
 * 3.���С�����״̬
 * 4.����״̬
 */
public class Dome1 extends Thread {

	public Dome1 (String name){
		super(name);
		
		System.out.println(name+"�߳��½�״̬");
	}
	
	public synchronized void start(){
		
		super.start();
		
		String name = getName();
		System.out.println(name+"�߳̾���״̬");
		
	}
	
	public void run(){
		super.run();
		
		
	    String name = Thread.currentThread().getName();
			
	    for (int i = 0; i <10; i++) {
			System.out.println(name +"�߳�����״̬="+i);
			if (i==5) {
				try {
					System.out.println(name+"�߳�����״̬");
					Thread.sleep(3*1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	       System.out.println("�߳�����״̬");
	    
	}
}















