import java.util.*;
public class Bank{
	private static ShangPn[] bank = new ShangPn[100];
	private static int i = 0;
	private static String name;
	private static String mm;
	private static int money;
	private static Scanner sc = new Scanner(System.in);
	public static void mnue(){
	System.out.println("==================");
	System.out.println("===1.���=========");
	System.out.println("===2.ȡ��=========");
	System.out.println("===3.��ѯ=========");
	System.out.println("==================");
	System.out.println("��������Ҫ�ķ���");
	int m = sc.nextInt();
	switch(m){
		case 1:
			cun();
			break;
		case 2:
			qukuan();
			break;
		case 3:
			select();
			break;
		default:
			System.out.println("����������������");
			mnue();
			break;
	}
 } 
	public static void cun(){
		System.out.println("�������û���");
		String n = sc.next();
		System.out.println("�����û�����");
		String m = sc.next();
		System.out.println("����������");
		int c = sc.nextInt();
		ShangPn q = new ShangPn(n,m,c);
		bank[i++]=q;
		while(true){
			System.out.println("���ɹ�1.�������,2.���ز˵�");
			int pd = sc.nextInt();
			if(pd==1){
				cun();
				break;
			}else if(pd==2){
				mnue();
				break;
			}/*else{
				System.out.println("����������������");
			}*/
		}
	}
	public static void qukuan(){
		System.out.println("�������û���");
		String mz = sc.next();
		for(int i=0;i<bank.length;i++){
			if(bank[i]!=null && mz.equals(bank[i].jname)){
				System.out.println("����������");
				String p = sc.next();
				for(int c=0;c<bank.length;c++){
					if(bank[c]!=null && p.equals(bank[c].cname)){
						System.out.println("������ȡ����");
						int qk = sc.nextInt();
						//System.out.println(bank[c].s);
						if(qk<bank[c].s){
							bank[c].s=bank[c].s-qk;
							while(true){
								System.out.println("ȡ��ɹ����Ϊ"+(bank[c].s));
								System.out.println("ȡ��ɹ�1.����ȡ��,2.���ز˵�");
								int l = sc.nextInt();
								if(l==1){
									qukuan();
								}else if(l==2){
									mnue();
								}else{
									System.out.println("������������������");
								}
							}
						}else{
							System.out.println("����");
							while(true){
								System.out.println("1.����ȡ��,2.���ز˵�");
								int l = sc.nextInt();
								if(l==1){
									qukuan();
								}else if(l==2){
									mnue();
								}else{
									System.out.println("������������������");
								}
							}
						}
					}
				}
			}
		}
		System.out.println("�����û�������1.�������룬2.���ز˵�");
			int i = sc.nextInt();
			if(i==1){
				qukuan();
			}else if(i==2){
				mnue();
			}
	}
	public static void select(){
		System.out.println("�������û���");
		String mz = sc.next();
		for(int i=0;i<bank.length;i++){
			if(bank[i]!=null && mz.equals(bank[i].jname)){
				System.out.println("����������");
				String p = sc.next();
				if(p.equals(bank[i].cname)){
					bank[i].say();
				}
				//for(int c=0;c<bank.length;c++){
					//if(bank[c]!=null && p.equals(bank[c].cname)){
						/*System.out.println("������ȡ����");
						int qk = sc.nextInt();
						if(qk<bank[c].c){
							while(true){
								System.out.println("ȡ��ɹ�1.����ȡ��,2.���ز˵�");
								int l = sc.nextInt();
								if(l==1){
									qukuan();
								}else if(l==2){
									mnue();
								}else{
									System.out.println("������������������");
								}
							}
						}else{
							System.out.println("����");
							mnue();
						}*/
					//}
				//}
			}
		}
		while(true){
			System.out.println("1.������ѯ,2.���ز˵�");
			int c = sc.nextInt();
			if(c==1){
				select();
				break;
			}else if(c==2){
				mnue();
				break;
			}else{
				System.out.println("������������������");
			}
		}
	}

}