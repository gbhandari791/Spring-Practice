package f.com.example.cunstructor.ref.injection;

public class B {

	private String varFrom;

	public B(String varFrom) {
		super();
		this.varFrom = varFrom;
	}

	@Override
	public String toString() {
		return "B [varFrom=" + varFrom + "]";
	}
	
	
}
