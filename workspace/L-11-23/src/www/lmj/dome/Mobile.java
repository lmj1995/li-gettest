package www.lmj.dome;

import org.omg.CORBA.PUBLIC_MEMBER;

//import com.wang.demo.test2.USB;

public class  Mobile implements Usb{
     private String brand="";
     private String  sd="";
     
     public Mobile(String brand){
    	 this.brand=brand;
     }
     public void call(){
    	 System.out.println(brand+",����ͨ��");
     }
	public String getSd() {
		return sd;
	}
	public void setSd(String sd) {
		this.sd = sd;
	}
     public void in(String data){
    	 System.out.println(brand+",������"+data);
    	 sd+=data;
    	 System.out.println(brand+",������"+data);
     }
     public String out(){
    	 System.out.println(brand+",������"+sd);
    	 return sd;
    
     }
     
     
     
     
     
     
     
     
}
