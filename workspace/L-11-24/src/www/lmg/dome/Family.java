package www.lmg.dome;
/**
 * ���   ���������
 *
 */
public abstract class Family {
 
	//����
	private Mum mum=null;
	private Baby baby=null;
	//����
	public Family(Mum mum,Baby baby){
		this.baby=baby;
		this.mum=mum;		
	}
	//����
	public abstract void eat();
	
}
