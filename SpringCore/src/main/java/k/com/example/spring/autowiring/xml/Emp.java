package k.com.example.spring.autowiring.xml;

public class Emp { 

	private Address address;

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("Settting value Using Constructoe");
	}



	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("Setting Value using setter");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
	
}
