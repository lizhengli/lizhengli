package FileInout;

public class ChuangKou {
	private static int number = 50;
	public String name; 
	public  void sale(){
		while(true){
			number--;
			if(number<1){
				System.out.println("Ʊ������");
				break;
			}
			System.out.println(name+"������"+"��"+number+"��Ʊ");
		}
	}
	public ChuangKou(String name){
		this.name = name;
	}
}
