package org;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class springConfig {

	@Bean
	public AA aa() {
		AA a = new AA();
		return a;
	}
}
