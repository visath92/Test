package collection;

import java.util.HashSet;

public class Student3 {


			public static void main(String[] args) {
				HashSet<String> sa = new HashSet<>();
				sa.add("Vikraman");
				sa.add("Sakthi");
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

