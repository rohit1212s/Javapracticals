//Constructor usage with one example

package com.k2js.aboutconstructors.practice;

class Mobile{
	String brand,color,ram;
	int price;
	Mobile(String brand,String color){
		this.brand=brand;
		this.color=color;
	
	}
	Mobile(String brand,String color,String ram,int price){
		this(brand,color);
		this.ram=ram;
		this.price=price;
	
	}
	
	@Override
	public String toString(){
		String b= "Brand= "+ this.brand+"\t";
		String c= "Color= "+ this.color+"\t";
		String r= "Ram= "+ ((ram!=null)?this.ram:"Not Aavailable")+"\t";
		String p= "Price= "+ ((price!=0)?this.price:"Not Aavailable");
		return "Mobile Details= "+c+b+r+p+"\n";
	}
	
}

class MobileTest{
	public static void main(String...abc){
		Mobile m1= new Mobile("Apple", "White");
		Mobile m2= new Mobile("Samsung", "Black");
		Mobile m3= new Mobile("Sony", "Blue", "120gb", 50000);

		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);

	}
}
