package com.lmj.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Dome2 {

	
         public void test(){
        	 //����
        	String data="��ã�����";
        	 //·��
            String  path = "G:/abc";
        	 //file��
        	 
            File file = new File(path);
        	 //io��
            
            //������
            try {
				FileOutputStream fos = new FileOutputStream(file);
				//�������
				fos.write(data.getBytes());
				
				//�ر���
				fos.close();
				System.out.println("����ɹ�");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
         }
	
}










