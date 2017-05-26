import java.util.Scanner;
public class Management{
	//����
	public static Scanner sc = new Scanner(System.in);
	//ѧ����Ϣ
	static Student[] stus = new Student[100];
	Student stu = new Student();
	//�˵�
	int count = 0;
	public void menu(){
		while(true){
			System.out.println("---------------------------------");
			System.out.println("--��ѡ�����蹦�ܣ���ţ���-------");
			System.out.println("----1.���-----------------------");
			System.out.println("----2.��ѯ-----------------------");
			System.out.println("----3.ɾ��-----------------------");
			System.out.println("----4.�޸�-----------------------");
			System.out.print("----5.�˳�-----------------------\n---------------------------------\n���룺");
			int num = sc.nextInt();
			switch(num){
				case 1://���
					addDate();
					break;
				case 2://��ѯ
					selectDate();
					break;
				case 3://ɾ��
					deleteDate();
					break;
				case 4://�޸�
					updateDate();
					break;
				case 5://�˳�
					System.exit(0);
					break;
				default://���������ʾ
					System.out.print("û�д�ѡ�");
			}
		}
	}
	//��������
	static int i=0;
	static void addDate(){
		while(true){
			System.out.println("----------------------------\nѧ����"+(i+1));
			i++;
			System.out.print("����������");
			String name = sc.next();
			System.out.print("�����Ա�");
			char sex = sc.next().charAt(0);
			System.out.print("�������䣺");
			int age = sc.nextInt();
			for(int i=0;i<stus.length;i++){
				if(stus[i]==null){
					Student stu2 = new Student(name,sex,age,i+1);
					stus[i]=stu2;
					break;
				}
			}
			//�Ƿ�������
			System.out.println("��ӳɹ�,�Ƿ������ӣ�\n1.��\n2.��\n���������˳���ӣ�");
			int num = sc.nextInt();
			if(num==1){
			
			}else{
				break;
			}
		}
	}
	//���
	public void add(){
		while(true){
			System.out.println("��ѡ��Ҫ�޸ĵ��У�\n1.���\n2.����\n3.�Ա�\n4.����\n5.�����ϼ��˵�");
			int num = sc.nextInt();
			switch(num){
				case 1:
					System.out.print("��ţ�");
					int id = sc.nextInt();
					stu.sId(id);
					break;
				case 2:
					System.out.print("������");
					String name = sc.next();
					stu.sName(name);
					break;
				case 3:
					System.out.print("�Ա�");
					char sex = sc.next().charAt(0);	
					stu.sSex(sex); 
					break;
				case 4:
					System.out.print("���䣺");
					int age = sc.nextInt();
					stu.sAge(age);
					break;
				case 5:
					updateDate();
					break;
				default:
					System.out.print("û�д�ѡ�");
			}
			System.out.println("�Ƿ��޸������ֶ�(ѡ�ظ���Ϊ���һ��ѡ���ֵ)��\n1.��\n2.��\n���������˳��޸ģ�");
			int num2 = sc.nextInt();
			if(num2==1){
				
			}else{
				break;
			}
		}
	}
	//��ѯ����
	public void selectDate(){
		while(true){
			System.out.println("ѡ���ѯ���ͣ�\n1.��������\n2.������ѯ\n3.���ز˵�");
			int num = sc.nextInt();
			switch(num){
				case 1:
					System.out.println("| ���"+" |  ���� "+" | �Ա� "+" | ���� |");
					selectDate1(1);
					break;
				case 2:
					System.out.println("");
					selectDate2(1);
					break;
				case 3:
					menu();
					break;
				default:
					System.out.print("û�д�ѡ���");
			}
			System.out.println("��ѯ�ɹ�,�Ƿ��ѯ���������\n1.��\n2.��");
			int num2 = sc.nextInt();
			if(num2==1){
			
			}else{
				break;
			}
		}
	}
	//ɾ������
	public void deleteDate(){
		while(true){
			System.out.println("ѡ��ɾ�����ͣ�\n1.��������\n2.ָ������\n3.���ز˵�");
			int num = sc.nextInt();
			switch(num){
				case 1:
					selectDate1(2);
					break;
				case 2:
					add();
					selectDate2(2);
					break;
				case 3:
					menu();
					break;
				default:
					System.out.print("û�д�ѡ���");
			}
			System.out.println("ɾ���ɹ�,�Ƿ����ɾ����\n1.��\n2.��");
			int num2 = sc.nextInt();
			if(num2==1){
			
			}else{
				break;
			}
		}
	}
	//�޸�����
	public void updateDate(){
		while(true){
			System.out.println("ѡ���޸ķ�ʽ��\n1.����������\n2.ָ������\n3.���ز˵�");
			int num = sc.nextInt();
			switch(num){
				case 1:
					add();
					selectDate1(3);
					break;
				case 2:
					selectDate2(3);
					break;
				case 3:
					menu();
					break;
				default:
					System.out.print("û�д�ѡ���");
			}
			System.out.println("�޸ĳɹ�,�Ƿ�����޸ģ�\n1.��\n2.��");
			int num2 = sc.nextInt();
			if(num2==1){
			
			}else{
				break;
			}
		}
	}
	//�޸�
	public void upDate(int k,Student url){
		if(url.sId()!=0){
			stus[k].sId(url.sId());
		}
		if(url.sName()!=null){
			stus[k].sName(url.sName());
		}
		if(url.sSex()!=' '){
			stus[k].sSex(url.sSex());
		}
		if(url.sAge()!=0){
			stus[k].sAge(url.sAge());
		}
	}
	//��ѯ��������
	public void selectDate1(int k){
		//������
		count = 0;
		//��������ѧ��
		for(int i=0;i<stus.length;i++){
			if(stus[i]!=null){
				count++;
				switch(k){
					case 1:
						stus[i].shuchu();
						break;
					case 2:
						stus[i]=null;
						break;
					case 3:
						upDate(i,stu);
						break;
				}
			}
		}
	}
	//��������
	//k==1;--->��ѯ����
	//k==2;--->ɾ������
	//k==3;--->�޸�����
	public void selectDate2(int k){
		System.out.println("  �������ѯ����(\"*\"��ʾȫ��)��");
		System.out.print("    ����Ϊ��");
		String name = sc.next();
		System.out.print("    �Ա�Ϊ��");
		char sex = sc.next().charAt(0);
		System.out.println("  ��ѡ���䷶Χ��");
		System.out.println("    1.���ڵ���");
		System.out.println("    2.С�ڵ���");
		System.out.println("    3.����");
		System.out.println("    4.֮��(С-->��)");
		System.out.println("    5.����");
		int num = sc.nextInt();
		//����
		int age=0;
		int age2=0;
		if(num!=5){
			System.out.print("ֵ��");
			age = sc.nextInt();
			if(num==4){
				age2 = sc.nextInt();
				System.out.print("ֵ2��");
			}
		}
		System.out.println("����");
		//�ж�����
		boolean bName=true;
		//�ж��Ա�
		boolean bSex=true;
		//�ж�����
		boolean bAge=true;
		//�ж�����Ԫ���Ƿ�Ϊ��
		boolean bStus=true;
		if(k==3){			
			add();
		}
		if(k==1){
			System.out.println("| ���"+" |  ���� "+" | �Ա� "+" | ���� |");
		}
		//������
		count = 0;
		//��������������ѧ��
		for(int i=0;i<stus.length;i++){
			bStus = (stus[i]!=null);
			if(bStus){
				bName = (stus[i].sName().equals(name)||name.charAt(0)=='*');
				bSex = (stus[i].sSex()==sex||sex=='*');
				switch(num){
					case 1:
						bAge = (stus[i].sAge()>=age);
						break;
					case 2:
						bAge = (stus[i].sAge()<=age);
						break;
					case 3:
						bAge = (stus[i].sAge()==age);
						break;
					case 4:
						bAge = (stus[i].sAge()>=age&&stus[i].sAge()<=age2);
						break;
					case 5:
						bAge=true;
						break;
					default:
						System.out.println("û�д�ѡ���ѡ��");
				}
			}
			if(bStus&&bName&&bSex&&bAge){
				switch(k){
					case 1://��ѯ
						stus[i].shuchu();
						break;
					case 2://ɾ��
						stus[i]=null;
						break;
					case 3://�޸�
						upDate(i,stu);
						break;
				}
			}
		}
	}
}