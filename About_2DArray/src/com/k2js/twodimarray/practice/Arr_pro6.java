// to add 2 object  array by using advanced for loop

package com.k2js.twodimarray.practice;

class Arr_Pro6{
	public static void main(String...abc){
		System.out.println("\n\n\n/***Output***\n");
		
		Object[] o={new Number[]{10,20},new int[]{5,6,7}};
		int sum=0;
		for(Object t: o){
			if(t instanceof Number[])
				for(Number n:(Number[])t){
					sum+=n.intValue();
				}
			else if(t instanceof int[]){
				for(int i:(int[])t){
					sum+=i;
				}
			}
		}
		System.out.println(sum);
		System.out.println("\n****End*****/");
	}
		
}
	


/***Output***

48

****End*****/
