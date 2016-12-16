package www.lmj.dome;

public class Test {
	
	public static void main(String[] args) throws Exception {
		
	
	    Dome d = new Dome();
//	    d.exception1();
//	    d.exception2();
//	    d.exception3();
//	    d.exception4();
//	    d.exception5();
//	    d.exception6();
	  
//	    
//	    try {
//	    	d.exception7();
//	    }catch(Exception e){
//	    	e.printStackTrace();
//	    }

//	
//	    int avg=0;
//	  try {
//		  avg = d.avg();
//	} catch (Exception e) {
//		
//		e.printStackTrace();
//	}
//	System.out.println("avg="+avg);
//	
	
	Student s=new Student("小溪：");
	try {
		s.s(0);
	} catch (StudentException1 | StudentException3 | StudentException2 e) {
		e.printStackTrace();
		System.out.println("e.getMessage()");//getmassage  是调用
	}
	
	
	
	}	
}
















