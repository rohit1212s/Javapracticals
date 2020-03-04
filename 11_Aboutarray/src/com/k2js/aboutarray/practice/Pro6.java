//  take input as Number array and find the summ of all number inside a array


package com.k2js.aboutarray.practice;

class Pro6{
	public static void method3(Number[] a){
		
		Integer sum=0;
		
		for(Number t:a){
		sum=sum+(Integer)t;	

		}
		System.out.println("Sum of all char= "+sum);
	}
	
}

class Pro6Test{
	public static void main(String...abc){
		Pro6.method3(new Integer[]{2,3,4,5});
		
	}
}