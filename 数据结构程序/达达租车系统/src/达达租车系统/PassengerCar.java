package ����⳵ϵͳ;

public class PassengerCar extends Auto {
	private int carCapacity;
	public PassengerCar(String carName, float carPrice, int carCapacity) {
		super(carName, carPrice);
		this.carCapacity = carCapacity;
	}
                     //����ͳ��ؿ���
	public int getCarCapacity() {
		return carCapacity;
	}
	public void setCarCapacity(int carCapacity) {
		this.carCapacity = carCapacity;
	}
	
	
}
