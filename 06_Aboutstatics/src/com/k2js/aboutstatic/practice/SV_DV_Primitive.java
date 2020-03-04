// to check default value of different primitive of static variable

package com.k2js.aboutstatic.practice;

class Sv_Dv_Primitive{
	static byte b1;
	static short s1;
	static int i1;
	static long l1;
	static float f1;
	static double d1;
	static char c1;
	static boolean b2;
}

class Sv_Dv_PrimitiveTest{
	public static void main(String...abc){
		System.out.println(Sv_Dv_Primitive.b1 +" for byte");
		System.out.println(Sv_Dv_Primitive.s1 +" for short");
		System.out.println(Sv_Dv_Primitive.i1 +" for int");
		System.out.println(Sv_Dv_Primitive.l1 +" for long");
		System.out.println(Sv_Dv_Primitive.f1 +" for float");
		System.out.println(Sv_Dv_Primitive.d1 +" for double");
		System.out.println((int)Sv_Dv_Primitive.c1 +" for char");
		System.out.println(Sv_Dv_Primitive.b2 +" for boolean");
	}
}