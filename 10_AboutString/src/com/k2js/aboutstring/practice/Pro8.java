// to find index of a character in the String by using Index of method

package com.k2js.aboutstring.practice;

class Pro8{
	
	public static void findIndex(){
		String s="Hello world";
		System.out.println(s.indexOf('l'));
		System.out.println(s.indexOf('l',3));
		System.out.println(s.indexOf('l',4));
		
	}
}

class Pro8Test{
	public static void main(String...abc){
		Pro8.findIndex();
	}
}