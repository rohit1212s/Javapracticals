// to check default value of different Non primitive Array of static variable

package com.k2js.aboutstatic.practice;

class Sv_Dv_NonPrimitive_Array{
	static int[] i1;
	static Integer[] i2;
	static Comparable[] c1;
	static String[] s1;
}

class Sv_Dv_NonPrimitive_ArrayTest{
	public static void main(String...abc){
		System.out.println(Sv_Dv_NonPrimitive_Array.i1 +" for int");
		System.out.println(Sv_Dv_NonPrimitive_Array.i2 +" for Integer");
		System.out.println(Sv_Dv_NonPrimitive_Array.c1 +" for Comparable");
		System.out.println(Sv_Dv_NonPrimitive_Array.s1 +" for String");

	}
}