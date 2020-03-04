// use of toString() Override method 

package com.k2js.aboutobject.practice;

class Car{
	String brand, color;
	int price;
	@Override
	public String toString(){
		String c="color ="+this.color+ "\t";
		String b="brand ="+this.brand+ "\t";
		String p="price ="+this.price+ "\t";
	return "Car Details= "+ b + c + p +"\n";	
	}
	
	
	
}


class CarTest{
	public static void main(String...abc){
		Car c1= new Car();
		c1.brand="Bmw ";
		c1.color="White ";
		c1.price=2500;
		
		Car c2= new Car();
		c2.brand="Merc ";
		c2.color="Black ";
		c2.price=3500;
		
		Car c3= new Car();
		c3.brand="Audi ";
		c3.color="Red ";
		c3.price=4500;
		
		
		
		//System.out.println("Car1 Details= "+ c1.brand + c1.color + c1.price);
		//System.out.println("Car2 Details= "+ c2.brand + c2.color + c2.price);
		//System.out.println("Car3 Details= "+ c3.brand + c3.color + c3.price);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

	}
}