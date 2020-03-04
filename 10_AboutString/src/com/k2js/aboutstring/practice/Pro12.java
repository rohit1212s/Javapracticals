// in a String "Hello World" replace first half with java and 2nd half with selenium

package com.k2js.aboutstring.practice;

class Pro12{
	
	public static void findAndReplaceSubString(String s){
		System.out.println("\n\n\n/***Output***\n");
		String s1=s.replace(s.substring(0,s.length()/2),"java");
		String s2=s1.replace(s1.substring(s1.length()/2),"Selenium");
		System.out.println(s2);
		
		String fh=s.replace(s.substring(0,s.length()/2),"java").replace(s.substring(s.length()/2),"selenium");
		System.out.println(fh);
		System.out.println("\n****End*****/");	
	}
}

class Pro12Test{
	public static void main(String...abc){
		Pro12.findAndReplaceSubString("Helloworld");

	}
}


