package com.lmj.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Dome2 {

	
         public void test(){
        	 //数据
        	String data="你好，世界";
        	 //路径
            String  path = "G:/abc";
        	 //file类
        	 
            File file = new File(path);
        	 //io流
            
            //定义流
            try {
				FileOutputStream fos = new FileOutputStream(file);
				//输出数据
				fos.write(data.getBytes());
				
				//关闭流
				fos.close();
				System.out.println("输出成功");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
         }
	
}










