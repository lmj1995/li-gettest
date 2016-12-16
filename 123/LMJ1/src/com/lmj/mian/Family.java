package com.lmj.mian;
/**
 * 
 *家庭成员
 *属性：  爷爷  奶奶  妈妈
 *方法：  起床  工作  玩  睡觉  
 *
 */
public class Family {
  //属性
    private Grandma grandma=null;
    private Grandpa grandpa=null;
    private Mum mum=null;
    //构造
    public Family(Grandma grandma,Grandpa grandpa,  Mum mum ){
    	this.grandma=grandma;
    	this.grandpa=grandpa;
    	this.mum=mum;    			
    }
    public void infor() {
		grandpa.infor();
		grandma.infor();
		
	}

    //方法
   public void daystart(){
	    grandpa.getup();
		grandma.getup();
		mum.getup();	   
   }
   private void worke() {
		// 工作
		grandpa.worke();
		grandma.worke();
		mum.worke();
	}
   private void play() {
		// 娱乐
		grandpa.play();
		grandma.play();
		mum.play();
	}
   private void dayEnd() {
		grandpa.sleep();
		grandma.sleep();
		mum.sleep();
	}
   public void day(){
		daystart();
		worke();
		play();
		dayEnd();
	}
	public Grandma getGrandma() {
		return grandma;
	}
	public void setGrandma(Grandma grandma) {
		this.grandma = grandma;
	}
	public Grandpa getGrandpa() {
		return grandpa;
	}
	public void setGrandpa(Grandpa grandpa) {
		this.grandpa = grandpa;
	}
	public Mum getMum() {
		return mum;
	}
	public void setMum(Mum mum) {
		this.mum = mum;
	}
    
}
