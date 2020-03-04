// using of singlton: static member object can be created only once when class gets loaded and afterwards 
//we can call the same object again and again but cant create another object and for calling that object we need
//to create method for that then only we can access

//2nd way of writing for using stativc object

package com.k2js.encapsulation.practice;

class FaterOfnation2{
	private static FaterOfnation2 fn=new FaterOfnation2();
	private String name;
	private FaterOfnation2(){
		this.name="Mahatma";
	}
	public static FaterOfnation2 getFatherOfNation(){
		return fn;
		
	}
	
	@Override
	public String toString(){
		return "FaterOfnation2 = "+ this.name;
	}
}

class Fn2Test{
	public static void main(String...abc){
	FaterOfnation2 fn1=FaterOfnation2.getFatherOfNation();
	System.out.println(fn1);
	FaterOfnation2 fn2=FaterOfnation2.getFatherOfNation();
	System.out.println(fn2);
	System.out.println(fn1==fn2);
	}
}