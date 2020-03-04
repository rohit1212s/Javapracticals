// Interface and class usage 


package com.k2js.inheritance.practice;

interface Pro5{
	static int i=15;
	int j=16;
	static int i(){
		return 17;
		}
	default int j(){
		return 18;
	}
}

class Pro5_c implements Pro5{
	int i=19;
	static int j=20;
	static int i(){
		return 40;
	}
	@Override
	public int j(){
		return 50;
	}
}

class Pro5_c_Logic{
	void add(){
		Pro5_c p5c= new Pro5_c();
		System.out.println(p5c.i + Pro5.j+p5c.j()+Pro5.i());
		
		Pro5 p5=new Pro5_c();
		System.out.println(p5.i + Pro5.j+p5.j()+Pro5.i());
		
		Pro5_c p5c2=(Pro5_c)p5;
		System.out.println(p5c2.i + Pro5.j+p5c2.j()+Pro5.i());
	}
}

class Pro5Test{
	public static void main(String...abc){
		Pro5_c_Logic p= new Pro5_c_Logic();
		p.add();
	}
}