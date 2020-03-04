// to reverse a string after each 3 character4


package com.k2js.aboutstring.practice;

class Pro24{
	public static void reverseMethodStringPractice(CharSequence cs){
		for(int i=0; i<cs.length(); i+=3){
			String s1=cs.toString();
			
			System.out.print(new StringBuffer(i+3>s1.length()?s1.substring(i):s1.substring(i,i+3)).reverse());
			
		}
	}
}

class Pro24Test{
	public static void main(String...abc){
		Pro24.reverseMethodStringPractice("rohitswatio");
	}
}