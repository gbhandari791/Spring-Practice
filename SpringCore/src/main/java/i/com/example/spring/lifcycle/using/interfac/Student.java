package i.com.example.spring.lifcycle.using.interfac;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean, DisposableBean {
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Study Done, Ready for exam");	
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Leaving School");
		
	}
	
	private String studyStatus;

	public Student() {
		super();
		System.out.println("Taking Admition");
	}

	public String getStudyStatus() {
		return studyStatus;
	}

	public void setStudyStatus(String studyStatus) {
		this.studyStatus = studyStatus;
		System.err.println("Learning in School");
	}

	@Override
	public String toString() {
		return "Student [studyStatus=" + studyStatus + "]";
	}
	
	
}
