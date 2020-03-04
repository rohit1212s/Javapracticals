//  take input as Objectand store array in the object and do addition


package com.k2js.aboutarray.practice;

class Pro8{
	public static void method5(){
		
		
		Object[] o=new Number[]{10,20};
		int sum=0;
		for(Number t:(Number[])o){
		sum=sum+t.intValue();
		}	
		System.out.println("Sum of all char= "+sum);
	}
	
}

class Pro8Test{
	public static void main(String...abc){
		Pro8.method5();
		
	}
}