package µİ¹é²éÕÒ;

public class Main {
	int[]  arr = {1,3,5,8,9,15,36};
	int num = 8;
	public static void main(String[] args) {
		int i = 0;		
		Main str = new Main();
		System.out.println(str.find(i));
	}
	public int  find(int i){
		if( i<arr.length){
			if( arr[i]==num){
				return i;
			}else{
				i++;
				return find(i);
			}
		}else{
			return -1;
		}
	}

}
