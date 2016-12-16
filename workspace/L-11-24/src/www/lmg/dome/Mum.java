package www.lmg.dome;

public  class Mum {

	//属性
	private String name="";

	//构造
	public Mum(String name){
		this.name=name;
	}
	//方法
	public  void eat(){
		System.out.println(name+"chimian");
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
