public class RongYao2{
	public static void main(String[] args){
		RongYao[] rongyao = new RongYao[3];
		RongYao rongyao1 = new RongYao("���","ǧ��֮��",88888888,"��λ��",12);
		rongyao[0] = rongyao1;
		RongYao rongyao2 = new RongYao("����","������",88888888,"�ͽ�",12);
		rongyao[1] = rongyao2;
		RongYao rongyao3 = new RongYao("�����","����",88888888,"ƥ��",10);
		rongyao[2] = rongyao3;
		rongyao3.paiwei();
		rongyao1.chongzhi();
		rongyao1.say();

	}
}