// to add 2 object  array by using advanced for loop in differnet way

package com.k2js.twodimarray.practice;

class Arr_Sum{
	public static void main(String...abc){
		class A{
			int i=100;
		}
		Object[]o={new int[]{5,6}, new int[][]{{4,5},{3}},"Hello",new A()};
		int sum=0;
		for(Object t:o){
			if(t instanceof Number) sum+=((Number)t).intValue();
			else if(t instanceof int[]) for(int temp:(int[])t) sum+=temp;
			else if(t instanceof int[][]) for(int temp[]:(int[][])t) for(int t2:temp) sum+=t2;
			else if(t instanceof A) sum+=((A)t).i;
		}
		System.out.println(sum);
	}
}
