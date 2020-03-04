// to print hello in pattern like h-- he---hel---hell--hello   

package com.k2js.aboutstring.practice;

class Pro17{
	public static void printPattern1(String s){
		System.out.println("\n\n\n/***Output***\n");
	for(int i=1; i<=s.length(); i++){
		for(int j=s.length()-1;j>=0; j--){
			if((i+j)>=(s.length()+1)){
				System.out.print(s.charAt(j));
			}else
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("\n****End*****/");	
	}
}

class Pro17Test{
	public static void main(String...abc){
		Pro17.printPattern1("Hello");
		
		


	}
}



/***Output***


H
He
Hel
Hell
Hello

****End*****/
