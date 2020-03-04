// To check null pointer exception  

package com.k2js.exceptionhandling.practice;

class Pro1{
	static String name;
	public static void mlen(){
		System.out.println(name.length());
	}
}

class Pro1Test{
	public static void main(String...abc){
		Pro1.mlen();
	}
}