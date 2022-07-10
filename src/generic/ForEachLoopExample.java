package generic;

public class ForEachLoopExample {

	//String arr[]= {"India","Aust", "Canada", "UAE"};
	
	// Country
	
	//===================== structure==========================
	
	/*
	 
	 for(data_type variable: array){
	 
	 -------------------
	 }
	 */
	
	public static void main(String[] args) {
	
    String arr[]= {"India","Aust","Canada","UAE"};	
		
    for(String countryName: arr) {
	   
    String fullName = countryName +" Country";	
	System.out.println(fullName); 
   }
	

	}

}
