package com.lmj.test;

import java.io.File;
import java.io.StringBufferInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Dome2 {

	//获取类的信息
	public void test1(){
		
		Class  c = Student.class;
		String name = c.getName();
		int m = c.getModifiers();
		
		System.out.println("class name="+name);
		System.out.println("modifier="+Modifier.toString(m));
	}
	//获取域的信息
	public void test2() throws NoSuchFieldException{
		try {
			Class c1 = Class.forName("com.lmj.test.Student");
			
			//获取属性
			
//			Field f = c1.getField("nini");
			Field[] f1 = c1.getFields();
//			Field f2 = c1.getDeclaredField(null);
			Field[] f3 =c1.getDeclaredFields();
			
			for (Field field : f3) {
				int mod = field.getModifiers();
				Class name =field.getType();
				String s = field.getName();
				
				System.out.println("mod="+Modifier.toString(mod));
				System.out.println("type="+c1.getName());
				System.out.println("name="+name);
				System.out.println("-------------------------");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
	}
	//获取构造信息
	public void test3(){
		
		 try {
			Class c1 = Class.forName("com.lmj.test");
			
			c1.getConstructor();
			c1.getDeclaredConstructors();
			
			Constructor[] s = c1.getDeclaredConstructors(); 
			c1.getConstructor();
			//Constructor con = c1.getDeclaredConstructor(parameterTypes);
			
			for (Constructor constructor : s) {
				String s1 = constructor.getName();
				int mod = constructor.getModifiers();
				int count = constructor.getParameterCount();
			
				
			}
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		
		
	}
}















