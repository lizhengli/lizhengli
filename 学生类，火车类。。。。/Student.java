public class Student{
	String sname;//����
	int age;//����
	char sex;//�Ա�
	
	//����
	public void eat(){
		System.out.println("eating");//��
	}
	public void study(){
		System.out.println("Study");//ѧϰ
	}
	public void playGame(){
		System.out.println("Let's playing WangZheRongYao!");//����Ϸ
	}
	public void say(){
		System.out.println("�ҽ�"+sname+","+"����"+age+"��"+"��һ����"+sex+"����");//˵��
	}
	//������
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