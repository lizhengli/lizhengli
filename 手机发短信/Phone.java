public class Phone{
	public Card card;
	public Phone(Card card){
		this.card = card;
	}
	public void call(){
		System.out.println("�ֻ�������"+card.number);
		System.out.println("���ͳɹ�"+card.dx);
	}
}