// bubble sort logic for sorting any array

package com.k2js.aboutarray.practice;

class BubbleSort{
	public static void main(String...abc){
		Integer[] a={4,5,3,7,2};
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a.length-i-1;j++){
				if(a[j]>a[j+1]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println(java.util.Arrays.toString(a));
	}
}