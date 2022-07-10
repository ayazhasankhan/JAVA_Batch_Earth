package polymorphism;

public class MethodOverRidding_Car extends MethodOverRidding_Vehicle{
	
	public void run() {
		
		System.out.println("Car is running");
	}

	public static void main(String[] args) {
		
		MethodOverRidding_Car obj = new MethodOverRidding_Car();
		obj.run();
	}

}
