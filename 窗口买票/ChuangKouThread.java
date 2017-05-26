package FileInout;

public class ChuangKouThread extends Thread {
	ChuangKou chuangkou;
	
	public void run(){
		chuangkou.sale();
	}
	public ChuangKouThread(ChuangKou chaungkou){
		this.chuangkou = chuangkou;
	}
}
