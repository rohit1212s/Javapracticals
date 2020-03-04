// to print a string in particular pattern

package com.k2js.aboutstring.practice;

class Pro20{
	static int r=0, i=0;
	public static void printPattern4(String s){
		System.out.println("\n\n\n/***Output***\n");
		
		using 1 forloop
		for(int c=1, i=0; c<=s.length(); c++){
			System.out.printf("%"+s.length()+"s%n",s.substring(i,c));
		}
		
		//using 2 for loop
		//for(int i=1; i<=s.length(); i++){
		//	for(int j=0; j<s.length(); j++){
		//		if(j==s.length()-i){
		//			System.out.println(s.substring(0,i));
		//			break;
		//		}else
		//			System.out.print(" ");
		//	}
		//}
		
		//using 1 for loop with different way
		
		//for(int r=1,i=0; r<=s.length();){
		//	if(i++==s.length()-r){
		//		System.out.println(s.substring(0,r++));
		//		i=0;
		//	}else
		//		System.out.print(" ");
		//}
		
		//Using for loop with different method
		//for(int r=1,i=0; r<=s.length();r=(i==-1)?++r:r,i=(i==-1)? 0:++i){
		//	if(i==s.length()-r){
		//		System.out.println(s.substring(0,r));
		//		i=-1;
		//	}else
		//		System.out.print(" ");
		//}
		
		
		//for(i=0; i<s.length();i++,r=0){
		//	java.util.stream.IntStream.range(i,s.length()).forEach(x->System.out.print((x+i>=s.length()-i)?s.charAt(r++):"\n"));
		//	
		//}
		//System.out.println();
		//
		//
		//System.out.println("\n****End*****/");
	}
		
}


class Pro20Test{
	public static void main(String...abc){
		Pro20.printPattern4("Hello");	
	}
}


/***Output***

    H
   He
  Hel
 Hell
Hello

****End*****/



/***Output***

    H
   He
  Hel
 Hell
Hello

****End*****/
