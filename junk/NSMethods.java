class NSMethods{
	
	public void m1(){
		System.out.println("Hello- I am object m1()");
	}
	public void m2(String name){
		System.out.println("Hello " +name);
	}
	public String toString(){
		return "Hi- your first object";
	}
	public int add(int a, int b){
		return a+b;
	}
}

class NSMethodsTest{
	
	public static void main(String...abc){
		NSMethods ns=new NSMethods();
		ns.m1();
		ns.m2("Rohit");
		String s1=ns.toString();
		System.out.println(s1);
		
		int s2=ns.add(4,5);
		System.out.println(s2);
		
	}
}