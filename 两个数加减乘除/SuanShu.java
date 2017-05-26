import java.util.*;
public class SuanShu{
	public static void main(String[] args){
		System.out.println("请输入两个数计算加减乘除");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("相加"+(a+b));
		System.out.println("相减"+(a-b));
		System.out.println("相乘"+(a*b));
		System.out.println("相除"+((float)(a/(float)b)));
	}
}