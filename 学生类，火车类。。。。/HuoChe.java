public class HuoChe{
		String hname; /*火车名*/
		int type; /*火车类型 1-高铁 2-轻轨 ....*/
		int length; /*火车长度/米*/
		int weight; /*火车拉货重量/吨*/
	//方法
	public void run(){
		System.out.println("我跑得很快"); //火车可以跑
	}
	public void yunshu(){
		System.out.println("我可以拉很多东西"); //火车可以运输货物
	}
	public void ranliao(){
		System.out.println("我需要燃料才可以跑起来"); //火车需要燃料-煤炭..
	}
	public void say(){
		System.out.println("我是"+hname+"我有"+length+"米长，"+"我可以拉"+weight+"吨的货物");
	}
	//构造器
	public  HuoChe(String hname,int type,int length,int weight){
		this.hname = hname;
		this.type = type;
		this.length = length;
		this.weight = weight;
	}
}