package com.k2js.aboutlocalvariable.practice;

class K{
	public static void main(String...abc){
		int i=10;
		{
			System.out.println(i);
			int i=20;
			System.out.println(i);
		}
		System.out.println(i);
		
	}
}