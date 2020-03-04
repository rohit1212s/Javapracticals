// claas and object difference

package com.k2js.aboutobject.practice;

class  Marker{
	 String color,brand;
	 int price;
}

class MarkerTest{
	public static void main(String...abc){
		Marker m1= new Marker();
		m1.color="Blue";
		m1.brand="camalin";
		m1.price=15;
		
		Marker m2= new Marker();
		m2.color="Black";
		m2.brand="Luxor";
		m2.price=20;
		
		Marker m3= new Marker();
		m3.color="Green";
		m3.brand="sigma";
		m3.price=30;
		
		Marker m4= new Marker();
		m4.color="Red";
		m4.brand="Sigma";
		m4.price=30;
		
		System.out.println("Marker1 Details= "+ m1.color + m1.brand + m1.price);
		System.out.println("Marker2 Details= "+ m2.color + m2.brand + m2.price);
		System.out.println("Marker3 Details= "+ m3.color + m3.brand + m3.price);
		System.out.println("Marker4 Details= "+ m4.color + m4.brand + m4.price);
	
		
	}
	
}