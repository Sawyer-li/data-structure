package ѭ������;

import java.util.Scanner;

public class Cirlink {
		int item; 
		Node temp;
		Node target;
		Scanner in = new Scanner(System.in);
	public void init(Node pNode){
		System.out.println("����ڵ��ֵ����0������ʼ��");
		while(true){
		
			item = in.nextInt();
			if(item == 0)
				return;
			if(pNode.next == null){
				pNode.data = item;
				pNode.next = pNode;
			}else{
				for(target = pNode;target.next != pNode;target=target.next);
				temp = new Node();
				temp.data = item;
				temp.next = pNode;
				target.next = temp;
			}
		}
	}
	
	public void insert(Node pNode,int i){
		System.out.println("������Ҫ�����ֵ");
		item = in.nextInt();
		if( i == 1){
			temp = new Node();
			temp.data = item;
			for(target = pNode; target.next != pNode;target=target.next);
			target.next = temp;
			temp.next = pNode;
			pNode = temp;
			
		} 
	}
	
	public void delect(){
		
	}
	
	public void search(){
		
	}
}
