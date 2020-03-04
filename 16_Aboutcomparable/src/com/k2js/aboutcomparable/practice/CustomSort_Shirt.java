// write a program for shirt class with color(descending), size(descending) and price(ascending). sort based on size if size is same then sort based on price and if price is same then sort on color
		
package com.k2js.aboutcomparable.practice;
import java.util.Arrays;
import java.lang.Comparable;
import java.util.Comparator;

class Shirt {
	String color;
	int price, size;
	
	Shirt(String color, int size, int price){
		this.color=color;
		this.size=size;
		this.price=price;
	}	
	@Override
	public String toString(){
		String color="color= "+ this.color+"\t";
		String size="size= "+ this.size+"\t";
		String price="price= "+ this.price+"\t";
		return color+size+price+"\n";
	}
	
}

class ShirtCoustomSort implements Comparator<Shirt>{
	public int compare(Shirt s1, Shirt s2){
		if (s2.size-s1.size==0){
			return (s1.price-s2.price==0)?(s2.color.compareTo(s1.color)):s1.price-s2.price;
		}
		else 
			return s2.size-s1.size;
	}
}

class ShirtCoustomSortDefault{
	public static void main(String...abc){
		Shirt[] sh={new Shirt("Red",38,500){
			@Override
			public String toString(){

		return this.color+"\t"+this.size+"\t"+this.price+"\n";
			}
		},new Shirt("Blue",38,500),new Shirt("Black",40,400),new Shirt("yellow",42,300)};
		
		Arrays.sort(sh,new ShirtCoustomSort());
		
		//System.out.println(Arrays.toString(fruits));
		Arrays.stream(sh).forEach(x->System.out.println(x));// if we want to print each element line by line then we have to use Arrays.stream.
	}
}