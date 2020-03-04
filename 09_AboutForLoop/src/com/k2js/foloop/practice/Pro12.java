//to see pattern in reverse down order

package com.k2js.forloop.practice;

class Pro12{

	public static void getDigits(int i){
		//int tens=1;
		//for(int num=i; num!=0; num/=10, tens*=10);
		//System.out.println(tens);
		for(int tens=10, num=i; num!=0; num/=10, tens*=10){
			int digit=(i%tens);
			System.out.println(digit);
		}
		
	}
}
class Pro12Test{
	public static void main(String...abc){
		System.out.println("\n\n\n/***Output***\n");
		Pro12.getDigits(124789);
		
		System.out.println("\n****End*****/");
	}
}


/***Output***

9
89
789
4789
24789
124789

****End*****/
