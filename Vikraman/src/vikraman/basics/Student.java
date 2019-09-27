package vikraman.basics;

public class Student {
	public int id;
	public String name;
	public String branch;
@Override
public String toString() {
	// TODO Auto-generated method stub
	return id + name + branch;
}
	public Student(int id, String name, String branch) {
		this.id = id;
		this.name = name;
		this.branch = branch;
		
	}
}
