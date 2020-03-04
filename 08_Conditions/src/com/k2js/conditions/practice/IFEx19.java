//reverse randomly generated 2 digit number without converting to string

package com.k2js.condition.practice;

class IFEx19{
		public static void methodReverse(int i){
		int ud=i%10;
		int td=i/10;
		int rev= ud*10+td;
		System.out.println("the reverse number is-->"+rev);
		}
}

class IFEx19Test{
	
	public static void main(String...abc){
		int k=(int)((Math.random()*25)+10);
		System.out.println("the generated number is-->" +k);
		IFEx19.methodReverse(k);
	}
}




the generated number is-->24
the reverse number is-->42
