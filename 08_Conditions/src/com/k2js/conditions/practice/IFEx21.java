//reverse randomly generated 2 digit number with try catch 

package com.k2js.condition.practice;

class IFEx21{
	public static void twoDigitRev2(Number n){
		int i=0;
		try{
			i=n.intValue();
			if (i<=10)throw new NumberFormatException();
			
			int ud=i%10;
			int td=i/10;
			int rev= ud*10+td;
			System.out.println(rev);
			
		}catch(NullPointerException |NumberFormatException e){
			if(e instanceof NumberFormatException){
				System.out.println(n + " is not a valid input");
			}
			else if(e instanceof NullPointerException){
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
	}
}

class IFEx21Test{
	public static void main(String...abc){
		IFEx21.twoDigitRev2(56);
		IFEx21.twoDigitRev2(6);
		IFEx21.twoDigitRev2(50);
		IFEx21.twoDigitRev2(null);
	}
}