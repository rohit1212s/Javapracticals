//To find biggest String among 3 String.

package com.k2js.condition.practice;

class IFEx28{
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

class IFEx28Test{
	public static void main(String...abc){
		System.out.println("\n\n\n/***Output***\n");

		 String s = IFEx28.bigString("rohit","raj","rum");
		 System.out.println(s);
		 String s1 = IFEx28.bigString(new StringBuffer("raj"),new StringBuffer("rohit"),new StringBuffer("ram"));
		 System.out.println(s1);
		 String s2 = IFEx28.bigString(new StringBuilder("how"),new StringBuilder("Hello"),new StringBuilder("hi"));
		 System.out.println(s2);
		 String s3 = IFEx28.bigString("Hello",new StringBuffer("how"),new StringBuilder("hi"));
		 System.out.println(s3);
		 System.out.println("\n****End*****/");
	}
	
}


/***Output***

rohit
rohit
rohit

****End*****/
