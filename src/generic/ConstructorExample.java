package generic;

public class ConstructorExample {

	int a =3;
	int b=2;
	int sum;
	int sub;
	int mul;
	
	public void sum() {
		sum =a+b;
		System.out.println(sum);	
	}
	public void sub() {
		sub =a-b;
		System.out.println(sub);
	}
	public void mul() {
		
		mul=a*b;
		System.out.println(mul);
	}
	
	// constructor example
	public ConstructorExample() {
		
		System.out.println("Ayaz");
		
		//code to Read the excel file 
	}
	
	public static void main(String[] args) {
	
		ConstructorExample obj = new ConstructorExample(); /// create the object of a class

		obj.sum();
		obj.mul();
		
	}

}
