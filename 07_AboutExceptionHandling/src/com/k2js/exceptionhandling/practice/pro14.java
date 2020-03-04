// How to use finally: if you want to display any message even after execution fails

package com.k2js.exceptionhandling.practice;

class Pro14{
		public static void mDiv(Object s)throws ArithmeticException{
			int i=10;
			int j=0;
			try{j=Integer.valueOf(s.toString());
				System.out.println(i/j);
			}catch(NumberFormatException | NullPointerException | ArithmeticException e){
				System.out.println(e);
				e.printStackTrace();				
			}finally{
				System.out.println("Thanks for execution");
				System.out.println("Thanks for execution");
			}			
	}
}

class Pro14Test{
	public static void main(String...abc){
		Pro14.mDiv("4");
		Pro14.mDiv(null);
		Pro14.mDiv("Hello");
		Pro14.mDiv("10");
		Pro14.mDiv("0");
		Pro14.mDiv("15");
	}
}

