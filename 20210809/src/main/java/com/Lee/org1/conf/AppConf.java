package com.Lee.org1.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.Lee.org1.cls.AA;

@Configuration
public class AppConf {
	
	@Bean
	public AA aa() {
		AA aa = new AA();
		return aa;
	}
}
