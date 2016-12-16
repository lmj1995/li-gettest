package www.lmj.test;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.text.SimpleDateFormat;

/**
 * 文件属性
 *
 */
public class Dome1 {
/**
 * 创建文件
 */
	  public void test1(){
		  //路径
		  String path ="G:/jiao.txt";
		  //file类
		  File file =new File(path);
		
			try {
				boolean succ=file.createNewFile();
				System.out.println("succ="+succ);
			} catch (IOException e1) {
				
				e1.printStackTrace();
				System.out.println("-创建文件失败-");
			}
			
		}
	  /**
	   * 删除文件
	   */
	  
	       public void test2(){
	    	   //路径
	    	   String path="G:/jiao.txt";
	    	   //file类
	    	   File file = new File(path);
	    	   //删除文件
	    	   boolean del=file.delete();
	    	   System.out.println("delete="+del);
	    	   
	       }
	  
		  /**
		   * 创建文件夹
		   */
	       public void test3(){
	    	   //路径
	    	   String path="G:/myclass.txt";
	    	   //file类
	    	   File file = new File(path);
	    	   //方法
	    	   boolean succ =file.mkdir();
	    	   System.out.println("succ="+succ);
	       }
	       /**
	        * 删除文件夹
	        */
	       public void test4(){
	    	   //路径
	    	   String path ="G:/myclass.txt";
	    	  //file类
	    	   File file = new File(path);
	    	   //方法
	    	   boolean del =file.delete();
	    	   System.out.println("del="+del);
	       }
	       /**
	        * 创建多级文件夹
	        */
	       
	       public void test5(){
	    	   //路径
	    	   String path="G:/mywork/music/weidao/2016";
	    	   //file类
	    	   File file = new  File(path);
	    	   //方法
	    	   boolean succ = file.mkdirs();
	    	   System.out.println("succ="+succ);
	       }
	       
	       /**
	        * 删除多级文件夹
	        * 不可能一下子删除多个文件夹  要先删除里层再删除外层  一层一层删除
	        */
//	       
	       public void test6(){
	    	   //路径
	    	   String path="G:/mywork/music/weidao/2016";
	    	   //file类
	    	   File file = new File(path);
	    	   //方法
	           boolean del = file.delete();
	           System.out.println("del="+del);
	       }
	       
	       /**
	        * 其他方法
	        */
	       public void test7(){
	    	   //路径
	    	   String path="G:/aaa";
	    	   
	    	   //file类
	    	   File file = new File(path);
	    	   
	    	   //其他方法
	    	   System.out.println("exists:"+ file.exists());//判断对象file是否存在
	    	   System.out.println("name:"+file.getName());//获得文件夹名字
	    	   System.out.println("path:"+file.getPath());//获得文件夹路径
	    	   System.out.println("length:"+file.length());//获得内容的长度
	    	   System.out.println("Absolute:"+file.isAbsolute());//
	    	   System.out.println("file:"+file.isFile());//判断是否存在这个文件
	    	   System.out.println("Directory:"+file.isDirectory());//判断是否存在这个文件夹
	    	   System.out.println("Hidden:"+file.isHidden());//判断是否隐藏
	    	   System.out.println("lastModified"+file.lastModified());//返回最后修改的时间
	    	  SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd-hh:mm:ss");
	    	   String date= sdf.format(file.lastModified());
	    	   System.out.println("lastModified:"+date);//转变时间格式
	    	   System.out.println("getParent:"+file.getParent());//获得上级目录 途径
	    	   System.out.println("Dome1.test7()"+file.getParentFile().getName());//下级目录有文件或文件夹时否则报错 	   
	       }
	     
	      /**
	       * 其他路径1
	       */
	           public void test8(){
	    	   //路径
	    	   String path ="G:/aaa/love";
	    	   //file类
	    	   File file = new File(path);
	    	   
	    	   //存在
	    	   System.out.println("Directory:"+file.isDirectory());
	    	   //上一级路径
	    	   System.out.println("Dome1.test8()"+file.getParent());
	    	   //下一级路径
	    	   String [] paths=file.list();//定义paths为string数组，且是文件列表
	    	   //方法
	    	   for (String p : paths) {//如果p是paths中的元素
	    		   System.out.println("Children"+p);//输出p
	  			}
	    	   //上一级文件
	    	   System.out.println("ParentFile"+file.getParentFile().getName());
	    	   
	    	  //下一级文件
	    	  File[] files=file.listFiles(); 
	    	  for (File f :files ) {
				System.out.println("Children"+f.getName());
			}
	    	  
	       }
	
	  }
	












