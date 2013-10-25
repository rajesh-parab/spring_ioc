package com.rajesh.spring.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
@ImportResource( { "classpath*:com/rajesh/spring/config/beans.xml" } )
//@ComponentScan( basePackages = "org.rest" )
//@PropertySource({ "classpath:rest.properties", "classpath:web.properties" })
//@PropertySource({ "classpath:com/rajesh/spring/config/rest.properties" })
//<context:property-placeholder
//location="classpath:persistence.properties, classpath:web.properties"
//ignore-unresolvable="true"/>

@Configuration
public class AppContext2 {

	private @Value("#{rest['hello.world']}")  String greeting;

	 
	@Bean(initMethod = "setup", destroyMethod = "cleanup")
	public Car car() {
		Car car= new Car();
		car.setName(greeting);
		return car;

	}
	 
	 @Bean
	   public static PropertySourcesPlaceholderConfigurer properties() {
	      return new PropertySourcesPlaceholderConfigurer();
	   }

}
