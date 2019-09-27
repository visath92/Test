package vikraman.basics;

public class Test1 {
	
	int id;
	String name;
	float sal;
	
	Test1(int id, String name, float sal)
	{
	}
	public void display() {
			System.out.println("Id is " +id);
			System.out.println("Name is " +name);
			System.out.println("Sal is " +sal);

	}
	
		public static void main (String[] args){
			/*double a = 10.2311;
			System.out.println(a);
		}*/
		
		Test1 q=new Test1(1,"k",120.0f);
		q.display();
		Test1 q1=new Test1(2,"s",130.f);
		q1.display();
}
}