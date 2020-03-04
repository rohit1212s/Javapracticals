//to check even odd number using ternary operator from number to double

package com.k2js.condition.practice;

class IFEx17{
	public static void methodDiv5And3(Number n){

		double d=(double)n;

		String r=(((d%3==0 && d%5!=0)?"Hello -->":(d%5==0 && d%3!=0)?"World -->":(d%5==0 && d%3==0)?"Hello World -->":"invalid -->")+d);
		System.out.println(r);
	}
}
class IFEx17Test{
	public static void main(String...abc){
		System.out.println("\n\n\n/***Output***\n");
		IFEx17.methodDiv5And3(3d);
		IFEx17.methodDiv5And3(5d);
		IFEx17.methodDiv5And3(15d);
		IFEx17.methodDiv5And3(16d);
		System.out.println("\n****End*****/");
	}
}






/***Output***

Hello -->3.0
World -->5.0
Hello World -->15.0
invalid -->16.0

****End*****/
