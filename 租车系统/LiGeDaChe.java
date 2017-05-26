package com.lige;
import java.util.*;
public class LiGeDaChe {
	public static void main(String[] args){
		Car[] cars = {
				new PassageCar("�µ�A8",4,500),
				new PassageCar("��������",4,1500),
				new PassageCar("��ɯ����",4,1500),
				new PassageCar("��ʱ��911",4,1000),
				new ZaiHuoCar("�¿���",25,500),
				new ZaiHuoCar("˹̫��",30,500),
				new PiKaQ("Ƥ��ѩ6",4,3,600)
		};
		System.out.println("******��ӭ���������⳵******");
		System.out.println("****�����ĳ����ͼ�Ŀ��*****");
		System.out.println("���"+"\t"+"����"+"\t"+"�ؿ���"+"\t"+"�ػ���"+"\t"+"�����Ԫ/�죩");
		for(int i = 0;i<cars.length;i++){
			System.out.println((i+1)+"\t"+cars[i].say());
		}
		System.out.println("��������Ҫ�⳵������");
		Scanner sc = new Scanner(System.in);
		int in1 = sc.nextInt();
		Car[] rent = new Car[in1];
		int day = 0;
		for(int j = 0;j<in1;j++){
			System.out.println("�������"+(j+1)+"���������");
			int b = sc.nextInt();
			rent[j] = cars[b-1];
			System.out.println("������Ҫ�������");
			 day = sc.nextInt();
		}
		System.out.println("ѡ����ؿͳ���");
		for(int k = 0;k<in1;k++){
			if(rent[k].getPeople()!=0){
				System.out.println(rent[k].getName()+"\n");
			}
		}
		System.out.println("ѡ����ػ�����"+"\n");
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
		System.out.println("*****����˵�Ϊ*****");
		System.out.println("���⳵"+in1+"\n"+"�ܼ�Ϊ"+sum+"\n"
				+"���ؿ���Ϊ"+people+"\n"+"���ػ���Ϊ"+weight);
		System.out.println("*****��ӭ�´ι���*****");
	}
}
