package www.lmj.dome1;
/**
 *�̳��ŵ�����ӿڼ̳�      ��������ӿڼ̳�     �ӿ�����̳�      �ӿ��������̳�
 *
 */
public abstract class Computer implements USB  {
    //����
	private  String name="";
	//����
	public Computer(String name){
		this.name=name;
	}
	
	//����
	public abstract void look();

	
	
}
