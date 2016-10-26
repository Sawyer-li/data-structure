
public class Quick {

	public static void main(String[] args) {
		int[] arr = {20,33,50,40,68,32,0,55,88,13,456,2,5,316,999,564,32,13,28};
		Quick qk = new Quick();
		qk.quick(arr, 0, arr.length-1);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	void quick_sort(int s[], int l, int r)  
	{  
	    if (l < r)  
	    {  
	        int i = l, j = r, x = s[l];  
	        while (i < j)  
	        {  
	            while(i < j && s[j] >= x) // 从右向左找第一个小于x的数  
	                j--;    
	            if(i < j)   
	                s[i++] = s[j];  
	            while(i < j && s[i] < x) // 从左向右找第一个大于等于x的数  
	                i++;    
	            if(i < j)   
	                s[j--] = s[i];  
	        }  
	        s[i] = x;  
	        quick_sort(s, l, i - 1); // 递归调用   
	        quick_sort(s, i + 1, r);  
	    }  
	}  
	public void quick(int arr[],int l,int r){
		if(l<r){
			int i=l,j=r;
			int tmp = arr[l];
			int index = 0;
			while(i<j){
				index++;
				while(i < j && arr[j]>=tmp)
					j--;
				
				if(i < j)
					arr[i++]=arr[j];
			
				while( i< j && arr[i]<tmp){
					i++;
				}
				
				if(i<j)
					arr[j--]=arr[i];
			}
			arr[i]=tmp;
		
			quick(arr,l,j-1);
			quick(arr,j+1,r);
		}
	}

}
