//  take input as Object and store array in the object and do addition


package com.k2js.aboutarray.practice;

class Pro9{
	public static void method6(){
		
		
		Object[] o={10,20,"Hello",new int[]{30,40}};
		int sum=0;
		for(Object t:o){
			if(t instanceof Number){
				sum+=((Number)t).intValue();
			}
			else if(t instanceof int[])
				for(int a:(int[])t){
					sum+=a;
					}
			
		}	
		System.out.println("Sum of all char= "+sum);
	}
	
}

class Pro9Test{
	public static void main(String...abc){
		Pro9.method6();
		
	}
}