public class Singleton{
	
	private static Singleton instance = new Singleton();
	public void say(){
		System.out.println("����ʥּ");
	}
	private Singleton(){
		
	}
	public static Singleton getInstance(){
		return instance;
	}
}