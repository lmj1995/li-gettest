package www.lmj.test;

import java.security.Key;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

import javax.xml.crypto.dsig.spec.HMACParameterSpec;

import org.omg.CORBA.PUBLIC_MEMBER;

import com.wang.map.Student;

/**
 * 
 *   Hashmap
 *
 */
public class Demo1 {

	

	private HashMap<Integer, String> hm;
	public  void  test1(){
		
		HashMap<Integer, String> hm= new HashMap<Integer, String>();
	//��������	
//		hm.remove(Key);
//		hm.put(key, value);
//		hm.isEmpty();
//		hm.size();
		
		
		String s1 = "aaa";
		String s2 = "ccc";
		String s3 = "ddd";
		String s4 = "fff";
		String s5 = "eee";
		hm.put(3, s3);
		hm.put(4, s4);
		hm.put(2, s2);
		hm.put(1, null);
		hm.put(null, null);
		
		System.out.println(hm);
		
		//�����е�key
		
	     Set<Integer> keys=hm.keySet();
	    for (Integer key : keys) {
	    	String v = hm.get(key);
	    	System.out.println(v);
		}
		//�������е�values
		Collection<String> coll=hm.values();
	   for (String v : coll) {
		System.out.println(v);
	   }
	}
	//����
//	    public void test2(){
//	    	System.out.println("---����---");
//	    	
//			for (int i = 0; i < hm.size(); i++) {
//				String s = hm.get("10" + i);
//				System.out.println(s);
//			}
////	    	
//	    }
//	
}









