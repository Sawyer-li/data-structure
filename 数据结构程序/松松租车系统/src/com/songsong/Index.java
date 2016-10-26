package com.songsong;

import java.util.Scanner;



import java.util.ArrayList;
import java.util.List;

public class Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner c = new Scanner(System.in);
		System.out.println("欢迎来到松松租车系统");
		System.out.println("想要选车请按1，否则请按2");
		if(c.nextInt()==1){
			Auto[] cars = {new Car(1,"雪弗兰",350,5),new Car(2,"奔驰",500,4),new Car(3,"金龙大客",800,15),new Truck(4,"东风",2000,20),new Truck(5,"小货车",1000,8), new PickUp(6,"皮卡1",200,5,5)};
			System.out.println("编号:\t名字:\t价格:\t载人数:\t载货数:");
			Auto smalcar = new Car(1,"雪弗兰",350,5);
		
			for(int i=0;i<cars.length;i++){
				 if(cars[i] instanceof Car){
					 System.out.println(cars[i].getId()+"\t"+cars[i].getName()+"\t"+cars[i].getPrice()+"元\t"+((Car)cars[i]).getPerson()+"人");
				 }
				 if(cars[i] instanceof Truck){
					 System.out.println(cars[i].getId()+"\t"+cars[i].getName()+"\t"+cars[i].getPrice()+"元\t\t"+((Truck)cars[i]).getBoadload()+"吨");
				 }
				 if(cars[i] instanceof PickUp){
					 System.out.println(cars[i].getId()+"\t"+cars[i].getName()+"\t"+cars[i].getPrice()+"元\t"+((PickUp)cars[i]).getPerson()+"人\t"+((PickUp)cars[i]).getBoadload()+"吨");
				 }
			}
			System.out.println("请输入你要选择的车数");
			int num = c.nextInt();
			float sumPrice = 0;
			int sumPerson = 0;
			int sunBoadload = 0;
			int[] aId = new int[num];
			
			for(int j=0;j<aId.length;j++){
				int k = j+1;
				System.out.println("请输入第"+k+"次所选的车");
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
			System.out.println("下面是你的租车单");
			System.out.println("总金额为"+sumPrice+"元");
			System.out.println("总金额为"+sumPerson+"人");
			System.out.println("总金额为"+sunBoadload+"吨");
			System.out.println("确认请按1，取消请按2");
			int affirm = c.nextInt();
			if( affirm == 1){
				System.out.println("确认成功");
				System.out.println("欢迎下次光临");
			}else{
				System.out.println("欢迎下次光临");
			}
		}
		else{
			System.out.println("谢谢的您的光临");
		}
	}

}
