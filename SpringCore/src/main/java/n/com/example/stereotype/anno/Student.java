package n.com.example.stereotype.anno;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("studentBean")
public class Student {

	@Value("1")
	private int studentId;
	@Value("Gaurav")
	private String studentName;
	@Value("#{studentAdd}")
	private List<String> studentAddress;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
	}
	public List<String> getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(List<String> studentAddress) {
		this.studentAddress = studentAddress;
	}
	
}
