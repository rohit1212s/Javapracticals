// to find topper in the class

package com.k2js.usecases.student;
import java.util.Arrays;

class Student{
	String name;
	int marks[],id,total;
	private Student (String name, int id){
		this.name=name;
		this.id=id;
	}
	
	Student(String name ,int id, int...marks){
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

class Teacher{
	public static void main(String...abc){
		Student s1=new Student("Jitendra",10);
		Student s2=new Student("Rohit",15,new int[]{75,85,78,76}){
			public String toString(){
				return super.toString()+"total= "+super.total+"\n";
			}
		};
		Student s3=new Student("Narayan",16,new int[]{75,85,70,76});
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		s1.total=Teacher.getTotalMarks(s1.marks);
		s2.total=Teacher.getTotalMarks(s2.marks);
		s3.total=Teacher.getTotalMarks(s3.marks);
		//Teacher.announceTopper(s2.total,s3.total);
		//Teacher.announceTopper(s2,s3);
		Teacher.announceTopper(s1,s2,s3);
		
		System.out.println(s1+" "+s1.total);
		System.out.println(s2+" "+s2.total);
		System.out.println(s3+" "+s3.total);
	}
	
	public static int getTotalMarks(int[] a){
		int sum=0;
		for(int t:a)sum+=t;
		return sum;
	}
	
	//public static void announceTopper(int n1,int n2){
	//	System.out.println("Topper = "+((n1>n2)?"Student2":"Student3"));
	//}
	
	//public static void announceTopper(Student a,Student b){
	//	System.out.println(((a.total>b.total)?a:b)+" is topper");
	//}
	
	public static void announceTopper(Student...s1){
		Arrays.sort(s1,(x,y)->y.total-x.total);
		System.out.println("Topper = "+s1[0]);
	}
	
}