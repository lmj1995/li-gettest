package www.lmj.dome;

import www.lmj.dome2.Dog;
import www.lmj.dome2.Zoon;

public class test {
public static void main(String[] args) {
	computer c=new computer("����");
//	  c.cal();
//	  c.in("13");
//	  c.out();
	  Mobile m=new Mobile("��Ϊ");
//	  m.call();
//	  m.in("14");
//	  m.out();
	  Usb u1=new Mobile("��Ϊ");
	  Usb u2=new computer("����");
	  u2.in(u1.out());

	  Zoon z=new Zoon("�󱦶�");
//	  z.eat();
	   
	  
	  Dog d=new Dog("С��");
	  d.watch();
	  d.eat();
	  d.sleep();
	  
	  
	  
	  
}	
}
