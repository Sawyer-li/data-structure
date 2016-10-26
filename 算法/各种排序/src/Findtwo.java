import java.util.Scanner;

public class Findtwo{

	public static void main(String[] args) {
				
		Scanner in = new Scanner(System.in);
		int index = in.nextInt();
		Findtwo fd = new Findtwo();
		long start = System.nanoTime();
		/***** 生成一组随机数  *****/
		int[] arr = new int[1000];
		for(int i=0;i<arr.length;i++){
			arr[i] = (int) (Math.random()*1000);   
		}
		fd.bubble(arr);
		fd.look(arr);
		/*****  前index个排序      *****/
		int[] brr = new int[index];
		index--;
		for(int i=0;i<brr.length;i++){
			brr[i]=arr[i];
		}
		fd.bubble(brr);
		for(int j=index;j<1000;j++){
			int id =index;
			if(arr[j]>brr[index]){
				while(id>0&&arr[j]>brr[id]){
					brr[id]=brr[id-1];
					id--;
				}
				brr[id] = arr[j];
			}
		}
		fd.find(brr, index);
		//fd.find(arr,index);
		
		long end = System.nanoTime();
		System.out.println("TimeCost: "+String.valueOf((end - start)/1000));
	}
	public void find(int[] arr,int index){
		System.out.println(arr[index]);
	}
	public void bubble(int[] arr){
		for(int i=0; i<arr.length; i++){
			for(int j=1;j<arr.length-i;j++){
				if(arr[j-1]<arr[j]){
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