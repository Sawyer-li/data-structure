package 达达租车系统;

public class PickUp extends Auto {
	private int carCapacity; //定义皮卡的载客量
    private int carCarryCargo; //定义皮卡的载货量
	public PickUp(String carName, float carPrice, int carCapacity, int carCarryCargo) {
		super(carName, carPrice);
		this.carCapacity = carCapacity;
		this.carCarryCargo = carCarryCargo;
	}
	public int getCarCapacity() {
		return carCapacity;
	}
	public void setCarCapacity(int carCapacity) {
		this.carCapacity = carCapacity;
	}
	public int getCarCarryCargo() {
		return carCarryCargo;
	}
	public void setCarCarryCargo(int carCarryCargo) {
		this.carCarryCargo = carCarryCargo;
	}
    
}
