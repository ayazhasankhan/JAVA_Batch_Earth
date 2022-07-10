package generic;

public class FinalExample {

	
	/*
	//================Introduction ==============
		1. Final is keyword
		2. it can be used with variable, method and class
		3. Final Variable : you can not change its value
		4. Final method : you can not override the method
		5. Final class : you can not inherit the class
			
	*/	
	
	final static int a =10;
	
	public static void printvalue() {
		
		//a=20;
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		System.out.println(a); // 10
		
		FinalExample.printvalue(); // 20

	}

}
