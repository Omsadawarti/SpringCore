package com.SpringCore.JavaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.SpringCore.JavaConfig")
public class JavaConfig_Bean_Annotation {

	
	@Bean // @Bean(name = {"college"})
	public College getCollege()
	{
		return new College() ;
	}
}
