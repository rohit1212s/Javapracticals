// to print a string in particular pattern

package com.k2js.aboutstring.practice;

class Pro22{
	public static void printPattern6(String s){
		System.out.println("\n\n\n/***Output***\n");
		for(int c=s.length(),i=0; i<=c; i++){
			System.out.printf("%"+s.length()+"s%n",s.substring(i,c));
		}
		
		System.out.println("\n****End*****/");
	}
		
}


class Pro22Test{
	public static void main(String...abc){
		Pro22.printPattern6("Hello");	
	}
}


/***Output***

Hello
 ello
  llo
   lo
    o
     

****End*****/
