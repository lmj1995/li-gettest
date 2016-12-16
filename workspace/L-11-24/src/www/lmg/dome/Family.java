package www.lmg.dome;
/**
 * 组合   类与抽象类
 *
 */
public abstract class Family {
 
	//属性
	private Mum mum=null;
	private Baby baby=null;
	//构造
	public Family(Mum mum,Baby baby){
		this.baby=baby;
		this.mum=mum;		
	}
	//方法
	public abstract void eat();
	
}
