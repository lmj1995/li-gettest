package www.lmj.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Set
 * 
 * Ë³Ðò
 * ÖØ¸´
 *
 */
public class Demo4 {
     //hashset
	public void test1(){
		HashSet<String> hs = new HashSet<String>();
		hs.add("aaa");
		hs.add("bbb");
		hs.add("ccc");
		hs.add("ddd");
		hs.add("eee");
//		System.out.println(hs);
//		hs.remove("ccc");
//		System.out.println(hs);
		
		//µü´úÆ÷
		Iterator<String> it =  hs.iterator();
		
		it.hasNext();
		it.next();
	    while (it.hasNext()) {
			String s =it.next();
			
			if (s.equals("eee")) {
				it.remove();
			}
			System.out.println(s);
		}
	    System.out.println(hs);
		
	}
	//treeset
	
	    public void test2(){
	    	TreeSet<String> ts =new TreeSet<String>();
	    	ts.add("aaa");
	    	ts.add("bbb");
	    	ts.add("ccc");
	    	ts.add("ddd");
	    	ts.add("eee");
	    	
	    	System.out.println(ts);
	    	ts.remove("bbb");
	    	System.out.println(ts);
	    	
	    	Iterator<String> it= ts.iterator();
	    	it.hasNext();
	    	it.next();
	    	
	    	while (it.hasNext()) {
				String s =it.next();
				if (s.equals("aaa")) {
					s="ggg";
					
				}
				System.out.println(s);
			}
	    	
	    	System.out.println(ts);
	    	
	    }
}

















