package com.hrybanov.spring.spring_introduction;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:myApp.properties")
@ComponentScan("com.hrybanov.spring.spring_introduction")
public class MyConfig {

}
