package www.lmj.dome1;
/**
 *继承张的类与接口继承      抽象类与接口继承     接口与类继承      接口与抽象类继承
 *
 */
public abstract class Computer implements USB  {
    //属性
	private  String name="";
	//构造
	public Computer(String name){
		this.name=name;
	}
	
	//方法
	public abstract void look();

	
	
}
