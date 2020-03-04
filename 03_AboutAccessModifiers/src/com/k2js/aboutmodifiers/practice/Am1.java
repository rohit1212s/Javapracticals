package com.k2js.aboutmodifiers.practice;

public class Am1{
	private void method1(){
		System.out.println("Am1 class- I am private method1");
	}
	void method2(){
		System.out.println("Am1 class- I am default method");
	}
	protected void method3(){
		System.out.println("Am1 class- I am protected method");
	}
	public void method4(){
		System.out.println("Am1 class- I am public method");
	}

public static void main(String...abc){
		Am1 am1=new Am1();
		am1.method1();
		am1.method2();
		am1.method3();
		am1.method4();
	
	}
}