abstract class A{
	int a;
	abstract void abs();
	public void abs2(){
		System.out.println("���ǳ������е���ͨ������");
	}
}
class C extends A{
	public void abs(){
		System.out.println("���Ǽ̳г�����ĳ��󷽷���");
	}
}
public class B{
	public static void main(String[] args){
		new C().abs();
		new C().abs2();
	}
}