// to find factorial of a given number

package com.k2js.forloop.practice;

class Pro14{

	public static void findFact(int num){
		int digit=1;
		for(int i=num;i>=1;i--){
			digit=digit*i;			
		}
		System.out.println(digit);
	}
}

class Pro14Test{
	public static void main(String...abc){
		System.out.println("\n\n\n/***Output***\n");

		Pro14.findFact(5);
		
		System.out.println("\n****End*****/");
	}
}



/***Output***

120

****End*****/
