package s.com.example.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@EnableAspectJAutoProxy
@Component("human2")
@Order(1)
public class Human2 {

	@Before("execution(* printNumber())")
	public void humanAdvice() {
		System.out.println("Good Morning - from Human2");
	}
}
