// To reinitialize local variable value

package com.k2js.aboutlocalvariable.practice;

class D{
	public static void main(String...abc){
	final StringBuffer sb=new StringBuffer("Hello");
	System.out.println(sb);
	sb.reverse();
	System.out.println(sb);
	sb.append("world");
	System.out.println(sb);
	final String s=new String("Hello");
	System.out.println(s);
	s.concat("world");
	System.out.println(s);
	}
}