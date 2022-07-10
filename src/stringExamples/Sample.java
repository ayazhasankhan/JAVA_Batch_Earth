package stringExamples;

public class Sample {

	
	public static void main(String args[]) {
		
		String s1 ="Hello"; // by string literal
		
		String s2 = new String("Good Morning"); // by new keyword
		//s1="Go";
		
		//boolean p =s2.contains(s1);
		
		String p=s1.concat(s2);
		
		s2=s1+s2;
		System.out.println(s2.length());
		//System.out.println(s1.equals(s2));
	}
}




