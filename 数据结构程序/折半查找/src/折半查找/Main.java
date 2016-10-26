package 折半查找;

public class Main {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,22,33,55,62,70,80,150,142,180,200,300,500};
		int num = 500;
		Main ain = new Main();
		ain.find(num,arr,0,arr.length);
	}
	public void find(int num,int[] arr,int min,int max){
		int mid =(min+max)/2;
		if(num == arr[mid]){
			System.out.println("这个元素位置在"+mid);
		}else if(num > arr[mid]){
			min = mid+1;
			find(num,arr,min,max);
		}else {
			max = mid-1;
			find(num,arr,min,max);
		}
	}
}
