package com.lisongye;

public class ChainTest {
	public static void main(String[] args){
		ChainTest ct = new ChainTest();
		try{
			ct.test2();
		}catch(RuntimeException e){
			e.printStackTrace();
			System.out.println("异常成功解决");
		}
	}
	
	public void test1() throws DrunkException {
		throw new DrunkException("喝酒别开车");
	}
	public void test2() {
		try{
			test1();
		}catch(DrunkException e){
			RuntimeException  Exc = new RuntimeException("喝酒别开车");
			
			Exc.initCause(e);
			throw Exc;   
		}
	}
}
