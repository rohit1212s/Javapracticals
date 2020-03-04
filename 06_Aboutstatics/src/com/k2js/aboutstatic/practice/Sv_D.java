// Static varible usage in static area in other class

package com.k2js.aboutstatic.practice;

class Sv_D{
	static int i=10;
}
	
class Sv_Dc1{
	static void m(){
		System.out.println("Classname= "+ Sv_C.i);
		Sv_C svb=null;
		System.out.println("ref that stored null "+ svb.i );
		System.out.println("Direct null "+ ((Sv_C)null).i);
		Sv_C svb1=new Sv_C();
		System.out.println("Ref variable that store object "+ svb1.i);
		System.out.println("Direct object "+ new Sv_C().i);
		Sv_C svb2=new Sv_C(){};
		System.out.println("Ref variable that store child object "+ svb2.i);
		System.out.println("Direct child object "+ new Sv_C(){}.i);
		//Sv_C svb3=Sv_C.this;
		//System.out.println("Ref variable that store current instance "+ svb3.i );
		//System.out.println("Direct this "+ this.i);
		//System.out.println(i);
		}	
	
}		
		

class Sv_Dc1Test{
	public static void main(String...abc){
		 Sv_Dc1.m();
	}
}