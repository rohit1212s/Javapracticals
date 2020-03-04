// to reverse a string

package com.k2js.aboutstring.practice;

class Pro5{
		public static void reverseMethod(String s){
			StringBuffer s2=new StringBuffer(s);
			System.out.println(s2.reverse());
	}
}

class Pro5Test{
	public static void main(String...abc){
		Pro5.reverseMethod("Rohit");
	}
}