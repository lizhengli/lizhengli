public class RongYao{
	String hero;
	String pifu;
	int dianjuan;
	String type;
	int daqu;
	public void paiwei(){
		System.out.println("���ͨ����λ���������Լ��Ķ�λ�������Լ���ʵ����������λ��Сѧ���Ϳ�̫���ˣ�"+"\n");
	}
	public void chongzhi(){
		System.out.println("���ĵ�ȯ�����Ƿ��ֵ��"+"\n");
	}
	public void playgame(){
		System.out.println("������λ����ʼ"+"\n");
	}
	public void say(){
		System.out.println("ʹ��"+hero+"������һ��"+type+"\n");
	}
	public RongYao(String h,String p,int dj,String t,int dq){
		hero = h;
		pifu = p;
		dianjuan = dj;
		type = t;
		daqu = dq;
	}
}