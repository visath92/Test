package collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class Student5 {


			public static void main(String[] args) {
				Vector<String> sa = new Vector<>();
				sa.add("Vikraman");
				sa.add("Arun");
				sa.add("Siva");
				sa.add("Selvam");
				//System.out.println(s);
				//for (int i=0; i<s.size(); i++) {
					//System.out.println(s);
			Collections.sort(sa);
				Iterator itr = sa.iterator();
			while (itr.hasNext())
			{
				System.out.println(itr.next());
			//for(String n : s) {
				//System.out.println(n);
				//sa.forEach((n)-> System.out.println(n));
			}
			}
}

