// To check null pointer exception 2nd program

package com.k2js.exceptionhandling.practice;  

class Pro2{
	public static void mlen(String name){
		System.out.println(name.length());
	}
}

class Pro2Test{
	public static void main(String...abc){
		Pro2.mlen("Hello");
		Pro2.mlen(null);
	}
}