package polymorphism;

public class MothodOverLoadingExample {

/*
//================Rules ==============
	1. it happens in same class
	2. By changing the number of arguments
	3. By changing the data types
		
*/	
	
	double area;
	
	public void area(int l) {
		area =l*l;
		System.out.println("Area of Square " +area);	
	}
	
	public void area(int l, int b) {		
		area =l*b;
		System.out.println("Area of rectangle " +area);	
	}
	
	public void area(double l, double h) {		
		area =.5*l*h;
		System.out.println("Area of triangle " +area);	
	}
	
	public static void main(String[] args) {
	
		MothodOverLoadingExample obj = new MothodOverLoadingExample();
		obj.area(3672364.344,34354.437567345);
		
	}

}
