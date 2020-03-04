// Static varible usage in non static area in same class

package com.k2js.aboutstatic.practice;

class Sv_B{
	static int i=10;
	
	 void m(){
		System.out.println("Classname= "+ Sv_B.i);
		Sv_B svb=null;
		System.out.println("ref that stored null "+ svb.i );
		System.out.println("Direct null "+ ((Sv_B)null).i);
		Sv_B svb1=new Sv_B();
		System.out.println("Ref variable that store object "+ svb1.i);
		System.out.println("Direct object "+ new Sv_B().i);
		Sv_B svb2=new Sv_B(){};
		System.out.println("Ref variable that store child object "+ svb2.i);
		System.out.println("Direct child object "+ new Sv_B(){}.i);
		Sv_B svb3=Sv_B.this;
		System.out.println("Ref variable that store current instance "+ svb3.i );
		System.out.println("Direct this "+ this.i);
		System.out.println(i);
		
		
	}
}

class Sv_BTest{
	public static void main(String...abc){
		Sv_B svb4=new Sv_B();
		 svb4.m();
	}
}