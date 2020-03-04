// to check the all character in a String if it is coming twice or not then print only once 

package com.k2js.aboutstring.practice;

class Pro15{
	public static void printMethod(String s){
		System.out.println("\n\n\n/***Output***\n");
		char big=0;
		String s1=null;
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			if(!s.substring(0,i).contains(c+"")){
				System.out.print(c);
			}
			 
		}
		
		System.out.println("\n****End*****/");	
	}
}

class Pro15Test{
	public static void main(String...abc){
		Pro15.printMethod("Hellooss");
		Pro15.printMethod("Heslloeoss");
		Pro15.printMethod("Heeeeslloeoss");
		


	}
}


/***Output***

Helos
****End*****/



/***Output***

Helos
****End*****/



/***Output***

Heslo
****End*****/
