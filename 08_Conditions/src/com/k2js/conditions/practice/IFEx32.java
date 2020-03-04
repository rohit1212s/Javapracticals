//To find the day using math random method and array.

package com.k2js.condition.practice;

class IFEx32{
	public static void methodWeekday(int weekday){
		String[] s={"mon","tues","wednes","thrus","fri","satur","sun"};
		if(weekday==0)
			System.out.println(s[0]+"day");
		else if(weekday==1)
			System.out.println(s[1]+"day");
		else if(weekday==2)
			System.out.println(s[2]+"day");
		else if(weekday==3)
			System.out.println(s[3]+"day");
		else if(weekday==4)
			System.out.println(s[4]+"day");
		else if(weekday==5)
			System.out.println(s[5]+"day");
		else if(weekday==6)
			System.out.println(s[6]+"day");
	}
}
class IFEx32Test{
	public static void main(String...abc){
		int i=(int)((Math.random()*6)+0);
		IFEx32.methodWeekday(i);
	}
}