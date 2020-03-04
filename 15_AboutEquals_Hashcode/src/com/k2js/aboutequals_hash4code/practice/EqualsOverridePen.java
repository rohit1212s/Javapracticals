//How to override equals method from object class

package com.k2js.aboutequals_hash4code.practice;

class Pen{
	String color,brand;
	int price;
	public Pen(String color, String brand){
		this.color=color;
		this.brand=brand;
		
	}
	
	public Pen(String color, String brand, int price){
		this(color,brand);
		this.price=price;
		
	}
	
	public boolean equals(Pen p){
		System.out.println("2nd Overload");
		boolean c=this.color.equals(p.color);
		boolean b=this.brand.equals(p.brand);
		boolean pr=((price!=0)?this.price==p.price:true);
		return c&&b&&pr;
		
	}
	
	@Override
	public String toString(){
		String c="Color= "+this.color+"\t";
		String b="Brand= "+this.brand+"\t";
		String p= "Price= "+ ((price!=0)?this.price:"Not Aavailable");
		return "Pen Details= "+c+b+p+"\n";
	}
	
	@Override
	public boolean equals(Object o){
		System.out.println("3rd Overriden");
		if((o==null)&& !(o instanceof Pen))
			return false;
	Pen p1 = (Pen)o;
		boolean c=this.color.equals(p1.color);
		boolean b=this.brand.equals(p1.brand);
		boolean p=((price!=0)?this.price==p1.price:true);
		return c&&b&&p;
	}
}

class PenTest{
	public static void main(String...abc){
		Pen p2= new Pen("black","parker");
		Pen p3= new Pen("black","parker");
		Pen p4= new Pen("black","parker",20);
		Object p5= new Pen("black","parker",20){
			@Override
			public boolean equals(Pen p){
				System.out.println("4th Overriden");
				return this.brand.equals(p.brand);
			}
			@Override
			public boolean equals(Object o1){
				System.out.println("5th Overriden");
				return this.color.equals(((Pen)o1).color);
			}
		};
		
		System.out.println(p2.equals(p3));
		System.out.println(p5.equals(p4));
		System.out.println(p4.equals(p5));
		System.out.println(((Pen)p5).equals(p4));
		
		//System.out.println(p2);
		//System.out.println(p3);
		//System.out.println(p4);
		//System.out.println(p5);
	}
}