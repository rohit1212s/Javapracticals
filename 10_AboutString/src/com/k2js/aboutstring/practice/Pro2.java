// to demonstrate of String

package com.k2js.aboutstring.practice;

class StrPro2{
	public static void m(String s){
		System.out.println(s.length());
	}
}

class StrPro2Test{
	public static void main(String...abc){
		StrPro2.m("Rohit");
		StrPro2.m(123+"");
		StrPro2.m(new String("Hello"));
		StrPro2.m(new StringBuffer("how")+"");
		StrPro2.m(new StringBuilder("when").toString());
		StrPro2.m(String.valueOf("Hello"));
	}
}