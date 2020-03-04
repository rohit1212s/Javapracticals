//If both the condition is true then first true will be executed and 2nd will be skipped

package com.k2js.condition.practice;

class IFEx8{
	public static void main(String...abc){
		System.out.println("\n\n\n/***Output***\n");
		System.out.println("Statement1");
		if(true)System.out.println("Hello");
		else if(true)System.out.println("Statement2");
		System.out.println("\n****End*****/");
	}
}


/***Output***

Hello -->
World -->
Hello World -->
invalid -->

****End*****/
