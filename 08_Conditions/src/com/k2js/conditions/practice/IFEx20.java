//reverse randomly generated 2 digit number with try catch 

package com.k2js.condition.practice;

class IFEx20{
	public static void twoDigitRev(Number n){
		int i=0;
		try{
			i=n.intValue();
			int ud=i%10;
			int td=i/10;
			int rev= ud*10+td;
			System.out.println(rev);
			
		}catch(NullPointerException e){
			System.out.println(n + "is nit a valid input");
			throw e;
		}
	}
}

class IFEx20Test{
	public static void main(String...abc){
		IFEx20.twoDigitRev(56);
		IFEx20.twoDigitRev(0);
		IFEx20.twoDigitRev(50);
		IFEx20.twoDigitRev(null);
	}
}