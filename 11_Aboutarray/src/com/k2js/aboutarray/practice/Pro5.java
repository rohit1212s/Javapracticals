//  take input as int array and find the summ of all integer


package com.k2js.aboutarray.practice;

class Pro5{
	public static void method2(int[] a){
		
		int sum=0;
		
		for(int t:a){
		sum=sum+t;	

		}
		System.out.println("Sum of all char= "+sum);
	}
	
}

class Pro5Test{
	public static void main(String...abc){
		Pro5.method2(new int[]{2,3,4,5});
		
		
	}
}