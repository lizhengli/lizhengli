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
	System.out.println("===1.存款=========");
	System.out.println("===2.取款=========");
	System.out.println("===3.查询=========");
	System.out.println("==================");
	System.out.println("请输入想要的服务");
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
			System.out.println("输入有误重新输入");
			mnue();
			break;
	}
 } 
	public static void cun(){
		System.out.println("请输入用户名");
		String n = sc.next();
		System.out.println("请输用户密码");
		String m = sc.next();
		System.out.println("请输入存款金额");
		int c = sc.nextInt();
		ShangPn q = new ShangPn(n,m,c);
		bank[i++]=q;
		while(true){
			System.out.println("存款成功1.继续存款,2.返回菜单");
			int pd = sc.nextInt();
			if(pd==1){
				cun();
				break;
			}else if(pd==2){
				mnue();
				break;
			}/*else{
				System.out.println("输入有误，重新输入");
			}*/
		}
	}
	public static void qukuan(){
		System.out.println("请输入用户名");
		String mz = sc.next();
		for(int i=0;i<bank.length;i++){
			if(bank[i]!=null && mz.equals(bank[i].jname)){
				System.out.println("请输入密码");
				String p = sc.next();
				for(int c=0;c<bank.length;c++){
					if(bank[c]!=null && p.equals(bank[c].cname)){
						System.out.println("请输入取款金额");
						int qk = sc.nextInt();
						//System.out.println(bank[c].s);
						if(qk<bank[c].s){
							bank[c].s=bank[c].s-qk;
							while(true){
								System.out.println("取款成功余额为"+(bank[c].s));
								System.out.println("取款成功1.继续取款,2.返回菜单");
								int l = sc.nextInt();
								if(l==1){
									qukuan();
								}else if(l==2){
									mnue();
								}else{
									System.out.println("输入有误请重新输入");
								}
							}
						}else{
							System.out.println("余额不足");
							while(true){
								System.out.println("1.继续取款,2.返回菜单");
								int l = sc.nextInt();
								if(l==1){
									qukuan();
								}else if(l==2){
									mnue();
								}else{
									System.out.println("输入有误请重新输入");
								}
							}
						}
					}
				}
			}
		}
		System.out.println("输入用户名有误1.重新输入，2.返回菜单");
			int i = sc.nextInt();
			if(i==1){
				qukuan();
			}else if(i==2){
				mnue();
			}
	}
	public static void select(){
		System.out.println("请输入用户名");
		String mz = sc.next();
		for(int i=0;i<bank.length;i++){
			if(bank[i]!=null && mz.equals(bank[i].jname)){
				System.out.println("请输入密码");
				String p = sc.next();
				if(p.equals(bank[i].cname)){
					bank[i].say();
				}
				//for(int c=0;c<bank.length;c++){
					//if(bank[c]!=null && p.equals(bank[c].cname)){
						/*System.out.println("请输入取款金额");
						int qk = sc.nextInt();
						if(qk<bank[c].c){
							while(true){
								System.out.println("取款成功1.继续取款,2.返回菜单");
								int l = sc.nextInt();
								if(l==1){
									qukuan();
								}else if(l==2){
									mnue();
								}else{
									System.out.println("输入有误请重新输入");
								}
							}
						}else{
							System.out.println("余额不足");
							mnue();
						}*/
					//}
				//}
			}
		}
		while(true){
			System.out.println("1.继续查询,2.返回菜单");
			int c = sc.nextInt();
			if(c==1){
				select();
				break;
			}else if(c==2){
				mnue();
				break;
			}else{
				System.out.println("输入有误请重新输入");
			}
		}
	}

}