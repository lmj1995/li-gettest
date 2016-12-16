package www.lmj.dome;

import java.util.EmptyStackException;

public class Student {
 /**
  * 学生类  测异常
  */
	
	
	private String name ;
	public Student(String name){
		this.name=name;
	}
	public void s(int hour)throws Exception{
		if (hour >=4) {
			throw new StudentException3();
		}else if (hour>=2) {
			throw new StudentException2();
		} else if (hour>=1) {
			throw new StudentException1();
			
		}else {
			System.out.println(name+"I  LOVE CHAIN");
		}
	}
	
	
	
}





