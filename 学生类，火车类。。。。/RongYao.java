public class RongYao{
	String hero;
	String pifu;
	int dianjuan;
	String type;
	int daqu;
	public void paiwei(){
		System.out.println("玩家通过排位赛来提升自己的段位和彰显自己的实力，但是排位赛小学生和坑太多了！"+"\n");
	}
	public void chongzhi(){
		System.out.println("您的点券不足是否充值？"+"\n");
	}
	public void playgame(){
		System.out.println("多人排位赛开始"+"\n");
	}
	public void say(){
		System.out.println("使用"+hero+"进行了一场"+type+"\n");
	}
	public RongYao(String h,String p,int dj,String t,int dq){
		hero = h;
		pifu = p;
		dianjuan = dj;
		type = t;
		daqu = dq;
	}
}