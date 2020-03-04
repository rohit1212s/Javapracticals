// To see the stacktrace during execution

package com.k2js.exceptionhandling.practice;

class Pro5{
		public static void mlen(String name){
		try{
			System.out.println(name.length());
		}
		catch(java.lang.NullPointerException npe){
			System.out.println(name + " is not an valid input");
			System.out.println(npe);
			System.out.println(npe.getMessage()); //to get the exception message//
			npe.printStackTrace();
		}
	}
}
class Pro5Test{
	public static void main(String...abc){
		Pro5.mlen("Hello");
		Pro5.mlen(null);
		Pro5.mlen("world");
	}
}