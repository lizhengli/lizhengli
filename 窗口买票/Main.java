package FileInout;

public class Main {
	public static void main(String[] args) {
		ChuangKou c1 = new ChuangKou("����һ");
		ChuangKou c2 = new ChuangKou("���ڶ�");
		ChuangKou c3 = new ChuangKou("������");
		ChuangKouThread ct1 = new ChuangKouThread(c1);
		ChuangKouThread ct2 = new ChuangKouThread(c2);
		ChuangKouThread ct3 = new ChuangKouThread(c3);
		ct1.start();
		ct2.start();
		ct3.start();
	}
}
