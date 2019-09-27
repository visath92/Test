package vikraman.basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Sorting1 {
public static void main(String[] args) {
	ArrayList<String> sa = new ArrayList<>();
	sa.add ("Vikraman");
	sa.add ("Rajan");
	sa.add ("Siva");
	sa.add("Selvam");
	sa.add("Rajesh");
	sa.add("Mahesh");
	sa.add("suresh");
	sa.add("Giri");
	sa.add("Raju");
	Collections.sort(sa,Collections.reverseOrder());
	Iterator itr = sa.iterator();	
	while (itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
