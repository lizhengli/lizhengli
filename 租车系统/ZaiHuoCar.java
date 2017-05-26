package com.lige;

public class ZaiHuoCar extends Car{
	public ZaiHuoCar(String name,int loads,int price){
		this.setName(name);
		this.setLoads(loads);
		this.setPrice(price);
	}
	public String say(){
		return getName()+"\t"+"\t"+getLoads()+"\t"+
				getPrice();
	}
}
