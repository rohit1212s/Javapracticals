// if you dont know exception name then use the parent class exception

package com.k2js.exceptionhandling.practice;

class Pro7{
		public static void mlen(String name){
		try{
			System.out.println(name.length());
		}
		catch(Throwable npe){
			System.out.println(name + " is not an valid input");
			System.out.println(npe);
			System.out.println(npe.getMessage()); //to get the exception message//
			npe.printStackTrace();
			throw npe;
			
		}
	}
}

class Pro7Test{
	public static void main(String...abc){
		Pro7.mlen("Hello");
		Pro7.mlen(null);
		Pro7.mlen("world");
	}
}

