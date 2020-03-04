// to print a string in reverse order in such way so only it reverse first 3 letter then again next 3 letter

package com.k2js.aboutstring.practice;

class Pro19{
	public static void reverseMethod3(CharSequence cs){
		System.out.println("\n\n\n/***Output***\n");
		for(int i=0;i<cs.length();i+=3){
		//System.out.print(new StringBuffer((i+3>cs.length())?cs.subSequence(i,cs.length()):cs.subSequence(i,i+3)).reverse()); //one way
		System.out.print(new StringBuffer((i+3>cs.length())?cs.toString().substring(i):cs.toString().substring(i,i+3)).reverse());//2nd way
		}
		System.out.println("\n****End*****/");
	}
}

class Pro19Test{
	public static void main(String...abc){
		Pro19.reverseMethod3("Hellojavaselenium");	
	}
}


/***Output***

leHjolavalesinemu

****End*****/
