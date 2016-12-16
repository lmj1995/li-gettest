package www.lmg.dome;

public abstract class Computer implements USB  {
    //属性
	public String name="";
	//构造
	 public Computer(String name) {
		this.name=name;
	}
	//方法
	 public void look(){
		 System.out.println(name+"看照片");
	 }
	
	
}
