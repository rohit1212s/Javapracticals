// addition of 2 number of interface in a class using static and non static variable 
//i+i+o+o

package com.k2js.inheritance.practice;

//abstract
 interface A2{
	int i=10;
	static Object o=20;
}

class B2 implements A2{
	static Comparable i=30;
	java.io.Serializable o=40;
	void add (){
		
		int a=(int)B2.i;
		int b=(int)this.o;
		int c=A2.i;//super
		int d=(int)A2.o;
		int r=a+b+c+d;
		System.out.println(r);
	}
	
	static void add2(){
		int a= (int)B2.i;
		B2 a1=new B2();
		int b=(int)a1.o;
		int c=A2.i;//object
		int d=(int)A2.o;
		int r=a+b+c+d;
		System.out.println(r);
		
	}
} 

class A2Test{
	public static void main(String...abc){
		System.out.println("\n\n\n/***Output***\n");
		B2 b1=new B2();
		b1.add();
		B2.add2();
		System.out.println("\n****End*****/");
	}
}


/***Output***

100
100

****End*****/
