public class HuoChe{
		String hname; /*����*/
		int type; /*������ 1-���� 2-��� ....*/
		int length; /*�𳵳���/��*/
		int weight; /*����������/��*/
	//����
	public void run(){
		System.out.println("���ܵúܿ�"); //�𳵿�����
	}
	public void yunshu(){
		System.out.println("�ҿ������ܶණ��"); //�𳵿����������
	}
	public void ranliao(){
		System.out.println("����Ҫȼ�ϲſ���������"); //����Ҫȼ��-ú̿..
	}
	public void say(){
		System.out.println("����"+hname+"����"+length+"�׳���"+"�ҿ�����"+weight+"�ֵĻ���");
	}
	//������
	public  HuoChe(String hname,int type,int length,int weight){
		this.hname = hname;
		this.type = type;
		this.length = length;
		this.weight = weight;
	}
}