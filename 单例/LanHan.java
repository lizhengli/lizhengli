public class LanHan{
	private static LanHan instance = null;
	public LanHan(){
		
	}
	public void say(){
		System.out.println("��������");
	}
	public static LanHan getInstance(){
		if(instance==null){
			instance = new LanHan();
		}
		return instance;
	}
}