//To find biggest String among 3 String . use variable in main method during run time..

package com.k2js.condition.practice;

class IFEx29{
	public static String bigString(CharSequence cs1,CharSequence cs2, CharSequence cs3 ){
		String s1= cs1.toString();
		String s2= cs2.toString();
		String s3= cs3.toString();
		if((s1).compareTo(s2)>0)
			if((s1).compareTo(s3)>0)
			return s1;
			else
			return s3;
		else if((s2).compareTo(s3)>0)
			return s2;
		else 
			return s3;	
	}
}

class IFEx29Test{
	public static void main(String...abc){
		System.out.println("\n\n\n/***Output***\n");
		try{
			String s1=abc[0];
			String s2=abc[1];
			String s3=abc[2];

			//String s = IFEx29.bigString(new StringBuffer("raj"),new StringBuffer("rohit"),new StringBuffer("ram"));
			String s = IFEx29.bigString(s1,s2,s3);
			System.out.println(s);
		}catch(ArrayIndexOutOfBoundsException a){
			System.out.println("Please pass 3 values");
		}
			System.out.println("\n****End*****/");
	}
	
}