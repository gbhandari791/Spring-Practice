package s.com.example.aop;

import org.springframework.stereotype.Component;

@Component("student")
public class Student {

	public void study() {
		System.out.println("Student is studying");
	}
	
	public void studyingMaths() {
		System.out.println("Student studying Maths");
	}
	
	public void add(int a, int b) {
		System.out.println(a + b);
	}
	
	public int addTwoNumbers(int a, int b) {
		return a+b;
	}
	
	public void throwException() {
		int a = 1/0;
	}
	
	public void printHello() {
		System.out.println("Hello");
	}
	
	public void printNumber() {
		System.out.println("1");
	}
	
}