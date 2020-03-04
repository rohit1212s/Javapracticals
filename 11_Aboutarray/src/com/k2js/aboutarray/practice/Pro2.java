// to print length of a string and array if input type is Object


package com.k2js.aboutarray.practice;

class Pro2{
	public static void printLen2(Object o){
		
		if(o instanceof String){
			System.out.println(((String)o).length());
		}else{
			System.out.println(((int[])o).length);
		}
		
	}
}

class Pro2Test{
	public static void main(String...abc){
		Pro2.printLen2("Hello");
		Pro2.printLen2(new int[] {1,2,3,4,5});
	}
}