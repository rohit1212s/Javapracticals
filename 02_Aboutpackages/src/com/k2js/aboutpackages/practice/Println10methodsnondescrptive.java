package com.k2js.aboutpackages.practice;

class Println10methodsnondescrptive{
	Integer i=30;
	public static void tryprintln(){
		java.io.PrintStream ps=System.out;
		ps.println();
		ps.println(10>20);
		ps.println('A');
		ps.println(10);
		ps.println(10l);
		ps.println(20f);
		ps.println(30d);
		ps.println(new char[]{'a','b'});
		ps.println("Rohit");
		ps.println(new Println10methodsnondescrptive().i);
	}
}