// how to do default sort using comparable

package com.k2js.aboutcomparable.practice;
import java.util.Arrays;

class DefaultSort{
	public static void main(String...abc){
		String[] s= {"hello","world","java","selenium"};
		Arrays.sort(s);
		
		
		
		Integer[] a={10,5,6,15,12};
		Arrays.sort(a);
		
		StringBuffer[] sb= {new StringBuffer("java"),new StringBuffer("hello"),new StringBuffer("python"),new StringBuffer("selenium"),new StringBuffer("world")};
		Arrays.sort(sb);
		
		System.out.println(Arrays.toString(s));
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(sb));
	}
}