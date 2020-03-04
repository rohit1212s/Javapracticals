//to check even odd number using ternary operator number to long

package com.k2js.condition.practice;

class IFEx16{
	public static void methodDiv5And3(Number n){

		long l=(long)n;

		String r=(((l%3==0 && l%5!=0)?"Hello -->":(l%5==0 && l%3!=0)?"World -->":(l%5==0 && l%3==0)?"Hello World -->":"invalid -->")+l);
		System.out.println(r);
	}
}
class IFEx16Test{
	public static void main(String...abc){
		System.out.println("\n\n\n/***Output***\n");
		IFEx16.methodDiv5And3(3l);
		IFEx16.methodDiv5And3(5l);
		IFEx16.methodDiv5And3(15l);
		IFEx16.methodDiv5And3(16l);
		System.out.println("\n****End*****/");
	}
}


/***Output***

Hello -->3
World -->5
Hello World -->15
invalid -->16

****End*****/
