// Program to demonstrate for loop initialize inside the loop not outside and condition for exiting the loop in 2nd block inside the for loop
//optimize more so number of lines will be reduced
//Print A to Z
package com.k2js.forloop.practice;

class Pro8{
	public static void main(String...abc){
		System.out.println("\n\n\n/***Output***\n");
		
		for(double d=1.5;d>=1.0; d-=0.1){
			System.out.println(d);
		}
		System.out.println("\n****End*****/");
	}
}


/***Output***

1.5
1.4
1.2999999999999998
1.1999999999999997
1.0999999999999996

****End*****/
