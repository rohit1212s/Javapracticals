// addition of 2 number in a class using static and non static variable 
//i+i+o+o

package com.k2js.inheritance.practice;

abstract class A{
	int i=10;
	static Object o=20;
}

class B extends A{
	static Comparable i=30;
	java.io.Serializable o=40;
	void add (){
		
		int a=(int)B.i;
		int b=(int)this.o;
		int c=super.i;
		int d=(int)A.o;
		int r=a+b+c+d;
		System.out.println(r);
	}
	
		static void add2 (){
		
		int a=(int)B.i;
		A a1=new B();
		int b=(int)((B)a1).o;
		int c=a1.i;
		int d=(int)A.o;
		int r=a+b+c+d;
		System.out.println(r);
	}
	
}

class ATest{
	public static void main(String...abc){
		System.out.println("\n\n\n/***Output***\n");
		B b1=new B();
		b1.add();
		B.add2();
		System.out.println("\n****End*****/");
	}
}



/***Output***

100
100

****End*****/
