// static variable cnat be changed in global scope but if you want to change then you can use different varaible as given follow:

package com.k2js.aboutstatic.practice;

class STD2{
	static int i=10;
	// cant change in global scope directly
	//i=20;
	static int j=i=20;
	
	public static void main(String...abc){
		System.out.println(i);
		
	}
}