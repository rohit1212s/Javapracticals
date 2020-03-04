// to print length of a string and array


package com.k2js.aboutarray.practice;

class Pro1{
	public static void printLen(String s,int[] a){
		System.out.println("Lenth= "+ s.length());
		System.out.println("Lenth= "+ a.length);
	}
}

class Pro1Test{
	public static void main(String...abc){
		Pro1.printLen("Hello", new int[] {1,2,3,4,5});
	}
}