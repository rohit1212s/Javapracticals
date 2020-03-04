// To see the exception name and the exception message if it has any

package com.k2js.exceptionhandling.practice;

class Pro4{
		public static void mlen(String name){
		try{
			System.out.println(name.length());
		}
		catch(java.lang.NullPointerException npe){
			System.out.println(name + " is not an valid input");
			System.out.println(npe);
			System.out.println(npe.getMessage()); //to get the exception message//
		}
	}
}
class Pro4Test{
	public static void main(String...abc){
		Pro4.mlen("Hello");
		Pro4.mlen(null);
		Pro4.mlen("world");
	}
}