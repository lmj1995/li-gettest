package com.lmj.dome2;

public class Bank {

	//����
	private String name="";
	private  int money=0;
	//����
	public Bank(String name, int money){
		this.money=money;
		this.name=name;
	}
	//����
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
		//����
		private String name="";
		
		//����
		public Boy(String name){
			this.name=name;
		}
		//����
		public int outMoney(int count){
		money -= count;
		System.out.println("money="+money);
		return count;
		}		
	}
	public class Gril{
		//����
		private  String name="";
				
		//����
		public Gril(String name){
			this.name=name;
		}
		//����
		public int outMoney(int count){
			money += count;
			System.out.println("money="+money);
			return count;
		}
	}
}








