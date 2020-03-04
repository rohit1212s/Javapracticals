//program to demo mutable and imutable
package com.k2js.encapsulation.practice;

class MutableImutable{
	public static void muMethod(StringBuffer sb){
		sb.append("Hello");
		sb.reverse();
		System.out.println(sb);
	}
	public static void imuMethod(String s){
		s.concat("Hello");
		System.out.println(s);
	}
		public static void muArray(int[]i){
		i[0]=1000;
		
	}
}

class MutsImutsbTest{
	public static void main(String...abc){
		StringBuffer sb= new StringBuffer();
		MutableImutable.muMethod(sb);
		System.out.println(sb);
		String s= new String();
		MutableImutable.imuMethod(s);
		System.out.println(s);
		int[] a= {5,15};
		MutableImutable.muArray(a);
		System.out.println(a[0]);
	}
}