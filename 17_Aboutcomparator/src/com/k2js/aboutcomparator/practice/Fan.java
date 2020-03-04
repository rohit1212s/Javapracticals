// Fan program with color,brand price

// this can be used as lambda as well



package com.k2js.aboutcomparator.practice;
import java.util.Arrays;
import java.lang.Comparable;
import java.util.Comparator;

class Fan {
	String color,brand;
	int price;
	
	Fan(String color,String brand,int price){
		this.color=color;
		this.brand=brand;
		this.price=price;
	}

	@Override
	public String toString(){
		String c="color= "+this.color+"\t";
		String b="brand= "+this.brand+"\t";
		String p="price= "+this.price+"\t";
		return "Fan= " +c+b+p+"\n";
	}	
}

class FanTest{
	public static void main(String...abc){
		
		Fan[] allFan={new Fan("Black","Crompton",40),new Fan("Blue","Khaitan",40),new Fan("Orange","Bjaj",40),new Fan("yellow","Khaitan",50)};
		
	
		Arrays.sort(allFan,(f1,f2)->(f2.color.compareTo(f1.color)==0)?(f2.brand.compareTo(f1.brand)==0?f1.price-f2.price:f2.brand.compareTo(f1.brand)):f2.color.compareTo(f1.color));
		
		Arrays.stream(allFan).forEach(x->System.out.println(x));
	
	
	}
}