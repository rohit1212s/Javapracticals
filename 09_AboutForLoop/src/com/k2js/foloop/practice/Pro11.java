//to print number one after one in next line

package com.k2js.forloop.practice;

class Pro11{
	public static void findpalindrome(int i){
		int revNum=0;
		for(int num=i; num!=0; num/=10){
			int digit=num%10;
			revNum=(revNum*10)+digit;
			
		}
		System.out.println(((revNum==i)?"":"Not ")+ "Palindrome");//to find if a given number is palindrome or not	
	}
	
	public static void getDigits(int i){
		int tens=1;
		for(int num=i; num!=0; num/=10, tens*=10);
		System.out.println(tens);
		for(int num=i; num!=0; num/=10, tens/=10){
			int digit=(i/(tens/10))%10;
			System.out.println(digit);
		}
		
	}
}
class Pro11Test{
	public static void main(String...abc){
		System.out.println("\n\n\n/***Output***\n");

		Pro11.findpalindrome(121121);
		//Pro11.getDigits(124789);
		System.out.println("\n****End*****/");
	}
}


/***Output***

1000000
1
2
4
7
8
9

****End*****/
