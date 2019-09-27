package collection;

import java.util.LinkedHashSet;

public class Student4 {


			public static void main(String[] args) {
				LinkedHashSet<String> sa = new LinkedHashSet<>();
				sa.add("Vikraman");
				sa.add("Vikraman");
				sa.add("Siva");
				sa.add("Selvam");
				//System.out.println(s);
				//for (int i=0; i<s.size(); i++) {
					//System.out.println(s);
			//Iterator itr = sa.iterator();
			//while (itr.hasNext())
			//{
				//System.out.println(itr.next());
			//for(String n : s) {
				//System.out.println(n);
				sa.forEach((n)-> System.out.println(n));
			}
			}
