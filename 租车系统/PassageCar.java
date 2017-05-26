package com.lige;

public class PassageCar extends Car{
	public PassageCar(String name,int people,int price){
		this.setName(name);
		this.setPeople(people);
		this.setPrice(price);
	}
	public String say(){
		return getName()+"\t"+getPeople()+"\t\t"+getPrice();
	}
}
