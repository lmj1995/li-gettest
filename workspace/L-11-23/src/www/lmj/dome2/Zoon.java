package www.lmj.dome2;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Zoon {
   public String name="";
   public Zoon(String name){
    this.name=name;
	      }
   public void eat(){
	   System.out.println(name+"�Զ���");
   }
   public void  sleep(){
	   System.out.println(name+"˯����");
   }
   public String getName() {
	return name;
}
}
