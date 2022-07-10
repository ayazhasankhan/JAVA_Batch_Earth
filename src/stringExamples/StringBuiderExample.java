package stringExamples;

public class StringBuiderExample {

	public static void main(String[] args) {

/*
 //================String concatination ==============
							
*/		
		String s = "Hey";
		s.concat(" Selenium");
		System.out.println(s);
		
/*
//================String Buffer concatination ==============
					
						
*/		
		StringBuilder sb = new StringBuilder("Hello");
		sb.append(" Java");
		System.out.println(sb);

	}

}
