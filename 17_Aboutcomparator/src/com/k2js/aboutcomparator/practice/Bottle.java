// Bottle program with custom sort in the same class and custom sort class in main method under the main method .

package com.k2js.aboutcomparator.practice;
import java.util.Arrays;
import java.lang.Comparable;
import java.util.Comparator;

class Bottle {
	String brand,color;
	int price;
	
	Bottle(String brand, String color, int price){
		this.brand=brand;
		this.color=color;
		this.price=price;
	}

	@Override
	public String toString(){
		String b="brand= "+this.brand+"\t";
		String c="color= "+this.color+"\t";
		String p="price= "+this.price+"\t";
		
		return "Bottle= " +b+c+p+"\n";
	}	
}


class BottleTest{
	public static void main(String...abc){
	
		Bottle[] allBottle={new Bottle("Milton","Silver",500),new Bottle("Tupperware","Blue",600),new Bottle("Addidas","Black",400),new Bottle("Nike","Yellow",400)};
		
		class BottleCustomSort implements Comparator<Bottle>{
	@Override
	public int compare(Bottle s1, Bottle s2){	
		int descbrand=s2.brand.compareTo(s1.brand);
		int ascPrice=s1.price-s2.price;
		int descColor=s2.color.compareTo(s1.color);
		return descbrand==0? ascPrice==0? descColor :ascPrice :descbrand;
		}
	
	}
		Arrays.sort(allBottle,new BottleCustomSort());
		System.out.println(Arrays.toString(allBottle));
	
	}
}