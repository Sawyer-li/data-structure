package ����⳵ϵͳ;
import java.util.*;




public class Index {

	public static void main(String[] args) {
		System.out.println("�������Ƿ�Ҫѡ��һ�������������ѡ��1,����ѡ��2�˳�");
		Scanner sc = new Scanner(System.in);
		int a  = sc.nextInt();
		if(a == 1){
			System.out.println("��ӭ�������⳵ϵͳ");
			System.out.println("�����б�");
			Auto [ ] carForRent={new PassengerCar("�µ�A4",500,4),new PassengerCar("���Դ�6",400,4),
                    new PickUp("Ƥ��ѩ6",450,4,2),new PassengerCar(" ���� ",800,20),
                    new Trunk("�ɻ���",400,4),new Trunk("��ά��",1000,20)};
			System.out.println("��������\t���\t\t����\t��������");
			for(Auto car:carForRent){
				if(car instanceof PassengerCar){
					System.out.println(car.getCarName()+"\t"+car.getCarPrice()
                    +"/��"+"\t\t"+"����:"+((PassengerCar)car).getCarCapacity()+"��");
				}
				if(car instanceof PickUp){
					System.out.println(car.getCarName()+"\t"+car.getCarPrice()
                    +"/��"+"\t\t"+"����:"+((PickUp)car).getCarCapacity()+"��"+"\t"+"����:"+((PickUp)car).getCarCarryCargo()+"��");
				}
				if(car instanceof Trunk){
					System.out.println(car.getCarName()+"\t"+car.getCarPrice()
                    +"/��"+"\t\t\t"+"����:"+((Trunk)car).getCarCarryCargo()+"��");
				}
			}
			System.out.println("��������Ҫ�������������");
		}else{
			System.out.println("���Ѿ��˳���ϵͳ");
		}

	}

}
