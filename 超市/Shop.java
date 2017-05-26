import java.util.*;
public class Shop{
	static ShangPn[] j = new ShangPn[100];//进货单数组
	static ShangPn[] k = new ShangPn[100];//销货单数组
	static int i=0,p=0;
	private static String jname;//进货名称
	private static String cname;//销货名称
	static int s;//进货单数组起始值
	static int c;//销货单数组起始值
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		Shop.mnue();
	}
	public static void mnue(){//主菜单
		System.out.println("================");
		System.out.println("请输入想要的功能");
		System.out.println("==1.增加进货单==");
		System.out.println("==2.增加销货单==");
		System.out.println("==3.查看========");
		System.out.println("==4.更新========");
		System.out.println("==5.删除========");
		System.out.println("==按任意键退出==");
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
	public static void jinHuo(){//进货
		System.out.println("请输入进货名称");
		String jname = sc.next();
		System.out.println("请输入进货数量");
		int s = sc.nextInt();
		ShangPn shop = new ShangPn(jname,s);
		j[i]=shop;
		i++;
		while(true){
			System.out.println("添加成功,1.继续添加,2.返回菜单");
			char c = sc.next().charAt(0);
			if(c=='1'){
				jinHuo();
				break;
			}else if(c=='2'){
				mnue();
				break;
			}else{
				System.out.println("输入有误选择想要的功能");
			}
		}
		
	}
	public static void chuHuo()//销货
		System.out.println("请输入销货数量");
		int c = sc.nextInt();
		System.out.println("请输入销货名称");
		String cname = sc.next();
		ShangPn shop = new ShangPn(c,cname);
		k[p] = shop;
		p++;
		while(true){
			System.out.println("添加成功,1.继续添加,2.返回菜单");
			char sz = sc.next().charAt(0);
			if(sz=='1'){
				chuHuo();
				break;
			}else if(sz=='2'){
				mnue();
				break;
			}else{
				System.out.println("输入有误选择想要的功能");
			}
		}
	}
	public static void search(){//查询
		System.out.println("1.查看进货单,2.查看销货单,3.查看总库存");
		char a = sc.next().charAt(0);
		if(a=='1'){
			System.out.println("1.具体查询,2.全部查询");
				char n = sc.next().charAt(0);
				if(n=='1'){
					System.out.println("请输入要查询的货物名称");
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
					System.out.println("输入有误选择想要的功能");
				}
			
		}else if(a=='2'){
			System.out.println("1.具体查询,2.全部查询");
				char b = sc.next().charAt(0);
				if(b=='1'){
					System.out.println("请输入要查询的货物名称");
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
					System.out.println("输入有误选择想要的功能");
				}
				panduan();
				
		}else if(a=='3'){
			System.out.println("进货单");
			for(ShangPn jh:j){
				if(jh!=null){
					jh.sayj();
				}
			}
			System.out.println("销货单");
			for(ShangPn ch:k){
				if(ch!=null){
					ch.sayc();
				}
			}
		}
		panduan();
	}
	public static void update(){//更新
		System.out.println("1.更新进货单,2.更新销货单");
		char b = sc.next().charAt(0);
		if(b=='1'){
			System.out.println("请输入要修改的商品");
			String n = sc.next();
			for(int i=0;i<j.length;i++){
				if(j[i]!=null && n.equals(j[i].jname)){
					System.out.println("请输入进货名称");
					String jname = sc.next();
					System.out.println("请输入进货数量");
					int s = sc.nextInt();
					ShangPn shop = new ShangPn(jname,s);
					j[i]=shop;
				}
			}
			panduan();
		}else if(b=='2'){
			System.out.println("请输入要修改的商品");
			String n = sc.next();
			for(int i=0;i<j.length;i++){
				if(k[i]!=null && n.equals(k[i].cname)){
					System.out.println("请输入销货名称");
					String jname = sc.next();
					System.out.println("请输入销货数量");
					int s = sc.nextInt();
					ShangPn shop = new ShangPn(cname,c);
					k[i]=shop;
				}
			}
		}
	}
	public static void delete(){//删除
		System.out.println("1.删除进货单,2.删除销货单");
		char c = sc.next().charAt(0);
		if(c=='1'){
			System.out.println("1.全部删除,2.删除具体");
			char b = sc.next().charAt(0);
			if(b=='1'){
				for(int i=0;i<j.length;i++){
					if(j[i]!=null){
						j[i]=null;
					}
				}
			}else if(b=='2'){
				System.out.println("请输入要删除的商品名称");
				String sp = sc.next();
				for(int i=0;i<j.length;i++){
					if(j[i]!=null && sp.equals(j[i].jname)){
						j[i]=null;
					}
				}
			}
		}else if(c=='2'){
			System.out.println("1.全部删除,2.删除具体");
			char b = sc.next().charAt(0);
			if(b=='1'){
				for(int i=0;i<k.length;i++){
					if(k[i]!=null){
						k[i]=null;
					}
				}
			}else if(b=='2'){
				System.out.println("请输入要删除的商品名称");
				String sp = sc.next();
				for(int i=0;i<k.length;i++){
					if(k[i]!=null && sp.equals(k[i].cname)){
						k[i]=null;
					}
				}
			}
			while(true){
					System.out.println("1.继续,2.返回菜单");
					char h = sc.next().charAt(0);
					if(h=='1'){
						delete();
						break;
					}else if(h=='2'){
						mnue();
						break;
					}else{
						System.out.println("输入有误请重新输入");

					}
				}

		}
	}
	public static void panduan(){
		while(true){
					System.out.println("1.继续,2.返回菜单");
					char h = sc.next().charAt(0);
					if(h=='1'){
						search();
						break;
					}else if(h=='2'){
						mnue();
						break;
					}else{
						System.out.println("输入有误请重新输入");

					}
				}
	}
}