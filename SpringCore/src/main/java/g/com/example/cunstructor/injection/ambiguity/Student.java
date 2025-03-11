package g.com.example.cunstructor.injection.ambiguity;

public class Student {

	private int a;
	private int b;
	private String cunstructorCalled;
	
	public Student(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		this.cunstructorCalled = "int int";
	}
	
	public Student(String a, String b) {
		super();
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		this.cunstructorCalled = "String String";
	}

	@Override
	public String toString() {
		return "Student [a=" + a + ", b=" + b + ", cunstructorCalled = " + cunstructorCalled + "]";
	}
		
}
