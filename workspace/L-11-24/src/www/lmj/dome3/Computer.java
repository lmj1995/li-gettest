package www.lmj.dome3;
/**
 *����������д��    ����������д������   ����������д�ӿ�
 *
 */
public abstract class Computer {
    //����
	public String name="";
	//����
	public Computer(String name){
		this.name=name;
	}
	//����
	public void look(){
		System.out.println("����һ��������");
	}
	//����һ����ͨ��
	class test1{
		
		//����
		private String name="";
		//����
		public test1(String name){
			this.name=name;
		}
		//����
		public void  say(){
			System.out.println("���,���ǳ����е���ͨ��");
		}
	}
	public   interface Usb{
		void say1();
	}
	
	}
