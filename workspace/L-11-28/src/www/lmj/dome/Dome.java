package www.lmj.dome;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;
import javax.swing.plaf.synth.SynthStyle;
import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

/**
 *����Ϊ��
 */
public class Dome {
     public void exception1(){
    	 
    
	   int a = 10;
	   int b = 0;
	   int c = a / b;
	   
	   System.out.println("c="+c);
	   
	   //��������Ϊ�㣬���Ǵ�������
     }
     
     public void exception2(){
    	 int[] arr={1,2,3,4};
    	 int a = arr[4];
    	 
    	 
    	 System.out.println("a="+a);
    	 
    //��������  �����±�Խ��	 
     }
     
     /**
      * �쳣����ʽ
      * try  catch
      */
     
     public void exception3(){
     
     //��������
     int a =10;
     int b =0;
     int c =0;
     
     try{
    	 c=a/b;
     }catch(Exception e){
    	 System.out.println("�������쳣");
     }
       System.out.println("c="+c);
   }  
     
     public void exception4(){
    	 
    	 int[]  arr={1,2,3};
    	 int a =0;
    	 
    	 try {
    		 a=arr [3];
		} catch (Exception e) {
			System.out.println("�����쳣");
		}
    	    System.out.println("a="+a);
     }
     /**
      * try cacth �о�
      */
     
     
     public void exception5(){
    	 int a = 10;
    	 int b = 0;
    	 int c =0;
    	 try {
			c=a/b;
			System.out.println("��������");
		} catch (Exception e) {
			c=Integer.MAX_VALUE;//���ֵ
		   System.out.println("�����쳣");
		}finally{
			System.out.println("����");
		}
    	 System.out.println("c="+c);
    	 
    	 
     }
     
     
     public void exception6(){
    	 int a = 10;
    	 int b = 0;
    	 int c = 0;
    	 
    	 
      	 try {
			c=a/b;
			System.out.println("�������1, c="+c);
			a=10;
			b=10;
			c=a/b;
			System.out.println("�������2,c="+c);
		} catch (Exception e) {
			a=3;
			b=2;
			c=a*b;
			System.out.println("�쳣���, c="+c);
		}finally{
			a=1;
			b=2;
			c=a+b;
			System.out.println("�������, c="+c);
			
		}
      	 System.out.println("�������");
     }
     
     /**
      * �׳��쳣
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
      *ģ���쳣
      */
     //����ƽ��ֵ    �ٷ���   Ҫ�ų������ʹ���100�ĳɼ�
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
				System.out.println(i + "�Σ�sum=" + sum);
			}
		}
    	 int avg=sum/10;
    	 
    	 System.out.println("sum="+sum);
    	
		return  avg;
    	 
     }
     
     
     
     
     
     
}

































