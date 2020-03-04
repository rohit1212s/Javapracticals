// to find index of a String in the String by using Index of method

package com.k2js.aboutstring.practice;

class Pro9{
	
	public static void findIndex(String s){
		//String s="Hello world";
		System.out.println(s.indexOf("ll"));
		System.out.println(s.indexOf("o",5));
		System.out.println(s.lastIndexOf('l'));
		
	}
}

class Pro9Test{
	public static void main(String...abc){
		Pro9.findIndex("Hello world");
		//Pro9.findIndex("Hello world");
	}
}