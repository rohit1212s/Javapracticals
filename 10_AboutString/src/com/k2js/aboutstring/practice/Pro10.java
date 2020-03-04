// to usage of replace method in String 

package com.k2js.aboutstring.practice;

class Pro10{
	
	public static void findIndex(String s){
		//String s="Hello world";
		System.out.println(s.replace('l','r'));		
		System.out.println(s.replace(new StringBuffer("Hello"),"Rohit"));	
	}
}

class Pro10Test{
	public static void main(String...abc){
		Pro10.findIndex("Hello world");

	}
}