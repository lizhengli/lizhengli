public class MiXiang{
	public static void main(String[] args){
		Student[] student = new Student[2];
		Student student2  =new Student("����",11,'��');
		student[0]=student2;
		Student student1 = new Student("����ɽ",12,'Ů');
		student[1]=student1;
		student2.eat();
		student1.study();
		student1.playGame();
		student1.say();
		student2.say();
	}
}