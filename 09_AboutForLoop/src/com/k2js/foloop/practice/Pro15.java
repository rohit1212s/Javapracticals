// to find prime of a given number

package com.k2js.forloop.practice;

class Pro15{
	
	public static void checkPrime(int num){
		int counter=0;
		for(int i=1;i<=num/2;i++){
			if(num%i==0){
			counter=counter+1;
			}	
		}
		if(counter==1){
				System.out.println("the given number is prime");
			}else
				System.out.println("the given number is not prime");
	}
}

class Pro15Test{
	public static void main(String...abc){
		System.out.println("\n\n\n/***Output***\n");

		Pro15.checkPrime(13);
		
		System.out.println("\n****End*****/");
	}
}


/***Output***

the given number is prime

****End*****/
