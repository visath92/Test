package vikraman.basics;

public class Variable {
	int a = 10;
	static int b = 20;

	public static void main(String[] args) {
		int c = 10;
		Variable s = new Variable();
		System.out.println(c);
		System.out.println(b);
		System.out.println(s.a);
	}
}
