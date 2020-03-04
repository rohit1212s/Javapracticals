// to find the biggest string 

package com.k2js.aboutstring.practice;

class Pro3{
	public static String bigString(CharSequence cs1, CharSequence cs2){
		//int i=cs1.length();
		//int j=cs2.length();
		//if(i>j)
		//	return cs1.toString();
		//else
		//	return cs2.toString();
		String s2= cs1.toString();
		String s3= cs2.toString();
		if(s2.length()>s3.length())
		return cs1.toString();
		else 
			return cs2.toString();
		
	}
}

class StrPro3Test{
	public static void main(String...abc){
		String s1=Pro3.bigString("Helloi", "world");
		System.out.println(s1);
		String s4=Pro3.bigString(new StringBuffer("rohit"), new StringBuilder("roushan"));
		System.out.println(s4);
		String s5=Pro3.bigString("Helloi", "world");
		System.out.println(s5);
	}
}