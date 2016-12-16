
package www.lmj.dome;

public class computer implements Usb {
    private   String brand="";
    private   String hd="";
    
  public computer(String brand){
	  this.brand=brand;
  }
  public void cal(){
	  System.out.println(brand+"可以计算");
  }
   public String getHd() {
	return hd;
}
   public void setHd(String hd) {
	this.hd = hd;
}
  public void in(String data){
	  System.out.println(brand+",进数据"+data);
	  hd +=data;
	  System.out.println(brand+",总数据"+hd);
  }
  public String out(){
	  System.out.println(brand+",出数据"+hd);
	  return hd;
  }
}
