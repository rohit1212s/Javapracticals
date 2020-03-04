// to check i==j for Integer

package com.k2js.condition.practice;



class Integer1Test{

	public static void main(String...abc){
	Integer i=10;
	Integer j=new Integer(10);
	boolean a= i==j;
		System.out.println(a);
		
	boolean b= i==j.intValue();
		System.out.println(b);
	}
	
}