package com.songsong;

import java.util.Scanner;



import java.util.ArrayList;
import java.util.List;

public class Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner c = new Scanner(System.in);
		System.out.println("��ӭ���������⳵ϵͳ");
		System.out.println("��Ҫѡ���밴1�������밴2");
		if(c.nextInt()==1){
			Auto[] cars = {new Car(1,"ѩ����",350,5),new Car(2,"����",500,4),new Car(3,"�������",800,15),new Truck(4,"����",2000,20),new Truck(5,"С����",1000,8), new PickUp(6,"Ƥ��1",200,5,5)};
			System.out.println("���:\t����:\t�۸�:\t������:\t�ػ���:");
			Auto smalcar = new Car(1,"ѩ����",350,5);
		
			for(int i=0;i<cars.length;i++){
				 if(cars[i] instanceof Car){
					 System.out.println(cars[i].getId()+"\t"+cars[i].getName()+"\t"+cars[i].getPrice()+"Ԫ\t"+((Car)cars[i]).getPerson()+"��");
				 }
				 if(cars[i] instanceof Truck){
					 System.out.println(cars[i].getId()+"\t"+cars[i].getName()+"\t"+cars[i].getPrice()+"Ԫ\t\t"+((Truck)cars[i]).getBoadload()+"��");
				 }
				 if(cars[i] instanceof PickUp){
					 System.out.println(cars[i].getId()+"\t"+cars[i].getName()+"\t"+cars[i].getPrice()+"Ԫ\t"+((PickUp)cars[i]).getPerson()+"��\t"+((PickUp)cars[i]).getBoadload()+"��");
				 }
			}
			System.out.println("��������Ҫѡ��ĳ���");
			int num = c.nextInt();
			float sumPrice = 0;
			int sumPerson = 0;
			int sunBoadload = 0;
			int[] aId = new int[num];
			
			for(int j=0;j<aId.length;j++){
				int k = j+1;
				System.out.println("�������"+k+"����ѡ�ĳ�");
				aId[j] = c.nextInt()-1;
				
			}
			for(int i=0; i<aId.length; i++){
				sumPrice += cars[aId[i]].getPrice();
				if(cars[aId[i]] instanceof Car){
					sumPerson += ((Car)cars[aId[i]]).getPerson();
				}else if(cars[aId[i]] instanceof PickUp){
					sumPerson += ((PickUp)cars[aId[i]]).getPerson();
				}
				if(cars[aId[i]] instanceof Truck){
					sunBoadload += ((Truck)cars[aId[i]]).getBoadload();
				}else if(cars[aId[i]] instanceof PickUp){
					sunBoadload += ((PickUp)cars[aId[i]]).getBoadload();
				}
				
				sumPrice += cars[aId[i]].getPrice();
			}
			System.out.println("����������⳵��");
			System.out.println("�ܽ��Ϊ"+sumPrice+"Ԫ");
			System.out.println("�ܽ��Ϊ"+sumPerson+"��");
			System.out.println("�ܽ��Ϊ"+sunBoadload+"��");
			System.out.println("ȷ���밴1��ȡ���밴2");
			int affirm = c.nextInt();
			if( affirm == 1){
				System.out.println("ȷ�ϳɹ�");
				System.out.println("��ӭ�´ι���");
			}else{
				System.out.println("��ӭ�´ι���");
			}
		}
		else{
			System.out.println("лл�����Ĺ���");
		}
	}

}
