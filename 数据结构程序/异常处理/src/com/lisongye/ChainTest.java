package com.lisongye;

public class ChainTest {
	public static void main(String[] args){
		ChainTest ct = new ChainTest();
		try{
			ct.test2();
		}catch(RuntimeException e){
			e.printStackTrace();
			System.out.println("�쳣�ɹ����");
		}
	}
	
	public void test1() throws DrunkException {
		throw new DrunkException("�ȾƱ𿪳�");
	}
	public void test2() {
		try{
			test1();
		}catch(DrunkException e){
			RuntimeException  Exc = new RuntimeException("�ȾƱ𿪳�");
			
			Exc.initCause(e);
			throw Exc;   
		}
	}
}
