package c.com.example.property.injection.reference;

public class B {
	private String varFrom;

	
	public B() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public B(String varFrom) {
		super();
		this.varFrom = varFrom;
	}

	public String getVarFrom() {
		return varFrom;
	}

	public void setVarFrom(String varFrom) {
		System.err.println("Setting varFrom B");
		this.varFrom = varFrom;
	}

	@Override
	public String toString() {
		return "B [varFrom=" + varFrom + "]";
	}
	
	
	
}
