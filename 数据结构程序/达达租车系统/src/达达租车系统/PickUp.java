package ����⳵ϵͳ;

public class PickUp extends Auto {
	private int carCapacity; //����Ƥ�����ؿ���
    private int carCarryCargo; //����Ƥ�����ػ���
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
