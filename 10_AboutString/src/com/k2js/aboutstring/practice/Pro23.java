// to find the nth highest number of a string

package com.k2js.aboutstring.practice;

class Pro23{
	public static void findNthHighest(String s,int n){
		System.out.println("\n\n\n/***Output***\n");
		//char max=0;
		//for(int i=0;i<n;i++){
		//	max=0;
		//	for(int j=0; j<s.length();j++){
		//		max= max<s.charAt(j)?s.charAt(j):max;
		//	}
		//	if((i+1)<n)
		//		s=s.replace(max+"","");
		//	
		//}
		//System.out.println(max);														
			

//2nd way
		//char max=0;                                                                   
		//for(int i=0;i<s.length();i++){                                                
		//	char c=s.charAt(i);                                                         
		//	max=max<c?c:max;                                                            
		//}                                                                             
		//for(int i=1;i<n;i++){                                                         
		//	char nmax=0;                                                                
		//	for(int j=0;j<s.length();j++){                                              
		//		char cc=s.charAt(j);                                                    
		//		nmax=nmax<cc && cc<max?cc:nmax;                                         
		//	}                                                                           
		//	max=nmax;                                                                   
		//}                                                                             
		//System.out.println(max);  

//3rd way
		//	java.util.TreeSet<Character> ts=new java.util.TreeSet<Character>();
		//	for(int i=0;i<s.length();i++){
		//		ts.add(s.charAt(i));
		//	}
		//	
		//	//System.out.println(ts);
		//	//System.out.println(ts.size());
		//	System.out.println(new java.util.ArrayList<Character>(ts).get(ts.size()-n));
		
//4th way
			char[] c=s.toCharArray();
			java.util.Arrays.sort(c);
			System.out.println(c[c.length-n]);
																					
		System.out.println("\n****End*****/");                                      
	}                                                                               
																					
}


class Pro23Test{
	public static void main(String...abc){
		Pro23.findNthHighest("hello",1);	
		Pro23.findNthHighest("hello",2);	
		Pro23.findNthHighest("hello",3);	
		Pro23.findNthHighest("hello",4);	
	}
}