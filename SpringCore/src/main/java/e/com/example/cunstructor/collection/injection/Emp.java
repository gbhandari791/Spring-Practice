package e.com.example.cunstructor.collection.injection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
	
	private List<String> emoName;
	private List<String> empBiwiKaName;
	private Set<Long> empPhone;
	private Map<Integer, String> empInfo;
	
	public Emp(List<String> emoName, Set<Long> empPhone, Map<Integer, String> empInfo) {
		super();
		this.emoName = emoName;
		this.empPhone = empPhone;
		this.empInfo = empInfo;
	}

	@Override
	public String toString() {
		return "Emp [emoName=" + emoName + ", empPhone=" + empPhone + ", empInfo=" + empInfo + "]";
	}
	
	
}
