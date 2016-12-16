package com.lmj.mian;
/**
 * 妈妈
 * 属性：  名字   年龄  爱好
 * 方法： 起床   工作   娱乐   睡觉
 *
 */


//属性
public class Mum {
    private String name="";
    private int age=0;
    private String hobby="";
    //构造
    public  Mum( String name,int age,String hobby){
    	this.name=name;
    	this.age=age;
    	this.hobby=hobby;
    }
    //方法
    public void getup(){
		System.out.println(getName()+"起床了");
	}
	public void worke(){
		System.out.println(getName()+"上班");
	}
	public void play(){
		System.out.println(getName()+"唱歌");
	}
	public void sleep(){
		System.out.println(getName()+"晚安");
	}
	//自我介绍
		public void infor(){
			System.out.println("name:"+getName()+"age"+getAge()+"hobby"+getHobby()
					);
			
		}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
}

   


