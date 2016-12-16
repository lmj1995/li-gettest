package www.lmj.dome;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;
import javax.swing.plaf.synth.SynthStyle;
import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

/**
 *除数为零
 */
public class Dome {
     public void exception1(){
    	 
    
	   int a = 10;
	   int b = 0;
	   int c = a / b;
	   
	   System.out.println("c="+c);
	   
	   //除数不能为零，但是代码正常
     }
     
     public void exception2(){
    	 int[] arr={1,2,3,4};
    	 int a = arr[4];
    	 
    	 
    	 System.out.println("a="+a);
    	 
    //代码正常  但是下标越界	 
     }
     
     /**
      * 异常处理方式
      * try  catch
      */
     
     public void exception3(){
     
     //除法运算
     int a =10;
     int b =0;
     int c =0;
     
     try{
    	 c=a/b;
     }catch(Exception e){
    	 System.out.println("程序发生异常");
     }
       System.out.println("c="+c);
   }  
     
     public void exception4(){
    	 
    	 int[]  arr={1,2,3};
    	 int a =0;
    	 
    	 try {
    		 a=arr [3];
		} catch (Exception e) {
			System.out.println("程序异常");
		}
    	    System.out.println("a="+a);
     }
     /**
      * try cacth 研究
      */
     
     
     public void exception5(){
    	 int a = 10;
    	 int b = 0;
    	 int c =0;
    	 try {
			c=a/b;
			System.out.println("程序正常");
		} catch (Exception e) {
			c=Integer.MAX_VALUE;//最大值
		   System.out.println("程序异常");
		}finally{
			System.out.println("最终");
		}
    	 System.out.println("c="+c);
    	 
    	 
     }
     
     
     public void exception6(){
    	 int a = 10;
    	 int b = 0;
    	 int c = 0;
    	 
    	 
      	 try {
			c=a/b;
			System.out.println("正常输出1, c="+c);
			a=10;
			b=10;
			c=a/b;
			System.out.println("正常输出2,c="+c);
		} catch (Exception e) {
			a=3;
			b=2;
			c=a*b;
			System.out.println("异常输出, c="+c);
		}finally{
			a=1;
			b=2;
			c=a+b;
			System.out.println("最中输出, c="+c);
			
		}
      	 System.out.println("程序结束");
     }
     
     /**
      * 抛出异常
      */
     
     public void exception7()throws Exception{
    	 
    	 int a=10;
    	 int b =0;
    	 int c=0;
    	 if (b==0) {
       throw new Exception("divisor is zero!");
		}
    	 
    	 c=a/b;
    	 
    	 System.out.println("c="+c);
    	 
     }
     /**
      *模拟异常
      */
     //计算平均值    百分制   要排除负数和大于100的成绩
     public int avg()throws Exception{
    	 
    	 int[] score={60,56,34,27,35,122,32,-12,23 };
    	 
    	 int sum=0;
    	 for (int i = 0; i < score.length; i++) {
			if (score[i]<0) {
				throw new Exception("score<0");
				
			}else  if (score[i]>100) {
				throw new Exception("score>100");				
			}else {
				sum += score[i];
				System.out.println(i + "次，sum=" + sum);
			}
		}
    	 int avg=sum/10;
    	 
    	 System.out.println("sum="+sum);
    	
		return  avg;
    	 
     }
     
     
     
     
     
     
}

































