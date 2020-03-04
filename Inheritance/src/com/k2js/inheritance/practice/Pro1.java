// single level inheritence 


package com.k2js.inheritance.practice;

class A{
	int a=10;
	int b=20;
	
	public void m1(){
		System.out.println("I am parent class method m1");
	}
	public void n1(){
		System.out.println("I am parent class method n1");
	};
}

class B extends A{
	int b=30;
	int c=40;
	
	public void n1(){
		System.out.println("I am child class method n1");
	}
	public void o1(){
		System.out.println("I am child class method o1");
	};
}

class ABTest{
	public static void main(String...abc){
		
		System.out.println("\n\n\n/***Output***\n");
		B b1= new B();
		b1.n1();
		System.out.println(b1.a);
		System.out.println(b1.b);
		System.out.println(b1.c);
		b1.m1();
		b1.o1();
		
		
		A a1= new B();
		a1.m1();
		a1.n1();
		System.out.println(a1.a);
		System.out.println(a1.b);
		
		B b=(B)a1;
		b.m1();
		b.n1();
		b.o1();
		System.out.println(b.a);
		System.out.println(b.b);
		System.out.println(b.c);
		
		System.out.println("\n****End*****/");
	}
}



/***Output***

I am child class method n1
10
30
40
I am parent class method m1
I am child class method o1
I am parent class method m1
I am child class method n1
10
20
I am parent class method m1
I am child class method n1
I am child class method o1
10
30
40

****End*****/
