public class Computer2{
	public static void main(String[] args){
		Computer com1 = new Computer("����������","Windows",2,6400,1000,"����");
		Computer com2 = new Computer("��е����","Windows",2,5980,1000,"�廪ͬ��");
		Computer com3 = new Computer("ƻ��Ari","Mac",1,8800,500,"ƻ��");
		Computer com4 = new Computer("Dell�ɾ�","Windows",1,3600,1000,"Dell");
		com1.watchTV();
		com2.shangwang();
		com3.bianma();
		com4.playgame();
		com1.say();
		com3.say();
	}
}