public class ShangPn{
	 String jname;
	 String cname;
	 int s;
	 int c;
	public  void sayj(){
		System.out.println("��Ʒ����"+jname+"��������"+s+"\n");
	}
	public  void sayc(){
		System.out.println("��Ʒ����"+cname+"��������"+c+"\n");
	}
	public  ShangPn(String jname,int s){
		this.jname = jname;
		this.s = s;
	}
	public ShangPn(int c,String cname){
		this.c = c;
		this.cname = cname;
	}
	public ShangPn(String n,String m,int b){
		jname = n;
		cname = m;
		s = b;
	}
	public void say(){
		System.out.println("�������Ϊ"+s);
	}
}