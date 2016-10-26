
public class ShellSort {
	public static void main(String[] args){
		int[] arr = {20,33,50,40,68,32,0,55,88,13,456,2,5,316,999,564,32,13,28};
		ShellSort ss = new ShellSort();
		ss.shellsort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	public void shellsort(int[] arr){
		int gey = arr.length/2;
		while(gey>=1){
			for(int i=gey; i<arr.length; i++){
				int tmp = arr[i];
				int j=i;
				while(j>=gey&&tmp<arr[j-gey]){
					arr[j]=arr[j-gey];
					j=j-gey;
				}
				arr[j]=tmp;
			}
			gey/=2;
		}	
	}
}
