// single level inheritence 


package com.k2js.inheritance.practice;

abstract class Pro2{
	int i=10;
	static int j =20;
	int a(){
		return 30;
	}
	static int b(){
		return 40;
	}
}

class Pro3 {
	public static void add(){
		Pro2 p1=new Pro2();
		System.out.println(p1.i + Pro2.j+p1.a()+Pro2.b());
	}
}

class Pro3Test{
	public static void main(String...abc){
		Pro3 p3= new Pro3();
		p3.add();
	}
}