//to check even odd number using ternary operator from number to char

package com.k2js.condition.practice;

class IFEx18{
	public static void methodDiv5And3(Number n){

		char c=(char)(int)n;

		String r=(((c%3==0 && c%5!=0)?"Hello -->":(c%5==0 && c%3!=0)?"World -->":(c%5==0 && c%3==0)?"Hello World -->":"invalid -->")+c);
		System.out.println(r);
	}
}
class IFEx18Test{
	public static void main(String...abc){
		System.out.println("\n\n\n/***Output***\n");
		IFEx18.methodDiv5And3(3);
		IFEx18.methodDiv5And3(5);
		IFEx18.methodDiv5And3(15);
		IFEx18.methodDiv5And3(16);
		System.out.println("\n****End*****/");
	}
}





/***Output***

Hello -->
World -->
Hello World -->
invalid -->

****End*****/
