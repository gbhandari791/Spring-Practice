package a.com.example.premitive.injection;

public class Sudent {
	
	private int id;
	private long phoneNo;
	private String name;
	
	
	public Sudent() {
		super();
		// TODO Auto-generated constructor stub
	}	
	
	public Sudent(int id, long phoneNo, String name) {
		super();
		this.id = id;
		this.phoneNo = phoneNo;
		this.name = name;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("StudentId from setter");
		this.id = id;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		System.out.println("phoneNo from setter");
		this.phoneNo = phoneNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("name from setter");
		this.name = name;
	}

	@Override
	public String toString() {
		return "Sudent [id=" + id + ", phoneNo=" + phoneNo + ", name=" + name + "]";
	}
	
	
}
