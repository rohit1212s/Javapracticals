package com.k2js.aboutpackages.practice;

class Add{
	static int i=10;
	int j=20;
	public static void add(){
		System.out.println(Add.i + new Add().j);
	}
}