 public class Person{
	public Phone phone;
	public static void main(String[] args){
		String number = "13954499093";
		String dx = "Hello Word !";
		Card card = new Card(number,dx);
		Phone phone = new Phone(card);
		Person person = new Person(phone);
		person.use();
	}
	public void use(){
			phone.call();
	}
	public Person(Phone phone){
			this.phone = phone;
	}
}