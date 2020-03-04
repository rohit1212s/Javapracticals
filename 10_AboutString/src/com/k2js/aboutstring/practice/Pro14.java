// to find if a string is a palindrome or not

package com.k2js.aboutstring.practice;

class Pro14{
	
	public static void findAndReplaceSubString(String s){
		System.out.println("\n\n\n/***Output***\n");
		String fh=s.substring(0,(s.length()+1)/2);
		String lh=new StringBuffer(s.substring(s.length()/2)).reverse().toString();
		
		if(fh.equalsIgnoreCase(lh))System.out.println("The given String is Pallindrome "+ s);
		else System.out.println("The given String is not Pallindrome "+ s);
		
		
		
		System.out.println("\n****End*****/");	
	}
}

class Pro14Test{
	public static void main(String...abc){
		Pro14.findAndReplaceSubString("sys");
		Pro14.findAndReplaceSubString("syys");
		Pro14.findAndReplaceSubString("ss");
		Pro14.findAndReplaceSubString("syyyss");

	}
}


/***Output***

The given String is Pallindrome sys

****End*****/



/***Output***

The given String is Pallindrome syys

****End*****/



/***Output***

The given String is Pallindrome ss

****End*****/



/***Output***

The given String is not Pallindrome syyyss

****End*****/
