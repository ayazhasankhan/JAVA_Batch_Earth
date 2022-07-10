package arrayExample;

public class ArraySample {

	/*
	 //================Requirement ==============
	  
	   Array ==Delhi, Mumbai, Chennai, Kolkata
	   
	 Array  = 3, 5,7, 8,10;
	   
	  
								
	*/	
	
	public static void main(String[] args) {
		
//============First way ====================//		
		int a[]= {3,5,8,10}; // declaration, instantiation(max limit or memory or size =4), initialization
		
		String s[] = {"Delhi", "Mumbai", "Chennai", "Kolkata"};
		
		//System.out.println(s[2].length());
		
//============Second way ====================//	
		
		int a1[] = new int[10]; // declaration and instantiation
		a1[0]=3; // initialization
		a1[1]=5;
		a1[2]=7;
		a1[3]=8;
		a1[4]=10;
		
		System.out.println(a1[12]);

	}

}
