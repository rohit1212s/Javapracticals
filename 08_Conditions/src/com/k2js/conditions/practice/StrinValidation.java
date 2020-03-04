//to validate 2 string

package com.k2js.condition.practice;

class StringValidation{
	public static void validateString(){
		String s1= "Hello";
		String s2=new String(s1);
		System.out.println(s1==s2);
	}
	public static void validateString1(){
		String s1= "Hello";
		String s2=new String(s1);
		System.out.println(s1==s2.intern());
	}
}

class StringValidationTest{
	public static void main(String...abc){
		StringValidation.validateString();
		StringValidation.validateString1();
		
	
	}
}