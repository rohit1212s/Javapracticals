// how to create relationship with comparable with any class and  sort using comparable

package com.k2js.aboutcomparable.practice;
import java.util.Arrays;
import java.lang.Comparable;

class Cloth implements java.lang.Comparable<Cloth>{
	String color;
	int length,width;
	
	Cloth(String color, int l, int w){
		this.color=color;
		this.length=l;
		this.width=w;
	}
	
	@Override
	public String toString(){
		String color="Color= "+ this.color+"\t";
		String length="length= "+ this.length+"\t";
		String width="width= "+ this.width+"\t";
		return color+length+width+"\n";
	}
	@Override
	public int  compareTo(Cloth c){
		//if(this.length<c.length)return -1;					// 1st way
		//else if(this.length>c.length)return 1;
		//else return 0;
		
		//return ((Integer)this.length).compareTo(c.length);	//2nd way
		
		//return this.length-c.length;							//3rd way(we can use this way only if we are comparing two int. In case of String it will not work)
		
		return (this.length-c.length==0)? this.width-c.width:this.length-c.length;
		
	}
	
}

class ClothDefaultSet{
	public static void main(String...abc){
		Cloth[] allcloths={new Cloth("Green",10,5),new Cloth("Red",2,6),new Cloth("Blue",4,7),new Cloth("Black",2,7)};
		Arrays.sort(allcloths);
		
		System.out.println(Arrays.toString(allcloths));
	}
}