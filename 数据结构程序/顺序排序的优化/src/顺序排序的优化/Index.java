package Ë³ĞòÅÅĞòµÄÓÅ»¯;

public class Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List_init li = new List_init();
		int i = li.arrO.length-1;
		li.arrO[0].setId(1020);
		while(li.arrO[i].getId() != 1020){
			i--;
		}
		System.out.println(li.arrO[i].getName());
	}

}
