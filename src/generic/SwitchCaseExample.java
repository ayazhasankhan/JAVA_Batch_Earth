package generic;

public class SwitchCaseExample {

	public static void main(String[] args) {
		
    int monthNumber =565;
    
    String monthName="";
    
    switch(monthNumber) {
    
    case 1: monthName ="Jan";
    break;
    
    case 2: monthName ="feb";
    break;
    
    case 3: monthName ="march";
    break;
    
    case 4: monthName ="April";
    break;
    
    case 5: monthName ="May";
    break;
    
    case 6: monthName ="June";
    break;
    
    case 7: monthName ="July";
    break;
    
    case 8: monthName ="Aug";
    break;
    
    case 9: monthName ="Sept";
    break;
    
    case 10: monthName ="Oct";
    break;
    
    case 11: monthName ="Nov";
    break;
    
    case 12: monthName ="Dec";
    
    default: System.out.println("Invalid Month");
    }
    
    System.out.println(monthName);
	}

}
