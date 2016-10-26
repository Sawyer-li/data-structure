package 单链表;



public class Node {
	     public Node next; //指针域  
	     protected int data;//数据域     
		public Node(Node next, int data) {
			super();
			this.next = next;
			this.data = data;
		}
		public Node(Node next) {
			this.next = next;
		}
		
}
