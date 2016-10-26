package 别人的系统;

public class trunk extends car {
    private int carCarryCargo; //定义货车的载货量
     
    public trunk(int carNumber,String carName,int carRentMoney,int carCarryCargo){
        this.setCarNumber(carNumber);
        this.setCarName(carName);
        this.setCarRentMoney(carRentMoney);
        this.carCarryCargo=carCarryCargo;
    }
 
     
    public int getCarCarryCargo() {
        return carCarryCargo;
    }
 
    public void setCarCarryCargo(int carCarryCargo) {
        this.carCarryCargo = carCarryCargo;
    }
 
}