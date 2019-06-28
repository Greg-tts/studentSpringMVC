package com.gt.studentSpring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.gt.studentSpring.config.DispatcherConfig;


@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.gt.studentSpring")
@Import({ WebInitializer.class, DispatcherConfig.class})
public class AppConfiguration {

}
