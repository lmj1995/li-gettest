package www.lmj.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.omg.CORBA.PUBLIC_MEMBER;



/**
 * File 类实�?
 *
 */
public class Dome2 {

	/*
	 * �ļ��ṹ��
	 * 
	 * 1�����ļ��У�d��
	 * 
	 * 2�����ļ��У�d1,d2��
	 * 
	 * 3�����ļ��У�d11,d12,d21,d22��
	 * 
	 * 4�����ļ���f1,f2,f3,f4,f5,f6,f7,f8��
	 */

	
	public  static final String ROOT = "g:/a";
	public  static final String D1 = ROOT+File.separator+"d1";
	public  static final String D2 = ROOT+File.separator+"d2";
	
	public  static final String D11 = ROOT+File.separator+"d11";
	public  static final String D12 = ROOT+File.separator+"d12";
	public  static final String D21 = ROOT+File.separator+"d21";
	public  static final String D22 = ROOT+File.separator+"d22";
	
	public static final String PATH1 = D11 + File.separator + "f1.txt";
	public static final String PATH2 = D11 + File.separator + "f2.txt";
	public static final String PATH3 = D12 + File.separator + "f3.txt";
	public static final String PATH4 = D12 + File.separator + "f4.txt";
	public static final String PATH5 = D21 + File.separator + "f5.txt";
	public static final String PATH6 = D21 + File.separator + "f6.txt";
	public static final String PATH7 = D22 + File.separator + "f7.txt";
	public static final String PATH8 = D22 + File.separator + "f8.txt";
	
	private String[] dirs = { D11, D12, D21, D22 };
	private String[] paths = { PATH1, PATH2, PATH3, PATH4, PATH5, PATH6, PATH7,
			PATH8 };

	
	/**
	 *���崴��
	 */
	
	public void test1(){
		//�ȴ����ļ���
		for (String d : dirs) {
			File file = new File(d);
			
			boolean b = file.mkdir();
					
			System.out.println("dirs:"+b);		
		}
		//�ٴ����ļ�
		for (String p: paths) {
			File file =new File(p);
		
		//����
		try {
			boolean b = file.createNewFile();
			System.out.println("file:"+b);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("create file exception!");
		}	
		}
	}
	/**
	 * �������
	 */
	     public void test2(File f,String div){
	    	 if (!f.exists()) {
				System.out.println("�ļ�������");
				return;
	    		 
			}
	    	 //��ӡ����
	    	 System.out.println(div+f.getName());
	    	 div+="--";
	    	 //������ļ��� ����һ��
	    	 if (f.isDirectory()) {
				File[] children =f.listFiles();
				for (File child : children) {
			//�ݹ�
					test2(child, div);
				}
			}
	     }
	     /**
	      * ����ɾ��
	      */
	     public void test3(String path){
	    	 //File
	    	 File file =new File(path);
	    	 if (!file.exists()) {
				System.out.println("�ļ�������");
				return;
			}
	    	 //������ļ�  ����һ��
	    	 if (file.isDirectory()) {
				File [] children = file.listFiles();
				for (File child : children) {
					String p = child.getPath();
					test3(path);
				}
			}
	    	 //������ļ�ֱ��ɾ��
	    	 boolean b=file.delete();
	    	 System.out.println("del"+file.getName()+":"+b);
	     }
//	     /**
//	      * ��������
//	      */
//	     public ArrayList<File> list = new ArrayList<File>();
//	    		 
//	     public void test4(String path, String key){
//	    	 File file = new File(path);
//	    	 System.out.println("name"+file.getName());
//	    	 
//	    	 //������ļ���
//	    	 if (file.isDirectory()) {
//	    	 MyFileFilter filter = new MyFileFilter();
//			 System.out.println("Dome2.test4()");
//			}
//	     }
}




























