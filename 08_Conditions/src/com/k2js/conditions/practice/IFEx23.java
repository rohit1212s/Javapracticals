//To find greater number among 3 numbers 

package com.k2js.condition.practice;

class IFEx23{
	public static void greaterNumber(int a,int b, int c){
		
		
		if(a>b && a>c){
			System.out.println("The greater number is-->"+ a);
		}
		else if(b>a && b>c){
			System.out.println("The greater number is-->"+ b);
		}
		else 
			System.out.println("The greater number is-->"+ c);
			
	}
}

class IFEx23Test{
	public static void main(String...abc){
		System.out.println("\n\n\n/***Output***\n");
		int a=(int)((Math.random()*25)+10);
			System.out.println("the generated number is-->" +a);
		int b=(int)((Math.random()*25)+10);
			System.out.println("the generated number is-->" +b);
		int c=(int)((Math.random()*25)+10);
			System.out.println("the generated number is-->" +c);
		IFEx23.greaterNumber(a,b,c);
		System.out.println("\n****End*****/");
	}
}


/***Output***

the generated number is-->10
the generated number is-->23
the generated number is-->25
The greater number is-->25

****End*****/
