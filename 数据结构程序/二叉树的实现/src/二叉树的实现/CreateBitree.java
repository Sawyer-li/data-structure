package ��������ʵ��;

import java.util.Scanner;

public class CreateBitree{
	Scanner in = new Scanner(System.in);
	char a;
	BirthNode root = null;
	int num =1;
	public void bin(){
		this.get(root);
	}
	public void uselook(){
		this.look(root,1);
	}
	public void get(BirthNode bt){
		
		
		a = in.nextLine().charAt(0);
		if(' ' == a ){
			 bt = null;
		}else{
			bt = new BirthNode();
			if(num == 1){
				System.out.println("һ��");
				root = bt;
			}
			num++;
			System.out.println(bt);
			System.out.println(bt.lchild);
			
			bt.data = a;
			this.get(bt.lchild);
			this.get(bt.rchild);
		}
	}
	public void look(BirthNode head,int level){
		
		if( head != null){
			
			visit(level,head.data);
			System.out.println(head.lchild);
			look(head.lchild,level+1);
			look(head.rchild,level+1);
		}
	}
	public void visit(int level,char data){
		System.out.println("λ�ڵ�"+level+"�㡣����Ϊ"+data);
	}
}
