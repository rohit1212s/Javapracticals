//If both the first condition is not true then 2nd will be executed and 1st will be skipped

package com.k2js.condition.practice;

class IFEx9{
	public static void main(String...abc){
		System.out.println("\n\n\n/***Output***\n");
		System.out.println("Statement1");
		if(!true)System.out.println("Hello");
		else if(true)System.out.println("Statement2");
		else System.out.println("Statement3");
		System.out.println("\n****End*****/");
	}
}