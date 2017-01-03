package com.lmj.dome;

import static org.junit.Assert.*;

import java.awt.TexturePaint;

import org.junit.Test;

public class JUnitTest {

	
	
	@Test
	public void test() {
		
		JUnit junit = new JUnit();
		
		assertEquals( 13  , junit.add(9, 4));
	
		assertEquals( 5  , junit.sub(9, 4));
		
		assertTrue (5 < 6);
		
		assertFalse(5 > 6);
		
		assertSame(5,5);
		
		assertNotSame(3,4);
	}

}
