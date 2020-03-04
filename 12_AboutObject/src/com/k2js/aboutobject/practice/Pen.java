// use of toString() Override method and Object

package com.k2js.aboutobject.practice;

class Pen{
	String brand,color;
	int price;
	
	@Override
	public String toString(){
		String b="brand ="+this.brand+ "\t";
		String c="color ="+this.color+ "\t";
		String p="price ="+this.price+ "\t";
	return "Pen Details= "+ b + c + p +"\n";
	}
}

class PenTest{
	public static void main(String...abc){
	Pen p1= new Pen();
	p1.brand="Renolds";
	p1.color="White";
	p1.price=25;
	
	Pen p2= new Pen();
	p2.brand="Rotomac";
	p2.color="Blue";
	p2.price=15;
	
	Pen p3= new Pen();
	p3.brand="Luxor";
	p3.color="White";
	p3.price=50;
	
	Pen p4= new Pen();
	p4.brand="Cello";
	p4.color="Green";
	p4.price=20;
	
	Pen p5= new Pen();
	p5.brand="Add Gel";
	p5.color="Sky blue";
	p5.price=27;
	
	System.out.println(p1);
	System.out.println(p2);
	System.out.println(p3);
	System.out.println(p4);
	System.out.println(p5);
	
	}

}