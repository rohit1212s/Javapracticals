//

package com.k2js.aboutcollection.practice;
import java.util.ArrayList;
import java.util.Arrays;


class Pen implements Comparable<Pen>{
	String brand,color;
	int price;
	
	Pen(String brand, String color, int price){
		this.brand=brand;
		this.color=color;
		this.price=price;
	}
	
	@Override
	public String toString(){
		String b="brand= "+this.brand+"\t";
		String c="color= "+this.color+"\t";
		String p="price= "+this.price+"\t";
		return "Pen= " +b+c+p+"\n";
	}
	
	@Override
	public int  compareTo(Pen p){

		return this.price-p.price;
		
	}
}

class PenTest{
	public static void main(String...abc){
		ArrayList<Pen> al=new ArrayList<>();
		
		Pen p1= new Pen("Reynolds", "Blue",15);
		Pen p2= new Pen("Rotomac", "Black",25);
		Pen p3= new Pen("Renolds", "Red",35);
		
		al.add(p1);
		al.add(p2);
		al.add(p3);
		
		al.add(new Pen("Renolds", "Yellow",45){
			@Override
			public String toString(){
			String b="brand= "+this.brand+"\t";
			String c="color= "+this.color+"\t";
			String p="price= "+this.price+"\t";
		return  b+c+p+"\n";
	}
		});
		
		//System.out.println(al);
		
		//al.stream().sorted((x,y)->x.price-y.price).forEach(x->System.out.println(x));
		//al.sort((x,y)->x.price-y.price);
		
		//java.util.Collections.sort(al);
		java.util.Collections.sort(al,((x,y)->x.price-y.price));

		//al.sort((x,y)->(x.price-y.price==0)? x.color.compareTo(y.color)==0:x.price-y,price);
		System.out.println(al);
		
	}
}