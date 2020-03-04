// To check null pointer exception and handle with try catch

package com.k2js.exceptionhandling.practice;

class Pro3{
	public static void mlen(String name){
		try{
			System.out.println(name.length());
		}
		catch(java.lang.NullPointerException npe){
			System.out.println(name + " is not an valid input");
		}
	}
} 

class Pro3Test{
	public static void main(String...abc){
		Pro3.mlen("Hello");
		Pro3.mlen(null);
		Pro3.mlen("world");
	}
}