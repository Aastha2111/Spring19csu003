package com.ncu.loggingAop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.ncu.loggingAop")
public class ConfigLogging {

	@Bean
	public Employee empl() {
		return new Employee("aastha",20);
	}
}
