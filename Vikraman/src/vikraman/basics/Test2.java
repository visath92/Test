package vikraman.basics;

public class Test2 {
	
	int id;
	String name;
	float sal;
	
	Test2()
		{
		id=1;
		name="vikas";
		sal=12.000f;
		
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
		
		Test2 q=new Test2();
		Test2 q1=new Test2();

		q.display();
		q1.display();



}
}
