//to print number one after one in next line

package com.k2js.forloop.practice;

class Pro13{

	public static void getDigits(int i){
		int tens=1;
		for(int num=i; num!=0; num/=10, tens*=10);
		for(int num=i; num!=0; num/=10, tens/=10){
			int digit=(i/(tens/10));
			System.out.println(digit);
		}
		
	}
}
class Pro13Test{
	public static void main(String...abc){
		System.out.println("\n\n\n/***Output***\n");

		Pro13.getDigits(124789);
		System.out.println("\n****End*****/");
	}
}





/***Output***

1
12
124
1247
12478
124789

****End*****/
