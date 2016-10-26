package 达达租车系统;

public abstract class Auto {
	public String carName;
	public float carPrice;
	
	public Auto(String carName, float carPrice) {
		super();
		this.carName = carName;
		this.carPrice = carPrice;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public float getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(float carPrice) {
		this.carPrice = carPrice;
	}
	
}
