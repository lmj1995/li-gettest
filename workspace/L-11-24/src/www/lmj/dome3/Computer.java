package www.lmj.dome3;
/**
 *抽象类里面写类    抽象类里面写抽象类   抽象类里面写接口
 *
 */
public abstract class Computer {
    //属性
	public String name="";
	//构造
	public Computer(String name){
		this.name=name;
	}
	//方法
	public void look(){
		System.out.println("这是一个抽象类");
	}
	//这是一个普通类
	class test1{
		
		//属性
		private String name="";
		//构造
		public test1(String name){
			this.name=name;
		}
		//方法
		public void  say(){
			System.out.println("你好,我是抽象中的普通类");
		}
	}
	public   interface Usb{
		void say1();
	}
	
	}

