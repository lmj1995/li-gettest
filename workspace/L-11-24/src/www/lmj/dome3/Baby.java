package www.lmj.dome3;

import www.lmj.dome3.Baby.Lei;

/**
 *测试   类里写类    类里写抽象类    类里写接口
 *
 */
public class Baby {

	public class Chou {

	}
	public class Lei {

	}
	//属性
	private String name="";
	
	//构造
	public Baby(String name){
		this.name=name;
	}
	//方法
	public void eat(){
		System.out.println(name+"吃东西");
	}
	//这是第二个类
//	class Lei{
//		//属性
//		private int age=0;
//		//构造
//		public Lei(int age){
//			this.age=age;
//		}
//		//方法
//		public void  play(){
//			System.out.println(name+"这是内部类里有类");
//		}
//	}
	//这是一个抽象类
//	public   abstract  class Chou{
//		//属性
//		private String name="";
//		//构造
//		public Chou(String name){
//			this.name=name;
//		}
//		//方法
//		public abstract void Test();
//		}
	//这是一个接口
	public interface USB1{
		void test1();
	}
	
	
	
	
	
	
}
