// checking where execution starts from 2:it will call one static block no matter how many static block you create in a program

package com.k2js.aboutstatic.practice;

class STBSeq2{
	static int i;
	static{
		System.out.println("I am static block" + i);
		System.out.println(STBSeq2.j);	
	}
	static int j=i=30;
	static{
		System.out.println("I am static block2" + i);
	}
}