package 达达租车系统;

public class Trunk extends Auto {
	private int carCarryCargo;

	public Trunk(String carName, float carPrice, int carCarryCargo) {
		super(carName, carPrice);
		this.carCarryCargo = carCarryCargo;
	}

	public int getCarCarryCargo() {
		return carCarryCargo;
	}

	public void setCarCarryCargo(int carCarryCargo) {
		this.carCarryCargo = carCarryCargo;
	}
	
}
