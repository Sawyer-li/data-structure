package 单链表;

public class LinkList {
	   public Node firstLink;               //定义头指针
	   public Node first; // 定义一个头结点  
	   private int pos = 0;// 节点的位置  
	   
	   
	   public void addFirstNode(int data){
		   Node node = new Node(null,data);
		   first = node;
		   firstLink = new Node(first);
	   }
	        
	   /**********       定义头结点                  **********/
	   
	   /**********      las为前一个的值               *******/
	   public int add(int las,Node node){
		   Node current = firstLink.next;  
	       Node previous = firstLink;  
		   while (current.data != las) { 
	              current = current.next;  
	            
	        }
		   
		   node.next = current.next;
		
		   current.next = node;
		   return 1;
	   }
	   public int look(int las){
		   Node current = first;  
	
		   while (current.data != las) { 
			  
	              current = current.next;  
	        }
		   System.out.println(current.data);
		   return 1;
	   }


     
}
