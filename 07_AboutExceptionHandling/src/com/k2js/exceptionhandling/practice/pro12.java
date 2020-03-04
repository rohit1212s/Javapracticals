// How to use multiple catches with parent catch 

package com.k2js.exceptionhandling.practice;

class Pro12{
		public static void mDiv(Object s)throws ArithmeticException{
			int i=10;
			int j=0;
			try{j=Integer.valueOf(s.toString());
				System.out.println(i/j);
			}catch(NumberFormatException nfe){
					System.out.println(s+ "is not a valid input to convert a Integer");
					//nfe.printStackTrace();
			}catch(Exception e){
					if(e instanceof ArithmeticException){
						System.out.println(e.getMessage()+" is not valid");
						throw e;
					}
					else if(e instanceof NullPointerException){
						System.out.println(null+" is not valid input");
					}
					else 
						System.out.println(e+" is not valid");
				
			}
	}
}

class Pro12Test{
	public static void main(String...abc){
		Pro12.mDiv("4");
		Pro12.mDiv(null);
		Pro12.mDiv("Hello");
		Pro12.mDiv("10");
		Pro12.mDiv("0");
		Pro12.mDiv("15");
	}
}
