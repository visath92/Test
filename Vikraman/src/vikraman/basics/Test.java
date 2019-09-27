package vikraman.basics;

public class Test {
	
	int id;
	String name;
	float sal;
	
	Test(int a, String n, float s)
		{
			id=a;
			name=n;
			sal=s;
	}
	public void display()
	{
			System.out.println("Id is " +id);
			System.out.println("Name is " +name);
			System.out.println("Sal is " +sal);

	}
	
		public static void main (String[] args){
			/*double a = 10.2311;
			System.out.println(a);
		}*/
		
		Test q=new Test(1,"kousi",10000.00f);
		q.display();
		
		Test q1=new Test(2,"dolly",7000.00f);
		q1.display();

		}
		
}

