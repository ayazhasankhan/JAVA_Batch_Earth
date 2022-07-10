package generic;

public class IfElseExample {

	public static void main(String[] args) {
		
		int marks=5;
		
		if(marks>=60) {
			
			System.out.println("Passed with first Division");
		}
		
		else if(marks<60 && marks>=45) {
			
			System.out.println("Passed with second Division");
		}
	
		else if(marks<45 && marks>=33) {
		
		System.out.println("Passed with third Division");
	}
		else if(marks<33) {
		
		System.out.println("Bravo, You are awesome! Failed");
	}

	}

}
