// to print hello in pattern like hello-- ello---llo---lo--o   

package com.k2js.aboutstring.practice;

class Pro18{
	public static void printPattern2(String s){
		System.out.println("\n\n\n/***Output***\n");
	for(int i=0; i<s.length(); i++){
			for(int j=0; j<s.length(); j++){
				if(i>j)
				System.out.print(" ");
				else
				System.out.print(s.charAt(j));
			}
			System.out.println();
		}
		System.out.println("\n****End*****/");	
	}
}

class Pro18Test{
	public static void main(String...abc){
		Pro18.printPattern2("Hello");
		
		


	}
}



/***Output***

Hello
 ello
  llo
   lo
    o

****End*****/
