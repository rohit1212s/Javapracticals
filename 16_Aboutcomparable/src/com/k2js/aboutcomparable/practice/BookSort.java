// sort book number of pages based on name if name is same then based on number of pages and if number of pages are same then based on price

package com.k2js.aboutcomparable.practice;
import java.util.Arrays;
import java.lang.Comparable;

class Book implements Comparable<Book>{
	String name;
	int page, price;
	
	Book(String name, int page, int price ){
		this.name=name;
		this.page=page;
		this.price=price;
	}
	@Override
	public String toString(){
		String name="name= "+ this.name+"\t";
		String page="page= "+ this.page+"\t";
		String price="price= "+ this.price+"\t";
		return name+page+price+"\n";
	}
	@Override
	public int compareTo(Book b){
		
		if(this.name.compareTo(b.name)==0){
			return (this.page-b.page==0)?(this.price-b.price):this.page-b.page;
		}else
			return this.name.compareTo(b.name);
		
	}
	
}

class BookDefaultSet{
	public static void main(String...abc){
		Book[] allbks={new Book("java",105,500),new Book("python",155,600),new Book("dotnet",45,400),new Book("java",105,300)};
		Arrays.sort(allbks);
		
		System.out.println(Arrays.toString(allbks));
	}
}