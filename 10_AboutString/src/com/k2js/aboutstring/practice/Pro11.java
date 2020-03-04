// to find iteration of a specific charater in string 

package com.k2js.aboutstring.practice;

class Pro11{
	
	public static void findIteration(String s){
		System.out.println("\n\n\n/***Output***\n");
		//String s="Hello world";
		int i=s.length()-s.replace("l","").length();
		System.out.println(i);
		System.out.println("\n****End*****/");	
	}
}

class Pro11Test{
	public static void main(String...abc){
		Pro11.findIteration("Hello world");

	}
}


/***Output***

3

****End*****/
