package vikraman.basics;
import java.util.Collections;
import java.util.Vector;
public class Sorting {
	 public static void main(String[] args) {
	    Vector<String> Family = new Vector<String>();
	 
	    Family.add("Siva");
	    Family.add("Raja");
	    Family.add("Selvam");
	    Family.add("Sathish");
	    Family.add("Rajesh");
	 
	    System.out.println("Family elements before sorting: ");
	    for(int i=0; i < Family.size(); i++){
	       System.out.println(Family.get(i));
	    }
	    Collections.sort(Family);
	    System.out.println("Family elements after sorting: :");
	    for(int i=0; i < Family.size(); i++){
	       System.out.println(Family.get(i));
	    }
	 } 
	}
