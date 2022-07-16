package InterfaceExample;

public interface First {

	int a=5;
	int b=3;
	
	public void sum();
	
	public static void subs() {
		
		System.out.println(b-a);
	}
	
    public default void multi() {
		System.out.println(b*a);
		
	}
	
	
	
}
