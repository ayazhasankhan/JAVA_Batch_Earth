package generic;

public class VariableExample {

/*
 Types of variable

 1. Local
 2. instance
 3. Static
*/

   static int a=2;
   static int b=3;
   static int sum;
    
	public void sum() {
		

		sum =a+b;
	      System.out.println(sum);
		
	}
	public static void main(String[] args) {
		
		sum =a+b;
      System.out.println(sum);
	}

}
