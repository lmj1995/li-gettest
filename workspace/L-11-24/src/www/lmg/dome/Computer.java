package www.lmg.dome;

public abstract class Computer implements USB  {
    //����
	public String name="";
	//����
	 public Computer(String name) {
		this.name=name;
	}
	//����
	 public void look(){
		 System.out.println(name+"����Ƭ");
	 }
	
	
}
