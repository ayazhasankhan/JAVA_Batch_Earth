package abstraction;

public abstract class Bike {

	public abstract void run();
	
	
	public void stop() {
		
		System.out.println("Stop");
	}
	
	
	public static void reverse() {
		
		System.out.println("Reverse");
	}
	
	public Bike() {
		
		System.out.println("My Bike");
	}
	
}
