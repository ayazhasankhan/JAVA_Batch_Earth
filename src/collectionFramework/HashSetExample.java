package collectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		
		Set<String> lst = new HashSet<String>();
		
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
