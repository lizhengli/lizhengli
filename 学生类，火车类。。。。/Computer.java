public class Computer{
	String cname;//电脑名称
	String system;//电脑系统
	int type;//电脑类型1，商务本2，游戏本....
	int price;//电脑价格/元
	int neicun;//电脑内存
	String company;//电脑厂家
	public void watchTV(){
		System.out.println("电脑可以看电影"+"\n");
	}
	public void shangwang(){
		System.out.println("电脑可以上网"+"\n");
	}
	public void playgame(){
		System.out.println("电脑可以打游戏"+"\n");
	}
	public void bianma(){
		System.out.println("电脑可以编码"+"\n");
	}
	public void say(){
		System.out.println(cname+"可以流畅的玩游戏，看电影办公更是不在话下，价格便宜只要"+price+"元"+"\n");
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