interface IA{//�ӿ�IA
	//int a;
	public static final double PI = 3.14;
	abstract void abs();
	//public void abs2(){
	//	System.out.println("���ǳ������е���ͨ������");
	//}
}
interface IA2 extends IA{//�ӿ�IA2	
	public static final double PI2 = 3.0;
	//int a;
	abstract void abs2();
}
class C implements IA2{//ֻ�����˽ӿ�IA��
	public void abs(){
		System.out.println("����IA�ӿڳ��󷽷���");
	}
	public void abs2(){
		System.out.println("����IA2�ӿڳ��󷽷���");
	}
}
public class Bb{
	public static void main(String[] args){
		IA2 c = new C();
		c.abs();
		c.abs2();
		//c2.abs2();
		new C().abs2();
		System.out.println(c.PI);
		System.out.println(c.PI2);
		//new C().abs2();
	}
}