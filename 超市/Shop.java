import java.util.*;
public class Shop{
	static ShangPn[] j = new ShangPn[100];//����������
	static ShangPn[] k = new ShangPn[100];//����������
	static int i=0,p=0;
	private static String jname;//��������
	private static String cname;//��������
	static int s;//������������ʼֵ
	static int c;//������������ʼֵ
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		Shop.mnue();
	}
	public static void mnue(){//���˵�
		System.out.println("================");
		System.out.println("��������Ҫ�Ĺ���");
		System.out.println("==1.���ӽ�����==");
		System.out.println("==2.����������==");
		System.out.println("==3.�鿴========");
		System.out.println("==4.����========");
		System.out.println("==5.ɾ��========");
		System.out.println("==��������˳�==");
		System.out.println("================");
		char o = sc.next().charAt(0);
		if(o=='1'){
			jinHuo();
		}else if(o=='2'){
			chuHuo();
		}else if(o=='3'){
			search();
		}else if(o=='4'){
			update();
		}else if(o=='5'){
			delete();
		}else{
			System.exit(-1);
		}
	}
	public static void jinHuo(){//����
		System.out.println("�������������");
		String jname = sc.next();
		System.out.println("�������������");
		int s = sc.nextInt();
		ShangPn shop = new ShangPn(jname,s);
		j[i]=shop;
		i++;
		while(true){
			System.out.println("��ӳɹ�,1.�������,2.���ز˵�");
			char c = sc.next().charAt(0);
			if(c=='1'){
				jinHuo();
				break;
			}else if(c=='2'){
				mnue();
				break;
			}else{
				System.out.println("��������ѡ����Ҫ�Ĺ���");
			}
		}
		
	}
	public static void chuHuo()//����
		System.out.println("��������������");
		int c = sc.nextInt();
		System.out.println("��������������");
		String cname = sc.next();
		ShangPn shop = new ShangPn(c,cname);
		k[p] = shop;
		p++;
		while(true){
			System.out.println("��ӳɹ�,1.�������,2.���ز˵�");
			char sz = sc.next().charAt(0);
			if(sz=='1'){
				chuHuo();
				break;
			}else if(sz=='2'){
				mnue();
				break;
			}else{
				System.out.println("��������ѡ����Ҫ�Ĺ���");
			}
		}
	}
	public static void search(){//��ѯ
		System.out.println("1.�鿴������,2.�鿴������,3.�鿴�ܿ��");
		char a = sc.next().charAt(0);
		if(a=='1'){
			System.out.println("1.�����ѯ,2.ȫ����ѯ");
				char n = sc.next().charAt(0);
				if(n=='1'){
					System.out.println("������Ҫ��ѯ�Ļ�������");
					String mc = sc.next();
					for(int i=0;i<j.length;i++){
						if(j[i]!=null && mc.equals(j[i].jname)){
							j[i].sayj();
						}
					}
				}else if(n=='2'){
					for(ShangPn s:j){
						if(s!=null){
							s.sayj();
						}
					}
					panduan();
				}else{
					System.out.println("��������ѡ����Ҫ�Ĺ���");
				}
			
		}else if(a=='2'){
			System.out.println("1.�����ѯ,2.ȫ����ѯ");
				char b = sc.next().charAt(0);
				if(b=='1'){
					System.out.println("������Ҫ��ѯ�Ļ�������");
					String mc = sc.next();
					for(int i=0;i<k.length;i++){
						if(k[i]!=null && mc.equals(k[i].jname)){
							k[i].sayc();
						}
					}
					panduan();
				}else if(b=='2'){
					for(ShangPn s:k){
						if(s!=null){
							s.sayc();
						}
					}
				}else{
					System.out.println("��������ѡ����Ҫ�Ĺ���");
				}
				panduan();
				
		}else if(a=='3'){
			System.out.println("������");
			for(ShangPn jh:j){
				if(jh!=null){
					jh.sayj();
				}
			}
			System.out.println("������");
			for(ShangPn ch:k){
				if(ch!=null){
					ch.sayc();
				}
			}
		}
		panduan();
	}
	public static void update(){//����
		System.out.println("1.���½�����,2.����������");
		char b = sc.next().charAt(0);
		if(b=='1'){
			System.out.println("������Ҫ�޸ĵ���Ʒ");
			String n = sc.next();
			for(int i=0;i<j.length;i++){
				if(j[i]!=null && n.equals(j[i].jname)){
					System.out.println("�������������");
					String jname = sc.next();
					System.out.println("�������������");
					int s = sc.nextInt();
					ShangPn shop = new ShangPn(jname,s);
					j[i]=shop;
				}
			}
			panduan();
		}else if(b=='2'){
			System.out.println("������Ҫ�޸ĵ���Ʒ");
			String n = sc.next();
			for(int i=0;i<j.length;i++){
				if(k[i]!=null && n.equals(k[i].cname)){
					System.out.println("��������������");
					String jname = sc.next();
					System.out.println("��������������");
					int s = sc.nextInt();
					ShangPn shop = new ShangPn(cname,c);
					k[i]=shop;
				}
			}
		}
	}
	public static void delete(){//ɾ��
		System.out.println("1.ɾ��������,2.ɾ��������");
		char c = sc.next().charAt(0);
		if(c=='1'){
			System.out.println("1.ȫ��ɾ��,2.ɾ������");
			char b = sc.next().charAt(0);
			if(b=='1'){
				for(int i=0;i<j.length;i++){
					if(j[i]!=null){
						j[i]=null;
					}
				}
			}else if(b=='2'){
				System.out.println("������Ҫɾ������Ʒ����");
				String sp = sc.next();
				for(int i=0;i<j.length;i++){
					if(j[i]!=null && sp.equals(j[i].jname)){
						j[i]=null;
					}
				}
			}
		}else if(c=='2'){
			System.out.println("1.ȫ��ɾ��,2.ɾ������");
			char b = sc.next().charAt(0);
			if(b=='1'){
				for(int i=0;i<k.length;i++){
					if(k[i]!=null){
						k[i]=null;
					}
				}
			}else if(b=='2'){
				System.out.println("������Ҫɾ������Ʒ����");
				String sp = sc.next();
				for(int i=0;i<k.length;i++){
					if(k[i]!=null && sp.equals(k[i].cname)){
						k[i]=null;
					}
				}
			}
			while(true){
					System.out.println("1.����,2.���ز˵�");
					char h = sc.next().charAt(0);
					if(h=='1'){
						delete();
						break;
					}else if(h=='2'){
						mnue();
						break;
					}else{
						System.out.println("������������������");

					}
				}

		}
	}
	public static void panduan(){
		while(true){
					System.out.println("1.����,2.���ز˵�");
					char h = sc.next().charAt(0);
					if(h=='1'){
						search();
						break;
					}else if(h=='2'){
						mnue();
						break;
					}else{
						System.out.println("������������������");

					}
				}
	}
}