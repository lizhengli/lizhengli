public class Phone{
	String sname;//�ֻ�����
	String system;//�ֻ�ϵͳ
	int price;//�ֻ��۸�/Ԫ
	int neicun;//�ֻ��ڴ�
	String company;//�ֻ�����
	public void call(){
		System.out.println("�ֻ����Դ�绰�ͷ�����"+"\n");
	}
	public void watch(){
		System.out.println("�ֻ����Կ���Ƶ��С˵"+"\n");
	}
	public void shangwang(){
		System.out.println("�ֻ���������"+"\n");
	}
	public void playgame(){
		System.out.println("�ֻ��������ֻ���Ϸ"+"\n");
	}
	public void say(){
		System.out.println(sname+"������������������ҫ������Ƶ���ǲ��ڻ��£��۸����ֻҪ"+price+"Ԫ"+"\n");
	}
	public Phone(String n,String s,int p,int nc,String c){
		sname = n;
		system = s;
		price = p;
		neicun = nc;
		company = c;
	}

}