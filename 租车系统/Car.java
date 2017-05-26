package com.lige;

public class Car {
	private String name;
	private int loads;
	private int people;
	private int price;
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setLoads(int loads){
		this.loads = loads;
	}
	public int getLoads(){
		return loads;
	}
	public void setPeople(int people){
		this.people = people;
	}
	public int getPeople(){
		return people;
	}
	public void setPrice(int price){
		this.price = price;
	}
	public int getPrice(){
		return price;
	}
	public String say() {
		
		return getName()+"\t\t"+getPeople()+"\t"+"\t\t\t"+getPrice();
	}
}
