public class Computer{
	String cname;//��������
	String system;//����ϵͳ
	int type;//��������1������2����Ϸ��....
	int price;//���Լ۸�/Ԫ
	int neicun;//�����ڴ�
	String company;//���Գ���
	public void watchTV(){
		System.out.println("���Կ��Կ���Ӱ"+"\n");
	}
	public void shangwang(){
		System.out.println("���Կ�������"+"\n");
	}
	public void playgame(){
		System.out.println("���Կ��Դ���Ϸ"+"\n");
	}
	public void bianma(){
		System.out.println("���Կ��Ա���"+"\n");
	}
	public void say(){
		System.out.println(cname+"��������������Ϸ������Ӱ�칫���ǲ��ڻ��£��۸����ֻҪ"+price+"Ԫ"+"\n");
	}
	public Computer(String n,String s,int t,int p,int nc,String c){
		cname = n;
		system = s;
		type = t;
		price = p;
		neicun = nc;
		company = c;
	}

}