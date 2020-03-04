//What is the use of constructor-- to force user to proivde mandatory value during object creation itself and for code optimization

package com.k2js.aboutconstructors.practice;

class Bag{
	String color, brand;
	int price;
	
	Bag(String color, String brand){
		this.color= color;
		this.brand= brand;
	}
	
	Bag(String color, String brand, int price){
		this.color= color;
		this.brand= brand;
		this.price= price;
	}
	
	@Override
	public String toString(){
		String c= "Color= "+ this.color+"\t";
		String b= "Brand= "+ this.brand+"\t";
		String p= "price= "+ ((price!=0)?this.price:"Not Aavailable");
		return "Bag Details= "+c+b+p+"\n";
	}
}

class BagTest{
	public static void main(String...abc){
		Bag b1= new Bag("Red", "Camel");
		Bag b2= new Bag("Green", "VIP");
		Bag b3= new Bag("Blue", "American Tourister", 5000);
		Bag b4= new Bag("Black", "Amazing");
		Bag b5= new Bag("White", "flipcart", 8000);
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
	}
}