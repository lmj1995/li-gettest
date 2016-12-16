package www.lmj.dome1;

public class dome2 
{
    int a =10;
    int b =20;
    
	public void sum(int x,int y)
	{
		int z = x + y;
		System.out.println(z);
		
	}
	
	public static void main(String[] args)
	{
		System.out.println("this is my domes2");
		 
		dome2 dome = new dome2();
		System.out.println(dome);
		
		System.out.println(dome.a);
		System.out.println(dome.b);
		
		dome.sum(10,20);
		
	}
	
}
