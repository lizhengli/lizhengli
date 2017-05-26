interface Icellphone{
	 void sendMsg();
}
class HTC implements Icellphone{
	public void sendMsg(){
		System.out.println("����HTC�ֻ�������");
	}
}
class iphone implements Icellphone{
	public void sendMsg(){
		System.out.println("����ƻ���ֻ�������");
	}
}
class Factory{
	public static Icellphone getInstance(String type){
		Icellphone p = null;
		if("htc".equals(type)){
			p = new HTC();
		}else if("iPhone".equals(type)){
			p = new iphone();
		}
		return p;
	}
}
public class GongChang{
	public static void main(String[] args){
		Icellphone w = Factory.getInstance("iphone");
		w.sendMsg();
	}
}