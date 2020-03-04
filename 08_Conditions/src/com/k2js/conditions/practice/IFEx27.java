//To find greater number among 3 numbers using Integer.compare()

package com.k2js.condition.practice;

class IFEx26{
	public static void greaterNumber(int a,int b,int c){
			
			if(((Comparable<Integer>)a).compareTo(b)>0)
				System.out.println(a+" is the biggest");
			else if(((Comparable<Integer>)a).compareTo(b)<0)
				System.out.println(b+" is the biggest");
			else if(((Integer)b).compareTo(c)>0)
				System.out.println(a+" is the biggest");
			else if(((Integer)b).compareTo(c)<0)
				System.out.println(b+" is the biggest");
			else 
				System.out.println(c+" is the biggest");
	}
}

class IFEx26Test{
	public static void main(String...abc){
		System.out.println("\n\n\n/***Output***\n");
		int a=(int)((Math.random()*25)+10);
			System.out.println("the generated number is-->" +a);
		int b=(int)((Math.random()*25)+10);
			System.out.println("the generated number is-->" +b);
		int c=(int)((Math.random()*25)+10);
			System.out.println("the generated number is-->" +c);
		IFEx26.greaterNumber(a,b,c);
		System.out.println("\n****End*****/");
	}
}