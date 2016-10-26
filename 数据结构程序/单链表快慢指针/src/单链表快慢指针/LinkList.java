package 单链表快慢指针;


public class LinkList {
	public LinkDemo first;
	public LinkDemo firstPointer;
	
	public void headLink(){
		first =  new LinkDemo(null,50);
		firstPointer = new LinkDemo(first);	
	}
	public void initAddHead(int data){
		LinkDemo current = new LinkDemo(null,data);
		if(first.next != null){
			current.next = first.next;
			first.next = current;
		}else{
			first.next = current;
		}
	}
	
	public void initLink(int[] arr){
		this.headLink();
		for(int i=0;i<arr.length;i++){
			initAddHead(arr[i]);
		}
	}
	
	public void show(){
		LinkDemo temDemo;
		temDemo = first.next;
		while( temDemo.next != null){
			temDemo = temDemo.next;
			System.out.print(temDemo.data+" ");
		}
		System.out.println();
	}
	//创建头指针头结点
}
