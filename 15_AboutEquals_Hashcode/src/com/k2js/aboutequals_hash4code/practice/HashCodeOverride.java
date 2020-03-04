//How to override Hashcode method from object class

package com.k2js.aboutequals_hash4code.practice;

class Sport{
	String sportname,famousperson;
	
	public Sport(String sportname){
		this.sportname=sportname;
		
	}
	
	@Override
	public boolean equals(Object o){
		return ((Sport)o).sportname.equals(this.sportname);
	}
	
	@Override
	public int hashCode(){
		return this.sportname.hashCode();
	}
}

class SportTest{
	public static void main(String...abc){
		Sport sp1= new Sport("Cricket");
		Sport sp2= new Sport("Cricket");
		
		System.out.println(sp1.hashCode());
		System.out.println(sp2.hashCode());
	}
}