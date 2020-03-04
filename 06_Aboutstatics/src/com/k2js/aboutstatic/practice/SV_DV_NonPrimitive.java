// to check default value of different Non primitive of static variable

package com.k2js.aboutstatic.practice;

class Sv_Dv_NonPrimitive{
	static Byte b1;
	static Short s1;
	static Integer i1;
	static CharSequence cs1;
	static Comparable c1;
	static String s2;
}

class Sv_Dv_NonPrimitiveTest{
	public static void main(String...abc){
		System.out.println(Sv_Dv_NonPrimitive.b1 +" for Byte");
		System.out.println(Sv_Dv_NonPrimitive.s1 +" for Short");
		System.out.println(Sv_Dv_NonPrimitive.i1 +" for Integer");
		System.out.println(Sv_Dv_NonPrimitive.cs1 +" for CharSequence");
		System.out.println(Sv_Dv_NonPrimitive.c1 +" for Comparable");
		System.out.println(Sv_Dv_NonPrimitive.s2 +" for String");

	}
}