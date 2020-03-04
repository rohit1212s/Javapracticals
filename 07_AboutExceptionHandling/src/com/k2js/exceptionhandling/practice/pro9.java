// How to use multiple catches with one try 

package com.k2js.exceptionhandling.practice;

class Pro9{
	public static void mDiv(String s){
		int i=10;
		int j=0;
		try{
			j=Integer.valueOf(s);
			System.out.println(i/j);
		}catch(NumberFormatException nfe){
			System.out.println(s+ "is not a valid input to convert a Integer");
			nfe.printStackTrace();
		}catch(ArithmeticException ae){
			System.out.println("Zero is not a valid input");
			ae.printStackTrace();
		}
		
		
	}
}

class Pro9Test{
	public static void main(String...abc){
		Pro9.mDiv("4");
		Pro9.mDiv("0");
		Pro9.mDiv(null);
	}
}

