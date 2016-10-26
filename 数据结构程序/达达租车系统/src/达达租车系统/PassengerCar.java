package 达达租车系统;

public class PassengerCar extends Auto {
	private int carCapacity;
	public PassengerCar(String carName, float carPrice, int carCapacity) {
		super(carName, carPrice);
		this.carCapacity = carCapacity;
	}
                     //定义客车载客量
	public int getCarCapacity() {
		return carCapacity;
	}
	public void setCarCapacity(int carCapacity) {
		this.carCapacity = carCapacity;
	}
	
	
}
