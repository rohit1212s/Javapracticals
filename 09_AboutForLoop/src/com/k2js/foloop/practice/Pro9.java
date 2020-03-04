// Program to demonstrate for loop initialize inside the loop not outside and condition for exiting the loop in 2nd block inside the for loop
//optimize more so number of lines will be reduced
//Print A to Z
package com.k2js.forloop.practice;

class Pro9{
	public static void main(String...abc){

		//for(Comparable c=1; ((Number)c).intValue()<=5; c=((Number)c).intValue()+1)
			//System.out.println(c);
		
		//for(Comparable c=1; (int)(Number)c<=5; c=(int)(Number)c+1)
			//System.out.println(c);
		for(Comparable c=1; (Integer)c<=5; c=(Integer)c+1)
			System.out.println(c);
	}
}