class SMethodsRev{
	
	public static void add(){
		System.out.println("Hi- I am method add");
		}
	public static int add(int x, int y){
		return x+y;
		}
	public static void add(String name){
		System.out.println(name);
		}
	public static String printName(String fn, String ln){
		return fn +ln;
		}
}

class SMethodsRevTest{
	
	public static void main(String...abc){
	SMethodsRev.add();
	int a=SMethodsRev.add(10,15);
		System.out.println(a*2);
	SMethodsRev.add("Hello");
	String name=SMethodsRev.printName("Rohit ","Kumar");
		System.out.println(name);
	
	}
}