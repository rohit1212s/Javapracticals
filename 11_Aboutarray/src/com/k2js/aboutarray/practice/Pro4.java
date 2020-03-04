// convert a string into array and find the summ of all char and biggest character as well 


package com.k2js.aboutarray.practice;

class Pro4{
	public static void method1(String s){
		char[] c= s.toCharArray();
		int sum=0;
		char max=0;
		for(char t:c){
		sum=sum+t;	
		max=max<t?t:max;
		}
		System.out.println("Sum of all char= "+sum);
		System.out.println("Biggest in all char= "+max);
	}
	
}

class Pro4Test{
	public static void main(String...abc){
		Pro4.method1("Hello");
		Pro4.method1("AB");
	}
}