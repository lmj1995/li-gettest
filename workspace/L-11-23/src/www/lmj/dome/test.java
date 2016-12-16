package www.lmj.dome;

import www.lmj.dome2.Dog;
import www.lmj.dome2.Zoon;

public class test {
public static void main(String[] args) {
	computer c=new computer("联想");
//	  c.cal();
//	  c.in("13");
//	  c.out();
	  Mobile m=new Mobile("华为");
//	  m.call();
//	  m.in("14");
//	  m.out();
	  Usb u1=new Mobile("华为");
	  Usb u2=new computer("联想");
	  u2.in(u1.out());

	  Zoon z=new Zoon("大宝儿");
//	  z.eat();
	   
	  
	  Dog d=new Dog("小白");
	  d.watch();
	  d.eat();
	  d.sleep();
	  
	  
	  
	  
}	
}
