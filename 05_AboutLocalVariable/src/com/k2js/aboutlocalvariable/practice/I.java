
package com.k2js.aboutlocalvariable.practice;

class I{
	public static void add(int i, int j){

		System.out.println(i/0);
	}
	public static void main(String...abc){
		I.add(5,10);
	}
}