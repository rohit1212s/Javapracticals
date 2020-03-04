//to check even odd number using ternary operator

package com.k2js.condition.practice;

class IFEx15{
	public static void methodDiv5And3(Number n){
		int i=n.intValue();
		
		//if (i%3==0 && i%5!=0){
		//	System.out.println("Hello");
		//}
		//else if(i%5==0 && i%3!=0){
		//	System.out.println("World");
		//}
		//else if(i%5==0 && i%3==0){
		//	System.out.println("Hello World");
		//}
		//else {
		//	System.out.println("Invalid");
		//}	
		String r=(((i%3==0 && i%5!=0)?"Hello -->":(i%5==0 && i%3!=0)?"World -->":(i%5==0 && i%3==0)?"Hello World -->":"invalid -->")+i);
		System.out.println(r);
	}
}
class IFEx15Test{
	public static void main(String...abc){
		System.out.println("\n\n\n/***Output***\n");
		IFEx15.methodDiv5And3(3);
		IFEx15.methodDiv5And3(5);
		IFEx15.methodDiv5And3(15);
		IFEx15.methodDiv5And3(16);
		
		int k=(int)((Math.random()*25)+5);
		System.out.println("the generated number is-->" +k);
		IFEx15.methodDiv5And3(k);
		System.out.println("\n****End*****/");
	}
}


/***Output***

Hello -->3
World -->5
Hello World -->15
invalid -->16

****End*****/
