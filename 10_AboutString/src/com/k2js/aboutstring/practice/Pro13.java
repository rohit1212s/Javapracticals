// to find if a string is a palindrome or not

package com.k2js.aboutstring.practice;

class Pro13{
	
	public static void findAndReplaceSubString(String s){
		System.out.println("\n\n\n/***Output***\n");
		String temp=s;
		StringBuffer s2=new StringBuffer(s);
		String s3=(s2.reverse()+"");
		//System.out.println(s3);
		if(temp.equalsIgnoreCase(s3))System.out.println("The given String is Pallindrome "+ temp);
		else System.out.println("The given String is not Pallindrome "+ temp);
		
		
		
		System.out.println("\n****End*****/");	
	}
}

class Pro13Test{
	public static void main(String...abc){
		Pro13.findAndReplaceSubString("sys");

	}
}


/***Output***

The given String is Pallindrome sys

****End*****/
