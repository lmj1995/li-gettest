package www.lmj.dome3;

import www.lmg.dome.USB;
import www.lmj.dome3.Baby.Chou;
import www.lmj.dome3.Baby.Lei;
import www.lmj.dome3.Baby.USB1;
import www.lmj.dome3.Computer.Usb;
import www.lmj.dome3.Computer.test1;
public class Test {

	

	

	

	public static void main(String[] args) {
//       //外部类和内部类都是动态类		
		Baby b=new Baby("ninni:");
		b.eat();
//		Lei l=b.new Lei(9);
//		l.play();
//		Chou c=b.new Chou("mimi") {
//			
//			@Override
//			public void Test() {
//				 System.out.println("这是一个类里面有抽象类");
//			}
//		};
//		c.Test();
//	USB1 u=new USB1() {
//		
//		@Override
//		public void test1() {
//			System.out.println("这是一个类里面有接口");
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
			System.out.println("这是一个抽象类里面的接口");
		}
	};
	 u2.say1();
	 
	}	
	
}







