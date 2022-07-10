package generic;

public class ObjectCreationExample {

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
	public static void main(String[] args) {
	
		ObjectCreationExample obj = new ObjectCreationExample(); /// create the object of a class

		obj.sum();
		obj.mul();
	}

}
