import java.util.*;
public class SanJiaoException{
	public static void main(String[] args) throws Exception{
		System.out.println("请输入三角形的边长a,b,c");
		int a = 0,b = 0,c = 0;
		Scanner sc = new Scanner(System.in);
		try{
			 a = sc.nextInt();
			 b = sc.nextInt();
			 c = sc.nextInt();
		}catch(/*MySanJiao*/Exception e){
			System.out.println("请输入整数");
			System.out.println(e.toString());
			System.out.println(e.getMessage());
		}
		MySanJiaoException s = new MySanJiaoException();
		s.message(a,b,c);
		
	}
}
class MySanJiaoException extends Exception{
	public void message(int a,int b,int c) throws Exception{
			if((a+b>c && (a-b<c && b-a<c)) && (a+c>b && (a-c<b && c-a<b)) && (b+c>a && (b-c<a && c-b<a))){
				System.out.println(a+"\t"+b+"\t"+c);
			}else if(a==0&&b==0&&c==0){
				throw new Exception("边长不能为零");
			}else{
				throw new Exception("构成三角形的条件不成立");
			}
		}
		public MySanJiaoException(){
		
		}
		public MySanJiaoException(String s){
			super(s);
		}
}
