// how to analyze constructors

package com.k2js.aboutconstructors.practice;

class StrLength{
	String s;
	//static int j=20000;
}

class StrLengthTest{
	public static void main(String...abc){
		StrLength sl= new StrLength();
		sl.s= "Hello";
		System.out.println(sl.s.length());
	}
}
