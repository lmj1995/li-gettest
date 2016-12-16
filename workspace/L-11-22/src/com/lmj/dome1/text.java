package com.lmj.dome1;

import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;

public class text {
    
	public static void main(String[] args) {
		A a1=null;
		B b1=null;
		C c1=new C("123");
		c1.add(1, 2);
		c1.sub(2, 3);
		c1.mul(3, 4);
		c1.div(20, 5);
		
		Company c=null;
		Boss bo=new Boss("张三:", 30, "老总");
		bo.work();
		bo.play();
		bo.family();
		bo.life();
		
	}
	
}
