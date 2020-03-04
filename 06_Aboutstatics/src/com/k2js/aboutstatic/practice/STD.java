// static variable and local variable with same name

package com.k2js.aboutstatic.practice;

class STD{
	static int i=10;
	
	public static void main(String...abc){
		i=20;
		int i=30;
		System.out.println(i);
		System.out.println(STD.i);
		
	}
}