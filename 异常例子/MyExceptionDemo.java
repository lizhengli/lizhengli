class MyException extends Exception{
	public void myexception(String str){
		if(str==null){
			System.out.println("���벻��Ϊ��");
		}else if(str.equals("$")){
			System.out.println("���벻�����������");
		}else{
			System.out.println(str);
		}
	}
	public MyException(){
	}
	public MyException(String str){
		myexception(str);
	}
}
public class MyExceptionDemo{
	public static void main(String[] args){
		MyException me = new MyException();
		me.myexception("$");

	}
}