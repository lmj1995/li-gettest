package www.lmj.dome3;

import www.lmg.dome.USB;
import www.lmj.dome3.Baby.Chou;
import www.lmj.dome3.Baby.Lei;
import www.lmj.dome3.Baby.USB1;
import www.lmj.dome3.Computer.Usb;
import www.lmj.dome3.Computer.test1;
public class Test {

	

	

	

	public static void main(String[] args) {
//       //�ⲿ����ڲ��඼�Ƕ�̬��		
		Baby b=new Baby("ninni:");
		b.eat();
//		Lei l=b.new Lei(9);
//		l.play();
//		Chou c=b.new Chou("mimi") {
//			
//			@Override
//			public void Test() {
//				 System.out.println("����һ���������г�����");
//			}
//		};
//		c.Test();
//	USB1 u=new USB1() {
//		
//		@Override
//		public void test1() {
//			System.out.println("����һ���������нӿ�");
//		}
//	}; 
//	u.test1();

	Computer c=new Computer("keke") {
		
	};
//	c.look();
	
//	test1 t=c.new test1("nvnv");
//	t.say();
	   Usb  u2=new Usb() {
		
		@Override
		public void say1() {
			System.out.println("����һ������������Ľӿ�");
		}
	};
	 u2.say1();
	 
	}	
	
}







