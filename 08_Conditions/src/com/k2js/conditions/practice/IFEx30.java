//To find biggest String among 3 String.

package com.k2js.condition.practice;

class IFEx30{
	public static void mChar(char c){
		if (c>='A' && c<='Z'){
			System.out.println(c+ " is a capital char");
		}
		else if (c>='a' && c<='z'){
			System.out.println(c+ " is a small char");
		}
		else if (c>='0' && c<='9'){
			System.out.println(c +" is a Number");
		}
		else
			System.out.println(c+" is Special characters");
	}
}

class IFEx30Test{
	public static void main(String...abc){
		
		char a=(char)((Math.random()*150)+1);
		IFEx30.mChar(a);
		IFEx30.mChar('G');
		IFEx30.mChar('d');
		IFEx30.mChar('8');
		IFEx30.mChar('#');
	}
}