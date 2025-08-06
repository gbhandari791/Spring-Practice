package q.com.example.java.base.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "q.com.example.java.base.config")
@EnableAspectJAutoProxy
public class JavaConfig {

}
