//to return Hashcode then fullyqualified name of class--- hashcode+#+fullyqualifiedclass name

package com.k2js.abouttostring.practice;

class A{
	int i;
	@Override
	public String toString(){
		String h=Integer.toHexString(super.hashCode());
		String fqn=super.getClass().getName();
		return h+"#"+fqn;
	}
}

class ATest{
	public static void main(String...abc){
		A a1=new A();
		A a2=new A(){
			@Override
			public String toString(){
				return Integer.toHexString(super.hashCode());
			}
		};
		
		System.out.println(a1);
		System.out.println(a2);
		Object o=new A();
		System.out.println(o);
		
		
		
	}
}