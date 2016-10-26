
public class InsertSort {

	public static void main(String[] args) {
		int[] arr = {20,33,50,40,68,32,0,55,88,13,456,2,5,316};
		InsertSort iss = new InsertSort();
		iss.inserts(arr);
		for(int k=0;k<arr.length;k++){
			System.out.println(arr[k]);
		}		
	}
	public void inserts(int[] arr){
		for(int i=1;i<arr.length;i++){
			int tmp=arr[i];
			int j=i;
			while(j>0&&tmp<arr[j-1]){
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=tmp;
		}
	}
}
