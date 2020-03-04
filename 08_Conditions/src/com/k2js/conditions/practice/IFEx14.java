//to check even odd number using ternary operator

package com.k2js.condition.practice;

class IFEx14{
	public static void methodEvenOdd(int i){
		String r=(((i%2==0)?"Even ":"Odd ")+i);
		System.out.println(r);
	}
}
class IFEx14Test{
	public static void main(String...abc){
		System.out.println("\n\n\n/***Output***\n");
		IFEx14.methodEvenOdd(40);
		IFEx14.methodEvenOdd(51);
		IFEx14.methodEvenOdd(60);
		System.out.println("\n****End*****/");
	}
}




/***Output***

Even 40
Odd 51
Even 60

****End*****/
