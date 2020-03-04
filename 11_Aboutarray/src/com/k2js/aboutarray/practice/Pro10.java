//  take input as Objectand store array in the object and do addition


package com.k2js.aboutarray.practice;

class Pro10{
	public static void method7(){
		
		
		Object[] o=new Object[]{10,20,'A',"Hello",new Number[]{30,40}};
		int sum=0;
		for(Object t:o){
			if(t instanceof Number){
				sum+=((Number)t).intValue();
			}
				else if(t instanceof Number[]){
					for(Number a:(Number[])t){
						sum+=a.intValue();
					}
				}
				else if(t instanceof String){
					char []c=((String)t).toCharArray();
					for(char c1:c){
						sum+=c1;
					}
				}else if(t instanceof Character){
					sum+=(Character)t;
				}
					
			
			
		}	
		System.out.println("Sum of all char= "+sum);
	}
	
}

class Pro10Test{
	public static void main(String...abc){
		Pro10.method7();
		
	}
}