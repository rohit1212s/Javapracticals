//usage of equals method

package com.k2js.aboutequals_hash4code.practice;

class Book{
	String name;
	Book(String name){
		this.name=name;
	}
	
	public boolean equals(Book b){
		return this.name.equals(b.name);
	}
}

class BookTest{
	public static void main(String...abc){
		Book b1=new Book("java");
		Book b2=new Book("java");
		System.out.println(b1==b2);
		System.out.println(b1.equals(b2));
	}
}