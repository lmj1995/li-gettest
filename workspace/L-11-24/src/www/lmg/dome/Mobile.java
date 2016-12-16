package www.lmg.dome;
/**
 * 测试接口与类  类与接口是否可以组合
 * 测试接口与抽象类  抽象类与接口是是否可以组合
 * 手机
 *
 */
public abstract class Mobile {
      
	//属性
	public String name="";
	//构造
	public Mobile(String name){
		this.name=name;
	}
	
	//方法
	public void call(){
		System.out.println(name+"喂喂喂");
	}
    
	
}
