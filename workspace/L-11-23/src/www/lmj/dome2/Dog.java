package www.lmj.dome2;

public class Dog extends Zoon{

	public Dog(String name) {
		super(name);
	}
   public void watch(){
	   System.out.println(getName()+",����");
   }
   public void eat(){
	   System.out.println(getName()+",�Թ�ͷ");
   }
   public void sleep(){
	   System.out.println(getName()+"��ҡ����");
   }
}
