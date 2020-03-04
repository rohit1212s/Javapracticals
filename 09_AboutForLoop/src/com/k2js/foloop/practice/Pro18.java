// to calculate sum till the number becomes 1 digit

package com.k2js.forloop.practice;

class Pro18{

	public static void fibonacci(int num){
		 
		int s=0,n1=0,n2=1;
		for(int i=1; i<=num; i++){
			System.out.print(n1);
			s=n1+n2;
			n1=n2;
			n2=s;
			//System.out.print(n2);
			
		}
		
	}
	
	public static void fibonacci2(int n){
		int i=0,j,c;
		for(c=j=1, System.out.print(i+"\t"+j+"\t"); c<n; c++){
			int temp=j;
			j=i+j;
			i=temp;
			System.out.print(j+"\t");
		}
	}
	
}

class Pro18Test{
	public static void main(String...abc){
		System.out.println("\n\n\n/***Output***\n");

		Pro18.fibonacci2(5);
		
		System.out.println("\n****End*****/");
	}
}


/***Output***

0	1	1	2	3	5	
****End*****/
