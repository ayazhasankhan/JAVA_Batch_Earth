package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ItiratorExample {

	public static void main(String[] args) {
		
		
		List<String> lst = new ArrayList<String>();
		
		lst.add("Volvo");
		lst.add("Volvo");
		lst.add("BMW");
		lst.add("Ford");
		lst.add("Mazda");
		//System.out.println(lst);
		
		Iterator<String> itr = lst.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
