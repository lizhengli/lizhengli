public class Student{
	String sname;//姓名
	int age;//年龄
	char sex;//性别
	
	//方法
	public void eat(){
		System.out.println("eating");//吃
	}
	public void study(){
		System.out.println("Study");//学习
	}
	public void playGame(){
		System.out.println("Let's playing WangZheRongYao!");//玩游戏
	}
	public void say(){
		System.out.println("我叫"+sname+","+"今年"+age+"岁"+"是一个，"+sex+"孩儿");//说话
	}
	//构造器
	public Student(String sn){
		sname = sn;
	}
	public Student(String n,int a,char s){
		sname = n;
		age = a;
		sex = s;
	}
	public Student(int a){
		age = a;
	}
	public Student(char s){
		sex = s;
	}
}