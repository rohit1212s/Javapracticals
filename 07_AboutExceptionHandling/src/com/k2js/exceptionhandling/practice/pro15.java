// How to use try without catch

package com.k2js.exceptionhandling.practice;

class Pro15{
		public static void mDiv(Object s)throws ArithmeticException{
			int i=10;
			int j=0;
			try{j=Integer.valueOf(s.toString());
				System.out.println(i/j);
				
			}finally{
				System.out.println("Thanks for execution");

			}			
	}
}

class Pro15Test{
	public static void main(String...abc){
		Pro15.mDiv("4");
		Pro15.mDiv(null);
		Pro15.mDiv("Hello");
		Pro15.mDiv("10");
		Pro15.mDiv("0");
		Pro15.mDiv("15");
	}
}