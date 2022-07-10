package exception;

public class Sample {

	public static void main(String[] args) {
		
		try {
			int a=50/0;	
		}
		catch(ArithmeticException e) {
			
			System.out.println(e);
		}
		finally {
			System.out.println("Finally is always executed");
		}
		System.out.println("Test this code");

	}

}
