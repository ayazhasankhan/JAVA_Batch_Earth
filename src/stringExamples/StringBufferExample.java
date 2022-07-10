package stringExamples;

public class StringBufferExample {

	public static void main(String[] args) {

/*
 //================String concatination ==============
							
*/		
		String s = "Hey";
		String p=s.concat(" Selenium");
		System.out.println(p);
		
/*
//================String Buffer concatination ==============
					
						
*/		
		StringBuffer sb = new StringBuffer("Hello");
		sb.append(" Java");
		System.out.println(sb);

	}

}
