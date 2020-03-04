//to find length of any given number

package com.k2js.forloop.practice;

class Pro10{
	public static void getDigitCount(int i){
		int c=0,ec=0, s=0,big=0;
		for(int num=i; num!=0; num/=10){
			c++;
			int digit=num%10;
			ec=digit%2==0?++ec:ec;
			s+=digit;
			big=big<digit?digit:big;
			
		}
		System.out.println("Digit count "+c);//to find total count of a given number
		System.out.println("Even count= "+ec);// to find even count of a given number
		System.out.println("Sum count= "+s); // to get sum of total of a given number
		System.out.println("Biggest number= "+big);// to find biggest number in a given number
	}
}
class Pro10Test{
public static void main(String...abc){
	System.out.println("\n\n\n/***Output***\n");

	Pro10.getDigitCount(12576);
	System.out.println("\n****End*****/");
}
}


/***Output***

Digit count 6
Even count= 3
Sum count= 31
Biggest number= 9

****End*****/
