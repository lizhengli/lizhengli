package FileInout;

public class Main {
	public static void main(String[] args) {
		ChuangKou c1 = new ChuangKou("窗口一");
		ChuangKou c2 = new ChuangKou("窗口二");
		ChuangKou c3 = new ChuangKou("窗口三");
		ChuangKouThread ct1 = new ChuangKouThread(c1);
		ChuangKouThread ct2 = new ChuangKouThread(c2);
		ChuangKouThread ct3 = new ChuangKouThread(c3);
		ct1.start();
		ct2.start();
		ct3.start();
	}
}
