//to check even odd number using if else condition

package com.k2js.condition.practice;

class IFEx13{
	public static void methodEvenOdd(int i){
		if (i%2==0){
			System.out.println("the number is even");
		}
		else
			System.out.println("the number is odd");
	}
}

class IFEx13Test{
	public static void main(String...abc){
		System.out.println("\n\n\n/***Output***\n");
		
		IFEx13.methodEvenOdd(4);
		IFEx13.methodEvenOdd(5);
		IFEx13.methodEvenOdd(6);
		
		System.out.println("\n****End*****/");
	}
}




/***Output***

the number is even
the number is odd
the number is even

****End*****/
