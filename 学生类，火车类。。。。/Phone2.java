public class Phone2{
	public static void main(String[] args){
		Phone[] phone = new Phone[3];
		Phone phone1 = new Phone("华为荣耀p8","安卓",2800,64,"华为");
		phone[0] = phone1;
		Phone phone2 = new Phone("苹果7plus","Mac",7000,64,"苹果");
		phone[1] = phone2;
		Phone phone3 = new Phone("小米5splus","安卓",3000,128,"小米");
		phone[2] = phone3;
		phone1.watch();
		phone1.playgame();
		phone2.call();
		phone1.say();

	}
}