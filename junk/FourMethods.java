class MethodProgram1{
	
	public static void method1(){
		System.out.println("Hello- I am method1");
	}
	
	public static void method2(int i){
		System.out.println("Hi- I am method2" +i);
	}
	
	public static int method3(){
		return 10;
	}
	
	public static String method4(String fn, String ln){
		return fn+" "+ln;
	}
}

/* class MethodProgram1Test{
	public static void main(String...abc){
		MethodProgram1.method1();
		MethodProgram1.method2(10);
		int r1=MethodProgram1.method3();
			System.out.println(r1);
		
		String r2=MethodProgram1.method4("keys", "Selenium");
			System.out.println(r2);
		
	}
} */