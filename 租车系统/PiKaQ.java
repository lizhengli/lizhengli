package com.lige;

public class PiKaQ extends Car {
	public PiKaQ(String name,int people,int loads,int price){
		this.setName(name);
		this.setPeople(people);
		this.setLoads(loads);
		this.setPrice(price);
	}
	public String say(){
		return getName()+"\t"+getPeople()+"\t"+getLoads()+"\t"+
				getPrice();
	}

}
