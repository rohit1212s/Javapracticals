//To find greater number among 3 numbers using nested if else

package com.k2js.condition.practice;

class IFEx24{
	public static void greaterNumber(int a,int b, int c){
		
		if(a>b)
			if(a>c)
			System.out.println("The greater number is-->"+ a);
		
		if(b>c)
			if(b>a)
			System.out.println("The greater number is-->"+ b);
		
		else 
			System.out.println("The greater number is-->"+ c);
			
	}
}

class IFEx24Test{
	public static void main(String...abc){
		System.out.println("\n\n\n/***Output***\n");
		int a=(int)((Math.random()*25)+10);
			System.out.println("the generated number is-->" +a);
		int b=(int)((Math.random()*25)+10);
			System.out.println("the generated number is-->" +b);
		int c=(int)((Math.random()*25)+10);
			System.out.println("the generated number is-->" +c);
		IFEx24.greaterNumber(a,b,c);
		System.out.println("\n****End*****/");
	}
}



/***Output***

the generated number is-->22
the generated number is-->16
the generated number is-->17
The greater number is-->22

****End*****/
