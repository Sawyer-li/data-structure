package ������;

public class LinkList {
	   public Node firstLink;               //����ͷָ��
	   public Node first; // ����һ��ͷ���  
	   private int pos = 0;// �ڵ��λ��  
	   
	   
	   public void addFirstNode(int data){
		   Node node = new Node(null,data);
		   first = node;
		   firstLink = new Node(first);
	   }
	        
	   /**********       ����ͷ���                  **********/
	   
	   /**********      lasΪǰһ����ֵ               *******/
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
