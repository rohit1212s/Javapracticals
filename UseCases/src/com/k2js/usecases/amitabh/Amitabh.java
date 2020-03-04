// 

package com.k2js.usecases.amitabh;


class Amitabh{
	double height=6.4;
	
	void awards(){
		System.out.println("5 awards");
	}
	
	void hitMovie(){
		System.out.println("Don");
	}
	
	void tvShow(){
		System.out.println("sony-KBC");
	}
	
	void tvAd(){
		System.out.println("Dabur- honey");
	}
	
	void marriageOpnion(){
		System.out.println("Arrange");
	}
}

class Abhishek extends Amitabh{
	
	double height=6.2;
	void sportsTeam(){
		System.out.println("Kabddi- JaipurPinkPanther");
	}
	@Override
	void marriageOpnion(){
		super.marriageOpnion();
		System.out.println("Also agreed for love marriage");
	}
	
}

class HerioneFather{
	public static void main(String...abc){
		
		System.out.println("********SAME TYPE*******************");
		Abhishek abhi= new Abhishek();
		System.out.println(abhi.height);
		abhi.awards();
		abhi.tvShow();
		abhi.tvAd();
		abhi.marriageOpnion();
		abhi.sportsTeam();
		
	System.out.println("********UPCASTING*******************");
	
		Amitabh ami=new Abhishek();
		System.out.println(ami.height);
		ami.awards();
		ami.hitMovie();
		ami.tvShow();
		ami.tvAd();
		ami.marriageOpnion();
		//ami.sportsTeam();
		
	System.out.println("********DOWNCASTING*******************");
		
		Abhishek abhi2= (Abhishek)ami;
		abhi2.marriageOpnion();
		abhi2.sportsTeam();
		
	}	
}