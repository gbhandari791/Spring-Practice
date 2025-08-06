package s.com.example.aop;

import org.springframework.stereotype.Component;

@Component("emloyee")
public class Employee {

	public String studyingJava() {
		System.out.println("Employee studying java");
		return "";
	}
}
