// to calculate sum till the number becomes 1 digit

package com.k2js.forloop.practice;

class Pro17{

	public static void calculateSum(int i){
		 
		//while(i>9){
			int s;
			for(;i>9;i=s){
			 s=0;
			for(int num=i; num!=0; num/=10){
				int digit=num%10;
				s+=digit;
			}
			//i=s;
		}
		System.out.println("Sum = "+i);
	}
	
	public static void calculateSum2(int num){
		int sum=0;
		for(int i=num;i!=0;i/=10){
			int digit=i%10;
			sum+=digit;
			if(i/10==0 && sum>=10){
				i=sum*10;
				sum=0;
			}
		}
		System.out.println("Sum = "+sum);
	}
	
}

class Pro17Test{
	public static void main(String...abc){
		System.out.println("\n\n\n/***Output***\n");

		Pro17.calculateSum(34567499);
		
		System.out.println("\n****End*****/");
	}
}






/***Output***

Sum = 7

****End*****/
