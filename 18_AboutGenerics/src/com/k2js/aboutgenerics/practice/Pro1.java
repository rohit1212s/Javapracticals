
// write a prog


package com.k2js.aboutgenerics.practice;

class Soap{
	
	String color,brand;
	Object price;
	
	Soap(String color,String brand,Object price){
		this.color=color;
		this.brand=brand;
		this.price=price;
	}

	@Override
	public String toString(){
		String c="color= "+this.color+"\t";
		String b="brand= "+this.brand+"\t";
		String p="price= "+this.price+"\t";
		return "Soap= " +c+b+p+"\n";
	}	
	
	
}

class Pro1Test{
	public static void main(String...abc){
		Soap s1=new Soap("Black","Lux",40);
		Soap s2=new Soap("Black","Lux","40");
		Soap s3=new Soap("Black","Lux",40d);
		
		int j=(Integer)s1.price;
		int i= Integer.valueOf((String)s2.price);
		Double l=(Double)(s3.price);
		
		System.out.println(i+l+j);
	}
}

