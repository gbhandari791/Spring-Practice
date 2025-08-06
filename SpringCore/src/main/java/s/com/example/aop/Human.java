package s.com.example.aop;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("human")
@Aspect
@EnableAspectJAutoProxy
@Order(2)
public class Human {
	
	@Before("execution(* printNumber())")
	public void humanAdvice() {
		System.out.println("Good Morning - from Human");
	}

	@Pointcut("execution(public void study())")
	public void commonExpression() {}
	
	// @Before("execution(public void study())")
	@Before("execution(public void s.com.example.aop.Student.study())")
	public void wakeUp() {
		System.out.println("Good Morning");
	}
	
	@After("commonExpression()")
	public void sleep() {
		System.out.println("Good Night");
	}
	
	@Before("execution(public * studying*())")
	public void whatToStudy() {
		System.out.println("studying what?");
	}
	
	@Before("execution(* s.com.example.aop.Student.add(..))")
	public void logAddionNumbers(JoinPoint joinPoint) {
		
		System.out.println("Joinoint Signature : " + joinPoint.getSignature()); 
		System.out.println("Joinoint Name : " + joinPoint.getSignature().getName()); 
		System.out.println("Joinoint Class : " +  joinPoint.getTarget().getClass());
		Object[] args = joinPoint.getArgs();
		if(args != null) {
			for(Object obj : args) {
				System.out.println("Number: " +  obj);
			}
		}
	}
	
	@AfterReturning(pointcut = "execution(* s.com.example.aop.Student.addTwoNumbers(..))", 
			returning = "returnedValue")
	public void logAfterReturn(Object returnedValue) {
		System.out.println(returnedValue);
	}
	
	@AfterThrowing(pointcut = "execution(* throwException())", throwing = "ex")
	public void runAfterException(Exception ex) {
		System.out.println("Following exception occurred : " + ex);
	}
	
	@Around("execution(* printHello())")
	public void aroundAdvaice(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("Before JoinPoint execution");
		boolean runJoinPoint = true;
		if(runJoinPoint) {
			pjp.proceed(); // calls the Joinpoint method - (printHello() in this case)
		}
		
		System.out.println("After JoinPoint execution");
	}
	
	
}
