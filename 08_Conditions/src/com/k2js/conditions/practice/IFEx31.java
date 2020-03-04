//To find the month using math random method and array.

package com.k2js.condition.practice;

class IFEx31{
	public static void methodYear(String month){
		
		if(month=="jan")
			System.out.println("JANUARY");
		else if(month=="feb")
			System.out.println("FEBRUARY");
		else if(month=="mar")
			System.out.println("MARCH");
		else if(month=="april")
			System.out.println("APRIL");
		else if(month=="may")
			System.out.println("MAY");	
		else if(month=="june")
			System.out.println("JUNE");			
		else if(month=="july")
			System.out.println("JULY");			
		else if(month=="aug")
			System.out.println("AUGUST");		
		else if(month=="sept")
			System.out.println("SEPTEMBER");		
		else if(month=="oct")
			System.out.println("OCTOBER");			
		else if(month=="nov")
			System.out.println("NOVEMBER");			
		else if(month=="dec")
			System.out.println("December");
		
	}
}

class IFEx31Test{
	public static void main(String...abc){
		try
		{String[] s={"jan","feb","mar","april","may","june","july","aug","sept","oct","nov","dec"};
		int i=(int)((Math.random()*13)+0);
		IFEx31.methodYear(s[i]);
		}catch(ArrayIndexOutOfBoundsException ae){
			System.out.println("Please enter a valid input");
		}
	}
}
