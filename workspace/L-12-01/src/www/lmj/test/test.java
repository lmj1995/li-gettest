package www.lmj.test;

import java.io.File;

import com.wang.io.Demo2;

public class test {
public static void main(String[] args) {
            
	     Dome1 d1 = new Dome1();
//	     d1.test1();
//	     d1.test2();
//	     d1.test3();
//	     d1.test4();
//	     d1.test5();
//	     d1.test6();
//	     d1.test7();
//	     d1.test8();
	     Dome2 d2 = new Dome2();
	     d2.test1();
		 d2.test2(new File(Dome2.ROOT), "");
		 d2.test3(Dome2.ROOT);
	
	
	
}
}
