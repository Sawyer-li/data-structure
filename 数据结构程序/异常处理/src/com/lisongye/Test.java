package com.lisongye;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test ts = new Test();
		int result = ts.test1();
		System.out.println("test����ִ����Ϸ���ֵΪ"+result);
		int result2 = ts.test2();
		System.out.println("�������������test2ִ��"+result2);
	}
		
	public int test1(){
		int divider = 10;
		int result = 100;
		try{
			while( divider > -1){
				divider--;
				result = result + 100/divider;
			}
			return result;
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("ѭ���׳��쳣�ˣ�����");
			return -1;
		}
	}
	public int test2(){
		int divider = 10;
		int result = 100;
		try{
			while( divider > -1){
				divider--;
				result = result + 100/divider;
			}
			return result;
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("ѭ���׳��쳣�ˣ�����");
			return result = 999;
		}finally{
			System.out.println("����finaly!!����!!!");
			System.out.println("����finally�ҵ�ֵ��"+result);
		}
	}

}