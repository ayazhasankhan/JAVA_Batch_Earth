package exception;

public class ThrowExample {
	
	public static void validate(int age) {
		
		if(age<18) {
			
			throw new ArithmeticException("Person is under 18"); // Explicitly throw the exception
		}
		else {
			
			System.out.println("Person is eligible");
		}
	}

	public static void main(String[] args) {	
		validate(21);
	}

}
