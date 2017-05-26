public class Singleton{
	
	private static Singleton instance = new Singleton();
	public void say(){
		System.out.println("·¢²¼Ê¥Ö¼");
	}
	private Singleton(){
		
	}
	public static Singleton getInstance(){
		return instance;
	}
}