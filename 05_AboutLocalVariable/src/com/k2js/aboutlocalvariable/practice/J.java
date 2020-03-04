package com.k2js.aboutlocalvariable.practice;

class J{
	public static void main(String...abc){
		int i=10;
		{
			System.out.println(i);
			i=20;
		}
		System.out.println(i);
		
	}
}