// Bottel class and object difference

package com.k2js.aboutobject.practice;

class Bottle{
	String brand,color,material;
}

class BottleTest{
	public static void main(String...abc){
		Bottle b1= new Bottle();
		b1.brand="Milton";
		b1.color="black";
		b1.material="steel";
		
		Bottle b2= new Bottle();
		b2.brand="Switzerland";
		b2.color="white";
		b2.material="steel";
		
		Bottle b3= new Bottle();
		b3.brand="tupperware";
		b3.color="red";
		b3.material="plastic";
		
		System.out.println("Bottle1 Details= "+ b1.color +" "+ b1.brand +" "+ b1.material);
		System.out.println("Bottle2 Details= "+ b2.color +" "+ b2.brand +" "+ b2.material);
		System.out.println("Bottle3 Details= "+ b3.color +" "+ b3.brand +" "+ b3.material);
	}
}