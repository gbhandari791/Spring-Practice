package f.com.example.cunstructor.ref.injection;

import java.util.List;

public class A {

	private String varFrom;
	private B obOfB;
	private List<B> ListOfB;
	
	
	public A(List<B> listOfB) {
		super();
		ListOfB = listOfB;
	}

	public A(String varFrom, B obOfB) {
		super();
		this.varFrom = varFrom;
		this.obOfB = obOfB;
	}

	@Override
	public String toString() {
		return "A [varFrom=" + varFrom + ", obOfB=" + obOfB + "]";
	}

	public List<B> getListOfB() {
		return ListOfB;
	}

	public void setListOfB(List<B> listOfB) {
		ListOfB = listOfB;
	}
	
	
	
}
