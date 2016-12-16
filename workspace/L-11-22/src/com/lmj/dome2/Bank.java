package com.lmj.dome2;

public class Bank {

	//属性
	private String name="";
	private  int money=0;
	//构造
	public Bank(String name, int money){
		this.money=money;
		this.name=name;
	}
	//方法
	public void test1(){
		System.out.println(name+"money:"+money);
	}
	public void in(int money){
		this.money +=money;
		System.out.println("money="+money);
	}
	public void out(int count){
		money -=count;
		System.out.println("money="+money);
	}
	public class Boy{
		//属性
		private String name="";
		
		//构造
		public Boy(String name){
			this.name=name;
		}
		//方法
		public int outMoney(int count){
		money -= count;
		System.out.println("money="+money);
		return count;
		}		
	}
	public class Gril{
		//属性
		private  String name="";
				
		//构造
		public Gril(String name){
			this.name=name;
		}
		//方法
		public int outMoney(int count){
			money += count;
			System.out.println("money="+money);
			return count;
		}
	}
}








