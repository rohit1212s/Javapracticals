// To use of throw for stopping the execution in try catch block

package com.k2js.exceptionhandling.practice;

class Pro6{
		public static void mlen(String name){
		try{
			System.out.println(name.length());
		}
		catch(java.lang.NullPointerException npe){
			System.out.println(name + " is not an valid input");
			System.out.println(npe);
			System.out.println(npe.getMessage()); //to get the exception message//
			npe.printStackTrace();
			throw npe;
		}
	}
}

class Pro6Test{
	public static void main(String...abc){
		Pro6.mlen("Hello");
		Pro6.mlen(null);
		Pro6.mlen("world");
	}
}