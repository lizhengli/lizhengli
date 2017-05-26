package SetComparable;

public class Student {
	private String name;
	private int age;
	private int score;
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	public void setScore(int score){
		this.score = score;
	}
	public int getScore(){
		return score;
	}
	public Student(String name,int age,int score){
		this.name = name;
		this.age = age;
		this.score = score;
	}
	public String toString(){
		return getName()+"\t"+getAge()+"\t"+getScore();
	}
	/*public int mycomparactor(Object o1,Object o2){
		int b = 0;
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
		if(s1.age>s2.age){
			return b = 1;
		}else if(s1.age<s2.age){
			return b = -1;
		}else if(s1.age == s2.age){
			if(s1.score>s2.score){
				return b = 1;
			}else if(s1.score<s2.score){
				return b = -1;
			}
		}
		return b;
	}*/
	//public Student(){
		
	//}
}
