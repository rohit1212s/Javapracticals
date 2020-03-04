//to check the value of i by using if else

package com.k2js.condition.practice;

class IFEx12{
	public static void main(String...abc){
		System.out.println("\n\n\n/***Output***\n");
		int i=10;
		if(i++==11 & i++==12)
			System.out.println("If Statement 1"+ i);
		else
			System.out.println("Else Statement 2 "+ i);
		System.out.println("\n****End*****/");
	}
}


/***Output***

Else Statement 2 12

****End*****/
