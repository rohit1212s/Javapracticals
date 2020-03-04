// Shirt program with custom sort in the same clas in main method with static type class

package com.k2js.aboutcomparator.practice;
import java.util.Arrays;
import java.lang.Comparable;
import java.util.Comparator;

class Shirt {
	String color,size;
	int price;
	
	Shirt(String color, String size, int price){
		this.color=color;
		this.size=size;
		this.price=price;
	}

	@Override
	public String toString(){
		String c="color= "+this.color+"\t";
		String s="size= "+this.size+"\t";
		String p="price= "+this.price+"\t";
		
		return "Shirt= " +c+s+p+"\n";
	}	
}

class ShirtTest{
	static class ShirtCustomSort implements Comparator<Shirt>{
	@Override
	public int compare(Shirt s1, Shirt s2){	
		int descSize=s2.size.compareTo(s1.size);
		int ascPrice=s1.price-s2.price;
		int descColor=s2.color.compareTo(s1.color);
		return descSize==0? ascPrice==0? descColor :ascPrice :descSize;
	
	}
}
	
	public static void main(String...abc){
		Shirt[] allShirt={new Shirt("Green","xxl",500),new Shirt("Red","xl",600),new Shirt("Black","M",400),new Shirt("Black","M",700)};
		
		Arrays.sort(allShirt,new ShirtTest.ShirtCustomSort());
		System.out.println(Arrays.toString(allShirt));
		//Arrays.stream(allShirt).forEach(x->System.out.println(x));
	}
}
