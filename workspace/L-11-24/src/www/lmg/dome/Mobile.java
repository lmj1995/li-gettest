package www.lmg.dome;
/**
 * ���Խӿ�����  ����ӿ��Ƿ�������
 * ���Խӿ��������  ��������ӿ����Ƿ�������
 * �ֻ�
 *
 */
public abstract class Mobile {
      
	//����
	public String name="";
	//����
	public Mobile(String name){
		this.name=name;
	}
	
	//����
	public void call(){
		System.out.println(name+"ιιι");
	}
    
	
}
