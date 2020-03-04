//



package com.k2js.aboutgenerics.practice;

class SoapGenrics<T>{
	String color,brand;
	T price;
	
	SoapGenrics(String color, String brand, T price){
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

class SoapGenricsTest{
	public static void main(String...abc){
		SoapGenrics<Integer> s1=new SoapGenrics<>("Black","Lux",40);
		SoapGenrics<String> s2=new SoapGenrics<>("Black","Lux","40");
		SoapGenrics<Double> s3=new SoapGenrics<>("Black","Lux",40d);
		
		double d= s1.price+ s3.price+ Double.valueOf(s2.price);
		System.out.println(d);
	}
}