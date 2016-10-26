
public class Findone {

	public static void main(String[] args) {
		long start = System.nanoTime();
		
		int[] arr = new int[1000];
		Findone fd = new Findone();
		for(int i=0;i<arr.length;i++){
			arr[i] = (int) (Math.random()*1000);
		}
		fd.bubble(arr);
		fd.find(arr,50);
		
		long end = System.nanoTime();
		System.out.println("TimeCost: "+String.valueOf((end - start)/1000));
	}
	public void find(int[] arr,int index){
		System.out.println(arr[index]);
	}
	public void bubble(int[] arr){
		for(int i=0; i<arr.length; i++){
			for(int j=1;j<arr.length-i;j++){
				if(arr[j-1]>arr[j]){
					int tmp =arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=tmp;
				}
			}
		}
	}
	public void look(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}
