package com.lige;
import java.util.*;
public class LiGeDaChe {
	public static void main(String[] args){
		Car[] cars = {
				new PassageCar("奥迪A8",4,500),
				new PassageCar("兰博基尼",4,1500),
				new PassageCar("玛莎拉蒂",4,1500),
				new PassageCar("保时捷911",4,1000),
				new ZaiHuoCar("怕卡七",25,500),
				new ZaiHuoCar("斯太尔",30,500),
				new PiKaQ("皮卡雪6",4,3,600)
		};
		System.out.println("******欢迎来到利哥租车******");
		System.out.println("****你可租的车辆和价目表*****");
		System.out.println("序号"+"\t"+"车名"+"\t"+"载客数"+"\t"+"载货量"+"\t"+"日租金（元/天）");
		for(int i = 0;i<cars.length;i++){
			System.out.println((i+1)+"\t"+cars[i].say());
		}
		System.out.println("请输入如要租车的数量");
		Scanner sc = new Scanner(System.in);
		int in1 = sc.nextInt();
		Car[] rent = new Car[in1];
		int day = 0;
		for(int j = 0;j<in1;j++){
			System.out.println("请输入第"+(j+1)+"辆车的序号");
			int b = sc.nextInt();
			rent[j] = cars[b-1];
			System.out.println("请输入要租的天数");
			 day = sc.nextInt();
		}
		System.out.println("选择的载客车有");
		for(int k = 0;k<in1;k++){
			if(rent[k].getPeople()!=0){
				System.out.println(rent[k].getName()+"\n");
			}
		}
		System.out.println("选择的载货车有"+"\n");
		for(int q = 0;q<in1;q++){
			if(rent[q].getLoads()!=0){
				System.out.println(rent[q].getName()+"\n");
			}
		}
		int sum = 0,people = 0,weight = 0;
		for(int n = 0;n<in1;n++){
			sum = rent[n].getPrice()*day+sum;
			people = rent[n].getPeople()+people;
			weight = rent[n].getLoads()+weight;
		}
		System.out.println("*****你的账单为*****");
		System.out.println("共租车"+in1+"\n"+"总价为"+sum+"\n"
				+"总载客数为"+people+"\n"+"总载货重为"+weight);
		System.out.println("*****欢迎下次光临*****");
	}
}
