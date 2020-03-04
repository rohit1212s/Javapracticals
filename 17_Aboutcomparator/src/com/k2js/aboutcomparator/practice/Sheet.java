// Sheet program with custom sort in the same class and custom sort class in main method under the main method with help of annonymous class and create
// create logic during sorting itself

// this can be used as lambda as well

package com.k2js.aboutcomparator.practice;
import java.util.Arrays;
import java.lang.Comparable;
import java.util.Comparator;

class Sheet {
	String color;
	int price;
	
	Sheet(String color, int price){
		this.color=color;
		this.price=price;
	}

	@Override
	public String toString(){
		String c="color= "+this.color+"\t";
		String p="price= "+this.price+"\t";
		return "Sheet= " +c+p+"\n";
	}	
}

class SheetTest{
	public static void main(String...abc){
	
		Sheet[] allSheet={new Sheet("Black",40),new Sheet("Blue",40),new Sheet("Orange",40),new Sheet("yellow",50),new Sheet("Brown",50)};
		
	
		Arrays.sort(allSheet, new Comparator<Sheet>(){
		@Override
		public int compare(Sheet s1, Sheet s2){	
		return s2.color.compareTo(s1.color);
			}
		});
	
		//System.out.println(Arrays.toString(allSheet));
		Arrays.stream(allSheet).forEach(x->System.out.println(x));
	
	}
}
