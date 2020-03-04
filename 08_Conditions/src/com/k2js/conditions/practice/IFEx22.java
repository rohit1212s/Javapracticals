//To find greater number between 2 numbers 

package com.k2js.condition.practice;

class IFEx22{
	public static void greaterNumber(int a,int b){
		
		
		if(a>b){
			System.out.println("The greater number is-->"+ a);
		}
		else
			System.out.println("The greater number is-->"+ b);
	}
}

class IFEx22Test{
	public static void main(String...abc){
		System.out.println("\n\n\n/***Output***\n");
		int a=(int)((Math.random()*25)+10);
			System.out.println("the generated number is-->" +a);
		int b=(int)((Math.random()*25)+10);
			System.out.println("the generated number is-->" +b);
			IFEx22.greaterNumber(a,b);
		System.out.println("\n****End*****/");
	}
}



/***Output***

the generated number is-->15
the generated number is-->11
The greater number is-->15

****End*****/
