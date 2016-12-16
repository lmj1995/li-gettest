package www.lmj.test;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.text.SimpleDateFormat;

/**
 * �ļ�����
 *
 */
public class Dome1 {
/**
 * �����ļ�
 */
	  public void test1(){
		  //·��
		  String path ="G:/jiao.txt";
		  //file��
		  File file =new File(path);
		
			try {
				boolean succ=file.createNewFile();
				System.out.println("succ="+succ);
			} catch (IOException e1) {
				
				e1.printStackTrace();
				System.out.println("-�����ļ�ʧ��-");
			}
			
		}
	  /**
	   * ɾ���ļ�
	   */
	  
	       public void test2(){
	    	   //·��
	    	   String path="G:/jiao.txt";
	    	   //file��
	    	   File file = new File(path);
	    	   //ɾ���ļ�
	    	   boolean del=file.delete();
	    	   System.out.println("delete="+del);
	    	   
	       }
	  
		  /**
		   * �����ļ���
		   */
	       public void test3(){
	    	   //·��
	    	   String path="G:/myclass.txt";
	    	   //file��
	    	   File file = new File(path);
	    	   //����
	    	   boolean succ =file.mkdir();
	    	   System.out.println("succ="+succ);
	       }
	       /**
	        * ɾ���ļ���
	        */
	       public void test4(){
	    	   //·��
	    	   String path ="G:/myclass.txt";
	    	  //file��
	    	   File file = new File(path);
	    	   //����
	    	   boolean del =file.delete();
	    	   System.out.println("del="+del);
	       }
	       /**
	        * �����༶�ļ���
	        */
	       
	       public void test5(){
	    	   //·��
	    	   String path="G:/mywork/music/weidao/2016";
	    	   //file��
	    	   File file = new  File(path);
	    	   //����
	    	   boolean succ = file.mkdirs();
	    	   System.out.println("succ="+succ);
	       }
	       
	       /**
	        * ɾ���༶�ļ���
	        * ������һ����ɾ������ļ���  Ҫ��ɾ�������ɾ�����  һ��һ��ɾ��
	        */
//	       
	       public void test6(){
	    	   //·��
	    	   String path="G:/mywork/music/weidao/2016";
	    	   //file��
	    	   File file = new File(path);
	    	   //����
	           boolean del = file.delete();
	           System.out.println("del="+del);
	       }
	       
	       /**
	        * ��������
	        */
	       public void test7(){
	    	   //·��
	    	   String path="G:/aaa";
	    	   
	    	   //file��
	    	   File file = new File(path);
	    	   
	    	   //��������
	    	   System.out.println("exists:"+ file.exists());//�ж϶���file�Ƿ����
	    	   System.out.println("name:"+file.getName());//����ļ�������
	    	   System.out.println("path:"+file.getPath());//����ļ���·��
	    	   System.out.println("length:"+file.length());//������ݵĳ���
	    	   System.out.println("Absolute:"+file.isAbsolute());//
	    	   System.out.println("file:"+file.isFile());//�ж��Ƿ��������ļ�
	    	   System.out.println("Directory:"+file.isDirectory());//�ж��Ƿ��������ļ���
	    	   System.out.println("Hidden:"+file.isHidden());//�ж��Ƿ�����
	    	   System.out.println("lastModified"+file.lastModified());//��������޸ĵ�ʱ��
	    	  SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd-hh:mm:ss");
	    	   String date= sdf.format(file.lastModified());
	    	   System.out.println("lastModified:"+date);//ת��ʱ���ʽ
	    	   System.out.println("getParent:"+file.getParent());//����ϼ�Ŀ¼ ;��
	    	   System.out.println("Dome1.test7()"+file.getParentFile().getName());//�¼�Ŀ¼���ļ����ļ���ʱ���򱨴� 	   
	       }
	     
	      /**
	       * ����·��1
	       */
	           public void test8(){
	    	   //·��
	    	   String path ="G:/aaa/love";
	    	   //file��
	    	   File file = new File(path);
	    	   
	    	   //����
	    	   System.out.println("Directory:"+file.isDirectory());
	    	   //��һ��·��
	    	   System.out.println("Dome1.test8()"+file.getParent());
	    	   //��һ��·��
	    	   String [] paths=file.list();//����pathsΪstring���飬�����ļ��б�
	    	   //����
	    	   for (String p : paths) {//���p��paths�е�Ԫ��
	    		   System.out.println("Children"+p);//���p
	  			}
	    	   //��һ���ļ�
	    	   System.out.println("ParentFile"+file.getParentFile().getName());
	    	   
	    	  //��һ���ļ�
	    	  File[] files=file.listFiles(); 
	    	  for (File f :files ) {
				System.out.println("Children"+f.getName());
			}
	    	  
	       }
	
	  }
	












