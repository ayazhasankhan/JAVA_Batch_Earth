package generic;

public class StaticExample {

/*
 * static is used for memory management
 * 
 * variable, method, class(nested)
 * 
 * 
 * 	
 */
		
	static int a =2; // it will create a memory in class area at the time of class loading
	
	public static void go() {
		
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		
		System.out.println(a);
		StaticExample obj =new StaticExample();
		obj.go();
		
		StaticExample.go();

	}

}
