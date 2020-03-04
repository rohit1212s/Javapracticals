// to print a string in particular pattern

package com.k2js.aboutstring.practice;

class Pro21{
	public static void printPattern5(String s){
		System.out.println("\n\n\n/***Output***\n");
		for(int c=s.length(),i=0; c>0; c--){
			System.out.printf("%"+s.length()+"s%n",s.substring(i,c));
		}
		
		System.out.println("\n****End*****/");
	}
		
}


class Pro21Test{
	public static void main(String...abc){
		Pro21.printPattern5("Hello");	
	}
}


/***Output***

Hello
 Hell
  Hel
   He
    H

****End*****/
