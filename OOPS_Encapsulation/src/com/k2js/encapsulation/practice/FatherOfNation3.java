// using of singlton: static member object can be created only once when class gets loaded and afterwards 
//we can call the same object again and again but cant create another object and for calling that object we need
//to create method for that then only we can access

//3rd way of writing for using stativc object

package com.k2js.encapsulation.practice;

class FatherOfNation3{
	private static FatherOfNation3 fn=null;
	private String name;
	private FatherOfNation3(){
		this.name="Mahatma";
	}
	public static FatherOfNation3 getFatherofnation(){
		if(fn==null);
		fn= new FatherOfNation3();
		return fn;
	}
	
	@Override
	public String toString(){
		return "FatherOfNation3 = "+this.name;
	}
}
class Fn3Test{
	public static void main(String...abc){
	FaterOfnation3 fn1=FaterOfnation3.getFatherOfNation();
	System.out.println(fn1);
	FaterOfnation3 fn2=FaterOfnation3.getFatherOfNation();
	System.out.println(fn2);
	System.out.println(fn1==fn2);
	}
}