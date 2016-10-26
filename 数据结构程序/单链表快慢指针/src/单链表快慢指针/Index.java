package 单链表快慢指针;

import java.util.Scanner;

public class Index {
	public static void  seleect(LinkList aLink){
		System.out.println("1.查看链表");
		System.out.println("2.创建链表");
		System.out.println("3.显示链表长度");
		System.out.println("4.找到中间值");
		System.out.println("5.退出程序");
		Scanner a = new Scanner(System.in);
		
		int num =  a.nextInt();
		switch (num) {
		case 1:
			System.out.println("链表为");
			
			aLink.show();
			break;
		
		case 2:
			int[] arrdata = new int[20];
			for(int i=0;i<arrdata.length;i++){
				arrdata[i] = (int) (20*Math.random());
			}
			aLink.initLink(arrdata);
			System.out.println("创建成功");
			break;	
		
		case 3:
			System.out.println("显示的链表为");
			
			break;	
		
		case 4:
			System.out.println("这里是4呀");
			break;	
		case 5:
			System.out.println("退出程序了");
			System.exit(0);
		default:
			System.out.println("请按正确输入1-4");
			break;
		}
		seleect(aLink);
	}
	public static void main(String[] args) {
		LinkList aLink = new LinkList();
		seleect(aLink);
	}

}
