// to find if any element in array length is less than or equal to 4 then store in another array 

package com.k2js.aboutarray.practice;

class Pro12{
	public static String[] add(){
		String[] s= {"Hello","keys","java", "selenium"};
		
		// 1. find how many elements are there in a String array
		int c=0;
		for(String t:s){
			c=(t.length()<=4)?++c:c;
		}
		//2. create array with size
		String[]r=new String[c];
		
		//3. create index of each array
		int index=0;
		
		//4. String array value in a new array
		
		for(String t:s){
			if(t.length()<=4){
				r[index++]=t;
			}
		}
		return r;
	}
}

class Pro12Test{
	public static void main(String...abc){
		String[] s1=Pro12.add();
		System.out.println(java.util.Arrays.toString(s1));
		
	}
}


