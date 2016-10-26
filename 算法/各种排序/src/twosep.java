
public class twosep {

	public static void main(String[] args) {
		twosep ts = new twosep();
		int arr[] = {1,2,3,6,8,9,11,23,28,56,59,61,62,63,66,68,70,78,79,91,92};
		ts.nofind(1, arr);

	}
	public void find(int num,int[] arr,int min,int max){
		int mid = (min + max)/2;
		if(num==arr[mid]){
			System.out.println("你查找的位置为"+mid);
		}else if(num>arr[mid]){
			min = mid + 1;
			find(num,arr,min,max);
		}else{
			max = mid - 1;
			find(num,arr,min,max);
		}
	}
	public void nofind(int num,int[] arr){
		int low=0;
		int high = arr.length;
		while(low<=high){
			int mid = (low+high)/2;
			if(num==arr[mid]){
				System.out.println("你查找的值位置为"+mid);
				break;
			}else if(num>arr[mid]){
				low = mid+1;
			}else{
				high = mid -1;
			}
		}
	}
}
