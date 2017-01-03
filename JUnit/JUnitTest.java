package com.lmj.dome;

import static org.junit.Assert.*;

import java.awt.TexturePaint;

import org.junit.Test;

public class JUnitTest {

	
	
	@Test
	public void test() {
		
		JUnit junit = new JUnit();
		//两个变量和等式是否相等	

	        assertEquals( 13  , junit.add(9, 4));
                assertEquals( 5  , junit.sub(9, 4));
		//检查条件为真		
                assertTrue (5 < 6);
		//检查条件为假		
                assertFalse(5 > 6);
		//方法检查两个相关对象是否指同一对象		
                assertSame(5,5);
		//方法检查两个相关对象是否不指同一对象
		assertNotSame(3,4);
	}

}
