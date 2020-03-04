// single level inheritence 


package com.k2js.inheritance.practice;


interface Pro4{
	static int i=15;
	int j=16;
	static int i(){
		return 17;
	}
	default int j(){
		return 18;
	}
}

class Pro4_Logic{
	public static void add(){
		
		Pro4 p1=new Pro4(){};
		System.out.println(Pro4.i + p1.j+p1.j()+Pro4.i());
		//Pro2 p1=new Pro2(){};
		//System.out.println(p1.i + Pro2.j+p1.a()+Pro2.b());
	}
}

class Pro4Test{
	public static void main(String...abc){
		Pro4_Logic p2= new Pro4_Logic();
		p2.add();
	}
}