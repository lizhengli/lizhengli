package FileInout;

public class ChuangKou {
	private static int number = 50;
	public String name; 
	public  void sale(){
		while(true){
			number--;
			if(number<1){
				System.out.println("票卖完了");
				break;
			}
			System.out.println(name+"卖出了"+"第"+number+"张票");
		}
	}
	public ChuangKou(String name){
		this.name = name;
	}
}
