package InterfaceExample;

public class Second implements First {


	@Override
	public void sum() {
		
		System.out.println(a+b);
		
	}
	
	public static void main(String[] args) {
		
		Second obj =new Second();
		obj.sum();
		obj.multi();
		First.subs();
		
		

	}


}
