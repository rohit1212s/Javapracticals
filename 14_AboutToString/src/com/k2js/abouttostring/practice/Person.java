//ToString usage with one example

package com.k2js.abouttostring.practice;

class Person{
	String name;
	int age;
	char gender;
	
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	Person(String name, int age, char gender){
		this(name,age);
		this.gender=gender;
	}
	
	@Override
	public String toString(){
		String n= "Name= "+ this.name+"\t";
		String a= "Age= "+ this.age+"\t";
		String g= "Gender= "+ ((gender!=0)?this.gender:"Not Aavailable")+"\t";
		
		return "Person Details= "+n+a+g+"\n";
	}
}

class PersonTest{
	public static void main(String...abc){
		Person p1= new Person("Rohit", 31){
			@Override
			public String toString(){
				return "Person Details= Name= "+super.name+"\t"+ "Age= "+super.age;
			}
		};
		Person p2= new Person("Rahul", 32, 'M');
		Person p3= new Person("Ritu", 26, 'F');
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}
}