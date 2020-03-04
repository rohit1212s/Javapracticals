// Insertion sort logic for sorting any array

package com.k2js.aboutarray.practice;

class InsertionSort{
	public static void main(String...abc){
		Integer[]a ={4,5,3,2,7};
		for(int i=0; i<a.length; i++){
			int smallestPosition=i;
			for(int j=i;j<a.length;j++){
				smallestPosition=(a[smallestPosition]>a[j])?j:smallestPosition;
			}
			int temp=a[i];
			a[i]=a[smallestPosition];
			a[smallestPosition]=temp;
		}
		System.out.println(java.util.Arrays.toString(a));
	}
}