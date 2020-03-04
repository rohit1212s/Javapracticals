// Program to demonstrate to overloading using polymorphism

package com.k2js.polymorphism.practice;

class A{
	void m(int i){
		
	}
	void m(Object a){
		
	}
	void m(Comparable c){
		
	}
	void m(Integer j){
		
	}
}

class ATest{
	public static void main(String...abc){
		A a1=new A();
		a1.m(10);
		Integer i=55;
		a1.m((Comparable)i);
	}
}