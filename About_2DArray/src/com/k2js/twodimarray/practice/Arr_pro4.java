// to find the value in each array by using for loop

package com.k2js.twodimarray.practice;

class Arr_Pro4{
	public static void main(String...abc){
		System.out.println("\n\n\n/***Output***\n");
		int[][] arr={{10,20,30},{5,6},{6,7,8,9,10}};
		for(int l=0;l<arr.length;l++){
			for(int i=0;i<arr[l].length;i++){
				System.out.print(arr[l][i]+"\t");
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
