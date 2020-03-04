// to reinitialize final value

package com.k2js.aboutlocalvariable.practice;

class F{
	public static void main(String...abc){
		final int i=10;
		System.out.println(i);
		i++;
		System.out.println(i++);
	}
}