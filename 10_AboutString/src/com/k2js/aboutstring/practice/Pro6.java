// to reverse a string using charAt method

package com.k2js.aboutstring.practice;

class Pro6{
	public static void reverseMethod2(String s){
		for(int i=s.length()-1; i>=0; i--){
			System.out.print(s.charAt(i));
		}
	}
}

class Pro6Test{
	public static void main(String...abc){
		Pro6.reverseMethod2("Rohit");
	}
}