// to find the biggest string as per the alphabet order

package com.k2js.aboutstring.practice;

class Pro4{
	public static String bigString(CharSequence cs1, CharSequence cs2){
		String s1= cs1.toString();
		String s2= cs2.toString();
		if((s1).compareTo(s2)>0)
			return s1;
		else
			return s2;
	}
}

class StrPro4Test{
	public static void main(String...abc){
		String s3=Pro4.bigString("aeroplane","girl");
		System.out.println(s3);
		
		String s4 = Pro4.bigString(new StringBuilder("how"),new StringBuilder("Hello"));
		System.out.println(s4);
	}
}