// Static varible usage in static area in same class

package com.k2js.aboutstatic.practice;

public class Svv_A{
	static int i=10;
	
	static void m(){
		System.out.println("Classname= "+ Svv_A.i);
		Svv_A sva=null;
		System.out.println("ref that stored null "+ sva.i );
		System.out.println("Direct null "+ ((Svv_A)null).i);
		Svv_A sva1=new Svv_A();
		System.out.println("Ref variable that store object "+ sva1.i);
		System.out.println("Direct object "+ new Svv_A().i);
		Svv_A sva2=new Svv_A(){};
		System.out.println("Ref variable that store child object "+ sva2.i);
		System.out.println("Direct child object "+ new Svv_A(){}.i);
		//Svv_A sva3=Svv_A.this;
		//System.out.println("Ref variable that store current instance "+ sva3.i );
		//System.out.println("Direct this"+ this.i);
		System.out.println(i);
		
		
	}
}

class SV_ATest{
	public static void main(String...abc){
		Svv_A.m();
	}
}