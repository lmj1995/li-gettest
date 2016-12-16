package www.lmj.test;

public class Demo {
/**
 * 复习装箱 拆箱  自动装箱  自动拆箱
 */
	//装箱
	public void  test1(){
		int  a1 =10;
		Integer a2=new Integer(a1);
		Integer a3=Integer.valueOf(10);
		
		
    //拆箱
		int a4=a2.intValue();
		
		
	//自动装箱
		Integer a5=3;
		Integer a6=3+a5;
		
	//自动拆箱
		int a7=3+3;
		int a8=a1+a2;
		
	}
	
}







