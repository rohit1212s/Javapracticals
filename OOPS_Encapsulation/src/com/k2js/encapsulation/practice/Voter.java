//Encapsulation using get and set method to acces private member of one class to another class.
// hiding data for other class but by using get set method we can allow other class to see the data but not allow to change anything

package com.k2js.encapsulation.practice;

class Voter{
	private String name,city;
	private int age;
	
	public int getAge(){
		return this.age;
	}
	
	public String getName(){
		return this.name;
	}
	public String getCity(){
		return this.city;
	}
	
	Voter(String name, int age){
		this.name=name;
		this.age=age;
	}
	Voter(String name, int age, String city){
		this(name,age);
		this.city=city;
	}	
	public void setAge(int age){
		this.age=(this.age<age)?age:this.age;
	
	}
	@Override
	public String toString(){
		String n="name= "+this.name + "\t";
		String a="age= "+this.age + "\t";
		String c="age= "+((this.city==null)?"NA":this.city);
		return "voter details= "+n +a +c;
	}
	
	public static Voter getVoter(String name, int age){
		return (age>=18)? new Voter(name, age):null;
	}
	
	public static Voter getVoter(String name, int age, String city ){
		return (age>=18)? new Voter(name, age, city):null;
	}
}

class VoterTest{
	public static void main(String...abc){
		Voter v1= Voter.getVoter("Raj",15);
		System.out.println(v1);
		Voter v2=Voter.getVoter("Rohit",25,"Mumbai");
		System.out.println(v2);
		System.out.println(v2.getAge());
		v2.setAge(15);
		System.out.println(v2);
		v2.setAge(30);
		System.out.println(v2);
	}
}