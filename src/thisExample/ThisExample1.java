package thisExample;

public class ThisExample1 {

	
	/*
	//================Introduction ==============
		1. this is keyword
		2. it can be used to refer the current class instance variable
		3. it can be used to invoke the current class method
		4. it can be used to invoke the current class constructor
		5. it can passed as an argument in the method call
		6. it can passed as an argument in the constructor call
		7. it can be used to return the current class instance from the method
			
	*/	
		
	public ThisExample1() {
		System.out.println("Hello ThisExample1");
	}
	
	public ThisExample1(int a) {
		this();
		System.out.println(a);
	}
	
	public static void main(String args[]) {
		
		ThisExample1 obj = new ThisExample1(5);

	}
}
