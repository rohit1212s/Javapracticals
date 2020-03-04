// comparing the length of charsequence and charsequence array and return in Object type 


package com.k2js.aboutarray.practice;

class Pro3{
	public static Object m(CharSequence cs1, CharSequence[] cs2){
		if (cs1.length()>cs2.length)
		return cs1;
	else
		return cs2;
	}
	
}

class Pro3Test{
	public static void main(String...abc){
		Object o= Pro3.m("Hello",new CharSequence[]{"Hello","keys"});
		if(o instanceof String)
			System.out.println(o);
		else
			System.out.println(java.util.Arrays.toString((CharSequence[])o));
	}
}

