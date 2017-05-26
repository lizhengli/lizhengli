public class HuoChe2{
	public static void main(String[] args){
		HuoChe[] huoche = new HuoChe[3];
		HuoChe huoche1 = new HuoChe("高铁",1,100,100);
		huoche[0] = huoche1;
		HuoChe huoche2 = new HuoChe("拉煤车",3,150,1000);
		huoche[1] = huoche2;
		HuoChe huoche3 = new HuoChe("磁悬浮列车",4,120,50);
		huoche[2] = huoche3;
		huoche1.run();
		huoche2.yunshu();
		huoche3.ranliao();
		huoche1.say();
		huoche2.say();
		huoche3.say();


	}
}