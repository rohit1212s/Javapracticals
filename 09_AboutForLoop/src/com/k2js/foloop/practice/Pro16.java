// to find all prime number till 100 digit

package com.k2js.forloop.practice;

class Pro16{
	
	public static void checkPrime(){
       int i =0;
       int num =0;
       String  primeNumbers = "";
	   
       for (i=1;i<=100;i++){         	  	  
          int counter=0; 	  
          for(int j=1;j<=i;j++){
             if(i%j==0){
				counter=counter+1;
				}
			}
			if(counter==2){
			primeNumbers = primeNumbers + i + " ";
			}	
		}
		System.out.println("Prime numbers from 1 to 100 are :"+ primeNumbers);
   }

}

class Pro16Test{
	public static void main(String...abc){
		System.out.println("\n\n\n/***Output***\n");

		Pro16.checkPrime();
		
		System.out.println("\n****End*****/");
	}
}


/***Output***

Prime numbers from 1 to 100 are :2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 

****End*****/
