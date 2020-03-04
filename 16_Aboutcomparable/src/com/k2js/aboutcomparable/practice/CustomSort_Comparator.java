// How to create ur custom sort if you dont want to use Comparable sorting method

package com.k2js.aboutcomparable.practice;
import java.util.Arrays;
import java.lang.Comparable;
import java.util.Comparator;

class CustomSort implements Comparator<String>{
	@Override
	public int compare(String s1, String s2){
		return s2.compareTo(s1);
	}
}

class CustomSortDefault{
	public static void main(String...abc){
		String[] fruits={"Mango","Orange","Banana","Chikoo","Gauva"};
		
		Arrays.sort(fruits,new CustomSort());
		
		//System.out.println(Arrays.toString(fruits));
		Arrays.stream(fruits).forEach(x->System.out.println(x));// if we want to print each element line by line then we have to use Arrays.stream.
	}
}