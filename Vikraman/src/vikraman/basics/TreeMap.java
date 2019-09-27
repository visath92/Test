package vikraman.basics;

import java.util.*;
import java.util.Iterator;

public class TreeMap {

	public static void main(String args[]) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(01, "Vikraman");
		map.put(01, "Raja");
		map.put(01, "Rajan");
		map.put(02, null);
		map.put(02, null);
		// for(Map.Entry m:map.entrySet()){
		// System.out.println(m.getKey()+" "+m.getValue());
		
//		Set set = map.entrySet();
//		Iterator itr = set.iterator();
//		while (itr.hasNext()) {
//			Map.Entry entry = (Map.Entry) itr.next();
//			System.out.println(entry.getKey() + " " + entry.getValue());
//	}
	      map.entrySet()  
	      //Returns a sequential Stream with this collection as its source  
	      .stream()  
	      //Sorted according to the provided Comparator  
	      .sorted(Map.Entry.comparingByKey())  
	      //Performs an action for each element of this stream  
	      .forEach(System.out::println);  
	      
		
	}
}