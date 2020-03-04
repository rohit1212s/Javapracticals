// Multiple inheritance using 2 interface

package com.k2js.inheritance.practice;

interface AMul2{

	default public void m(){
		
	}
	default public void n(){
		
	}
	default public void o(){
		System.out.println("I am amul2 type");
	}
}

interface BMul2{
	//int i=30;
	default void m(){
		
	}
	abstract void n();
	default void p(){
		
	}
}

class CMul2 implements AMul2,BMul2{
	public void m(){
		System.out.println("overridden method 1");
	}
	public void n(){
		System.out.println("overridden method 2");
	}
	
	public static void main(String...abc){
		
		CMul2 cm2= new CMul2();
		cm2.m();
		cm2.n();
		cm2.o();
		cm2.p();
	}
}