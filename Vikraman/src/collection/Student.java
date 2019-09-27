package collection;

import java.util.ArrayList;

public class Student {
public static void main(String[] args) {
	ArrayList<String> sa = new ArrayList<>();
	sa.add("Vikraman");
	sa.add("Arun");
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