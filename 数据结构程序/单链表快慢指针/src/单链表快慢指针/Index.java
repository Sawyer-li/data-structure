package ���������ָ��;

import java.util.Scanner;

public class Index {
	public static void  seleect(LinkList aLink){
		System.out.println("1.�鿴����");
		System.out.println("2.��������");
		System.out.println("3.��ʾ������");
		System.out.println("4.�ҵ��м�ֵ");
		System.out.println("5.�˳�����");
		Scanner a = new Scanner(System.in);
		
		int num =  a.nextInt();
		switch (num) {
		case 1:
			System.out.println("����Ϊ");
			
			aLink.show();
			break;
		
		case 2:
			int[] arrdata = new int[20];
			for(int i=0;i<arrdata.length;i++){
				arrdata[i] = (int) (20*Math.random());
			}
			aLink.initLink(arrdata);
			System.out.println("�����ɹ�");
			break;	
		
		case 3:
			System.out.println("��ʾ������Ϊ");
			
			break;	
		
		case 4:
			System.out.println("������4ѽ");
			break;	
		case 5:
			System.out.println("�˳�������");
			System.exit(0);
		default:
			System.out.println("�밴��ȷ����1-4");
			break;
		}
		seleect(aLink);
	}
	public static void main(String[] args) {
		LinkList aLink = new LinkList();
		seleect(aLink);
	}

}
