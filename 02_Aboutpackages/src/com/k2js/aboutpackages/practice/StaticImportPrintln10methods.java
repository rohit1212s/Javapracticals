package com.k2js.aboutpackages.practice;

import static java.lang.System.out;

class StaticImportPrintln10methods{
	Integer i=50;
	public static void tryprint(){
		out.println();
		out.println(10>20);
		out.println('A');
		out.println(10);
		out.println(20l);
		out.println(30f);
		out.println(40d);
		out.println(new char[]{'a','b'});
		out.println("Rohit");
		out.println(new StaticImportPrintln10methods().i);
	}
}
