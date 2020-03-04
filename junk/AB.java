class AB{
	
	public void println(String s){
	System.out.println(s);
	}
}
class Sys{
	
	static AB a=new AB();
	static int i=10;
	
}
class Test{
	
	public static void main(String...abc){
		Sys.a.println("Hello");
		System.out.println(Sys.i);
	}
}