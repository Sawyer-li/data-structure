
public class Select {

	public static void main(String[] args) {
		int[] arr = {20,33,50,40,68,32,0,55,88,13,456,2,5,316,999,564,32,13,28};
		for(int i=0;i<arr.length;i++){
			int min = arr[i];
			int tmp;
			int index = i;
			for(int j=i+1; j<arr.length; j++){
				if(arr[j]<min){
					min = arr[j];
					index = j;
				}
			}
			tmp = arr[i];
			arr[i] = min;
			arr[index] =tmp;
			
		}
		for(int k=0;k<arr.length;k++){
			System.out.println(arr[k]);
		}
	}

}
