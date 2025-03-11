package b.com.example.property.injection.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	
	private int empId;
	private List<String> empName;
	private Set<String> empPhone;
	private Map<Integer, String> empAdd;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, List<String> empName, Set<String> empPhone, Map<Integer, String> empAdd) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empPhone = empPhone;
		this.empAdd = empAdd;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public List<String> getEmpName() {
		return empName;
	}

	public void setEmpName(List<String> empName) {
		this.empName = empName;
	}

	public Set<String> getEmpPhone() {
		return empPhone;
	}

	public void setEmpPhone(Set<String> empPhone) {
		this.empPhone = empPhone;
	}

	public Map<Integer, String> getEmpAdd() {
		return empAdd;
	}

	public void setEmpAdd(Map<Integer, String> empAdd) {
		this.empAdd = empAdd;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empPhone=" + empPhone + ", empAdd=" + empAdd
				+ "]";
	}
	
	
}
