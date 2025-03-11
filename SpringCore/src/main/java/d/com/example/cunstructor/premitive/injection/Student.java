 package d.com.example.cunstructor.premitive.injection;

public class Student {
	private int a;
	private int b;
	
	public Student(int a, int b) {		
		super();
		System.out.println("Assignin vaues to int a int b");
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		return "Student [a=" + a + ", b=" + b + "]";
	}
	
	
}
