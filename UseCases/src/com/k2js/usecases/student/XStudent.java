// to find topper in the class

package com.k2js.usecases.student;
import java.util.Arrays;

class XStudent{
	String name;
	int marks[],id,total;
	private XStudent (String name, int id){
		this.name=name;
		this.id=id;
	}
	
		XStudent(String name ,int id, int...marks){
		this(name,id);
		this.marks=marks;
	}
	
		@Override
		public String toString(){
		String n="name= "+this.name+"\t";
		String i="id= "+this.id+"\t";
		String m="marks= "+((this.marks!=null)?Arrays.toString(this.marks):"not attended");
		return "Student Details= "+n+i+m+"\n";
		
	}
}

class XStudentProgressCard extends XStudent{
	XStudentProgressCard(String name,int id,int...marks){
		
	}
}

class XBoard{
	public static void main(String...abc){
	
		//Teacher.announceTopper(s2.total,s3.total);
		//Teacher.announceTopper(s2,s3);
		//Teacher.announceTopper(s1,s2,s3);
		
	}
	
}