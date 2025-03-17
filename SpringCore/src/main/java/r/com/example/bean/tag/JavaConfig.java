package r.com.example.bean.tag;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

	@Bean(name = {"student", "firstStudent"})
	public Student getStudent() {
		Student student = new Student(getSamosa());
		return student;
	}
	
	@Bean
	public Samosa getSamosa() {
		Samosa s = new Samosa();
		return s;
	}
}
