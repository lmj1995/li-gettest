package www.lmj.dome2;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Zoon {
   public String name="";
   public Zoon(String name){
    this.name=name;
	      }
   public void eat(){
	   System.out.println(name+"³Ô¶«Î÷");
   }
   public void  sleep(){
	   System.out.println(name+"Ë¯¾õ¾õ");
   }
   public String getName() {
	return name;
}
}
