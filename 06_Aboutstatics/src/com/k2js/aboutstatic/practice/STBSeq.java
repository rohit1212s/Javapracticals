// checking where execution starts from:

package com.k2js.aboutstatic.practice;

class STBSeq{

	static int i=100000;
	static{
		System.out.println("I am static block");
		System.out.println(i);
		System.out.println(STBSeq.j);	
	}
	static int j=200000;
	
	public static void main(String...abc){
		System.out.println("I am main block");
		System.out.println(i);
		System.out.println(j);
	}
}