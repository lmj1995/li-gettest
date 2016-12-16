package www.lmj.dome2;

public class Dog extends Zoon{

	public Dog(String name) {
		super(name);
	}
   public void watch(){
	   System.out.println(getName()+",¿´ÃÅ");
   }
   public void eat(){
	   System.out.println(getName()+",³Ô¹ÇÍ·");
   }
   public void sleep(){
	   System.out.println(getName()+"³ªÒ¡ÀºÇú");
   }
}
