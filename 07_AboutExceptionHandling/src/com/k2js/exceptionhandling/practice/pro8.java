

// How to use multiple catches with one try 

package com.k2js.exceptionhandling.practice;

class Prog8{
	public static void mDiv(String s){
		int i=10;
		int j=Integer.valueOf(s);
		System.out.println(i/j);
	}
}

class Prog8Test{
	public static void main(String...abc){
		Prog8.mDiv(null);
	}
}