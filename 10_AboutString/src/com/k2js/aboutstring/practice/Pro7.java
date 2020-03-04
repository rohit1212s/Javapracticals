// to find sum of a string

package com.k2js.aboutstring.practice;

class Pro7{
	
	public static void sumMethod(String s){
		char big=0;
		for(int i=0; i<s.length(); i++){
		
			big=big<s.charAt(i)?s.charAt(i):big;
		}
		System.out.println(big);
		
	}
}

class Pro7Test{
	public static void main(String...abc){
		Pro7.sumMethod("Rohit");
	}
}




