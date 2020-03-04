// using of singlton: static member object can be created only once when class gets loaded and afterwards 
//we can call the same object again and again but cant create another object and for calling that object we need
//to create method for that then only we can access

package com.k2js.encapsulation.practice;

class FatherOfNation{
	private static FatherOfNation fn=null;
	private String name;
	static{
		fn=new FatherOfNation();
		fn.name="Mahatma";
	}
	private FatherOfNation(){
		
	}
	
	public static FatherOfNation getFatherOfNation(){
		return fn;
	}
	
	@Override
	public String toString(){
		return "FatherOfNation = "+this.name;
	}
}

class FnTest{
	public static void main(String...abc){
		FatherOfNation fn1=FatherOfNation.getFatherOfNation();
		System.out.println(fn1);
		FatherOfNation fn2=FatherOfNation.getFatherOfNation();
		System.out.println(fn2);
		System.out.println(fn1==fn2);
	}
}