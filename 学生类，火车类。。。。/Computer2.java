public class Computer2{
	public static void main(String[] args){
		Computer com1 = new Computer("联想拯救者","Windows",2,6400,1000,"联想");
		Computer com2 = new Computer("机械革命","Windows",2,5980,1000,"清华同方");
		Computer com3 = new Computer("苹果Ari","Mac",1,8800,500,"苹果");
		Computer com4 = new Computer("Dell成就","Windows",1,3600,1000,"Dell");
		com1.watchTV();
		com2.shangwang();
		com3.bianma();
		com4.playgame();
		com1.say();
		com3.say();
	}
}