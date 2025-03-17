package r.com.example.bean.tag;

import org.springframework.beans.factory.annotation.Value;

public class Student {

	@Value("Gaurav")
	private String name;
	
	private Samosa samosa;

	
	public Student() {
		super();
	}

	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	
	
}
