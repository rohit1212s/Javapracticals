// Multiple inheritance using class and interface

package com.k2js.inheritance.practice;

class AMul1{
	int i=10;
	int j=20;
	public void m(){
		System.out.println("I am class type");
	}
	public void n(){
		
	}
	public void o(){
		
	}
}

interface BMul1{
	//int i=30;
	default void m(){
		System.out.println("I am interface type");
	}
	abstract void n();
	default void p(){
		
	}
}

class CMul1 extends AMul1 implements BMul1{
	public static void main(String...abc){
		CMul1 cm1= new CMul1();
		System.out.println(cm1.i);
		System.out.println(cm1.j);
		cm1.m();
		cm1.n();
		cm1.o();
		cm1.p();
	}
}