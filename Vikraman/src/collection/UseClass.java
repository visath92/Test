package collection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Vector;

import vikraman.basics.Student;

public class UseClass {
	public static void main(String[] args) {
		Student s1 = new Student (1,"Vikraman","MECHANICAL");
		Student s2 = new Student (1,"Vanathi","PHYSICS");
		Student s3 = new Student (3,"RAJA","CSE");
		Student s4 = new Student (0,null,null);
		//ArrayList <Student> al = new ArrayList<>();
		//LinkedList <Student> al = new LinkedList<>();
		//Vector <Student> al = new Vector<>();
		//HashSet <Student> al = new HashSet<>();
		//LinkedHashSet <Student> al = new LinkedHashSet<>();
		TreeSet <Student> al = new TreeSet<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		//for(Student st:al) {
			//System.out.println(st.id + ""  + st.name +  "" + st.branch + "");
		Iterator s = al.iterator();
		while (s.hasNext()) {
			Student st =  (Student) s.next();
			System.out.println("S.NO:- " + st.id+" NAME:- "  + st.name +  " DEPT:- " + st.branch + "");	
	}
			
		}

}