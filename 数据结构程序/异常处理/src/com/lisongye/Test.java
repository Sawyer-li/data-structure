package com.lisongye;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test ts = new Test();
		int result = ts.test1();
		System.out.println("test方法执行完毕返回值为"+result);
		int result2 = ts.test2();
		System.out.println("我想大声告诉你test2执行"+result2);
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
			System.out.println("循环抛出异常了！！！");
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
			System.out.println("循环抛出异常了！！！");
			return result = 999;
		}finally{
			System.out.println("这是finaly!!哈哈!!!");
			System.out.println("这是finally我的值是"+result);
		}
	}

}