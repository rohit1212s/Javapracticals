// to check the all character in a String which is not duplicate   

package com.k2js.aboutstring.practice;

class Pro16{
	public static void printMethod2(String s){
		System.out.println("\n\n\n/***Output***\n");
		char big=0;
		String s1=null;
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			if(!s.substring(0,i).contains(c+"") && !s.substring(i+1).contains(c+"")){
					System.out.print(c);
			}
			 
		}
		
		System.out.println("\n****End*****/");	
	}
}

class Pro16Test{
	public static void main(String...abc){
		Pro16.printMethod2("Helloosss");
		
		


	}
}


/***Output***

He
****End*****/
