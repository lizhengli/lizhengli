public class RongYao2{
	public static void main(String[] args){
		RongYao[] rongyao = new RongYao[3];
		RongYao rongyao1 = new RongYao("李白","千年之狐",88888888,"排位赛",12);
		rongyao[0] = rongyao1;
		RongYao rongyao2 = new RongYao("韩信","白龙吟",88888888,"赏金",12);
		rongyao[1] = rongyao2;
		RongYao rongyao3 = new RongYao("孙悟空","至尊宝",88888888,"匹配",10);
		rongyao[2] = rongyao3;
		rongyao3.paiwei();
		rongyao1.chongzhi();
		rongyao1.say();

	}
}