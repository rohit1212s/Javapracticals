// How to use multiple catches using pipe symbol "|" in same line

package com.k2js.exceptionhandling.practice;

class Pro13{
		public static void mDiv(Object s)throws ArithmeticException{
			int i=10;
			int j=0;
			try{j=Integer.valueOf(s.toString());
				System.out.println(i/j);
			}catch(NumberFormatException | NullPointerException | ArithmeticException e){
				System.out.println("any input" +s+ " is invalid");
				if(e instanceof ArithmeticException){
					System.out.println(e.getMessage()+" is not valid");
				}
				else if(e instanceof NullPointerException){
						System.out.println(null+" is not valid input");
				}
				else if(e instanceof NumberFormatException){
						System.out.println(s+" is not valid input to convert in integer");
				}
			}		
			
	}
}

class Pro13Test{
	public static void main(String...abc){
		Pro13.mDiv("4");
		Pro13.mDiv(null);
		//Pro13.mDiv("Hello");
		//Pro13.mDiv("10");
		//Pro13.mDiv("0");
		//Pro13.mDiv("15");
	}
}