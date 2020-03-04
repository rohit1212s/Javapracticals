// How to use multiple catches with one try 

package com.k2js.exceptionhandling.practice;

class Pro11{

	public static void mDiv(Object s)throws ArithmeticException{
		int i=10;
		int j=0;
		try{
			j=Integer.valueOf(s.toString());
			System.out.println(i/j);
		}catch(NumberFormatException nfe){
				System.out.println(s+ "is not a valid input to convert a Integer");
				nfe.printStackTrace();
		}catch(ArithmeticException ae){
				System.out.println("Zero is not a valid input");
				ae.printStackTrace();
				throw ae;
		}catch(NullPointerException e){
				System.out.println(null +"  is not a valid input");
				e.printStackTrace();
		}
	}
}

class Pro11Test{
	public static void main(String...abc){
		Pro11.mDiv("4");
		Pro11.mDiv(null);
		Pro11.mDiv("Hello");
		Pro11.mDiv("10");
		Pro11.mDiv("0");
		Pro11.mDiv("15");
	}
}