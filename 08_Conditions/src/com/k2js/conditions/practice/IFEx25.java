//To find greater number among 3 numbers using Math.max()

package com.k2js.condition.practice;

class IFEx25{
	public static void greaterNumber(int a,int b, int c){
			//int d=Math.max(Math.max(a,b),c);
				//System.out.println("The greater number is "+d);
			int r= Math.max((a>b)?a:b,c);
				System.out.println("The greater number is "+r);
		
	}
}

class IFEx25Test{
	public static void main(String...abc){
		System.out.println("\n\n\n/***Output***\n");
		int a=(int)((Math.random()*25)+10);
			System.out.println("the generated number is-->" +a);
		int b=(int)((Math.random()*25)+10);
			System.out.println("the generated number is-->" +b);
		int c=(int)((Math.random()*25)+10);
			System.out.println("the generated number is-->" +c);
		IFEx25.greaterNumber(a,b,c);
		System.out.println("\n****End*****/");
	}
}


/***Output***

the generated number is-->14
the generated number is-->24
the generated number is-->22
The greater number is 24

****End*****/
