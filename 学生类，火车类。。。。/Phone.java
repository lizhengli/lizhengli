public class Phone{
	String sname;//手机名称
	String system;//手机系统
	int price;//手机价格/元
	int neicun;//手机内存
	String company;//手机厂家
	public void call(){
		System.out.println("手机可以打电话和发短信"+"\n");
	}
	public void watch(){
		System.out.println("手机可以看视频和小说"+"\n");
	}
	public void shangwang(){
		System.out.println("手机可以上网"+"\n");
	}
	public void playgame(){
		System.out.println("手机可以玩手机游戏"+"\n");
	}
	public void say(){
		System.out.println(sname+"可以流畅的玩王者荣耀！看视频更是不在话下，价格便宜只要"+price+"元"+"\n");
	}
	public Phone(String n,String s,int p,int nc,String c){
		sname = n;
		system = s;
		price = p;
		neicun = nc;
		company = c;
	}

}