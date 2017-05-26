public class Phone{
	public Card card;
	public Phone(Card card){
		this.card = card;
	}
	public void call(){
		System.out.println("手机号码是"+card.number);
		System.out.println("发送成功"+card.dx);
	}
}