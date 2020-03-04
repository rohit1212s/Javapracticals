// Paper program with custom sort in the same class and custom sort class in main method under the main method with help of annonymous class

package com.k2js.aboutcomparator.practice;
import java.util.Arrays;
import java.lang.Comparable;
import java.util.Comparator;

class Paper {
	String color;
	int length,width;
	
	Paper(String color, int length, int width){
		this.color=color;
		this.length=length;
		this.width=width;
	}

	@Override
	public String toString(){
		String c="color= "+this.color+"\t";
		String l="length= "+this.length+"\t";
		String w="width= "+this.width+"\t";
		
		return "Paper= " +c+l+w+"\n";
	}	
}

class PaperTest{
	public static void main(String...abc){
	
		Paper[] allPaper={new Paper("Black",40,50),new Paper("Blue",40,50),new Paper("Orange",40,50),new Paper("yellow",40,50),new Paper("Brown",40,50)};
		
		Comparator<Paper> c= new Comparator<Paper>(){
	@Override
	final public int compare(Paper p1, Paper p2){	
		return p2.color.compareTo(p1.color);
		}
	};
		Arrays.sort(allPaper, c);
		System.out.println(Arrays.toString(allPaper));
	
	}
}