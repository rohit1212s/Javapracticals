// create a program with length(nonmandatory),height width color(mandatory) and type(which kind of table ex school ) can be non mandatory. sort based on height(asc) if the height is same 
// sort based on colort(desc) if the color is also same the sort based on width(asc)

package com.k2js.aboutcomparator.practice;
import java.util.Arrays;
import java.lang.Comparable;
import java.util.Comparator;

class Table implements Comparable<Table> {
	String color,type;
	int length,height,width;
	
	Table(String color, int height, int width){
		this.color=color;
		this.height=height;
		this.width=width;
	}
	
	Table(String color, int height, int width, int length, String type){
		this(color, height, width);
		this.length=length;
		this.type=type;
	}
	
	@Override
	public String toString(){
		String c="color= "+this.color+"\t";
		String h="height= "+this.height+"\t";
		String w="width= "+this.width+"\t";
		String l=((this.length!=0)?this.length:"Not available")+"\t";
		String t=((this.type!=null)?this.type:"Not available")+"\t";
		return "Table= " +c+h+w+l+t+ "\n";
	}
	
	@Override
	public int  compareTo(Table c){
		return this.color.compareTo(c.color);
	}
	
	
}

class TableCustomSort implements Comparator<Table>{
	@Override
	public int compare(Table t1, Table t2){
		if(t1.height-t2.height==0){
			return (t2.color.compareTo(t1.color)==0)?t1.width-t2.width:t2.color.compareTo(t1.color);
		}
		else
		return t1.height-t2.height;
	
	}
}

class TableTest{
	public static void main(String...abc){
		Table[] alltable={new Table("Green",10,5),new Table("Red",2,6),new Table("Blue",4,7,40,"Dining table"),new Table("Black",2,7,30,"Study table")};
		Arrays.sort(alltable);
		
		System.out.println(Arrays.toString(alltable));
		System.out.println("\n");
		Arrays.sort(alltable,new TableCustomSort());
		Arrays.stream(alltable).forEach(x->System.out.println(x));
	}
}



