package c.com.example.property.injection.reference;

public class A {
	private String varFrom;
	private B objectOfB;
	
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public A(String varFrom, B objectOfB) {
		super();
		this.varFrom = varFrom;
		this.objectOfB = objectOfB;
	}
	
	public String getVarFrom() {
		return varFrom;
	}
	public void setVarFrom(String varFrom) {
		System.out.println("Settingf varFrom A");
		this.varFrom = varFrom;
	}
	public B getObjectOfB() {
		return objectOfB;
	}
	public void setObjectOfB(B objectOfB) {
		System.out.println("Setting Ob Of b");
		this.objectOfB = objectOfB;
	}
	
	@Override
	public String toString() {
		return "A [varFrom=" + varFrom + ", objectOfB=" + objectOfB + "]";
	}
}
