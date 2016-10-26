
public class Bubble {

	public static void main(String[] args) {
		int[] arr = {20,33,50,40,68,32,0,55,88,13,456,2,5,316};
		int tmp;
		for(int i=0;i<arr.length;i++){
			for(int j=1; j<arr.length-i; j++){
				if(arr[j]<arr[j-1]){
					tmp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=tmp;
				}
			}
		}
		for(int k=0;k<arr.length;k++){
			System.out.println(arr[k]);
		}

	}

}
