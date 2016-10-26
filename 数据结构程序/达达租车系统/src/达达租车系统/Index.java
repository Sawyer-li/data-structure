package 达达租车系统;
import java.util.*;




public class Index {

	public static void main(String[] args) {
		System.out.println("请输入是否要选择一辆车，如果是请选择1,否则选择2退出");
		Scanner sc = new Scanner(System.in);
		int a  = sc.nextInt();
		if(a == 1){
			System.out.println("欢迎进入达达租车系统");
			System.out.println("车辆列表");
			Auto [ ] carForRent={new PassengerCar("奥迪A4",500,4),new PassengerCar("马自达6",400,4),
                    new PickUp("皮卡雪6",450,4,2),new PassengerCar(" 金龙 ",800,20),
                    new Trunk("松花江",400,4),new Trunk("依维柯",1000,20)};
			System.out.println("车辆名称\t租金\t\t容量\t载物数量");
			for(Auto car:carForRent){
				if(car instanceof PassengerCar){
					System.out.println(car.getCarName()+"\t"+car.getCarPrice()
                    +"/天"+"\t\t"+"载人:"+((PassengerCar)car).getCarCapacity()+"人");
				}
				if(car instanceof PickUp){
					System.out.println(car.getCarName()+"\t"+car.getCarPrice()
                    +"/天"+"\t\t"+"载人:"+((PickUp)car).getCarCapacity()+"人"+"\t"+"载物:"+((PickUp)car).getCarCarryCargo()+"吨");
				}
				if(car instanceof Trunk){
					System.out.println(car.getCarName()+"\t"+car.getCarPrice()
                    +"/天"+"\t\t\t"+"载物:"+((Trunk)car).getCarCarryCargo()+"吨");
				}
			}
			System.out.println("请输入您要租的汽车的数量");
		}else{
			System.out.println("你已经退出该系统");
		}

	}

}
