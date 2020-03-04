// to find the value in each array by using advanced for loop

package com.k2js.twodimarray.practice;

class Arr_Pro5{
	public static void main(String...abc){
		System.out.println("\n\n\n/***Output***\n");
		int[][] arr={{10,20,30},{5,6},{6,7,8,9,10}};
		for(int t[]:arr){
			for(int temp:t){
				System.out.print(temp+"\t");
			}
			System.out.println();
		}
		System.out.println("\n****End*****/");
	}
	
}


/***Output***

10	20	30	
5	6	
6	7	8	9	10	

****End*****/
