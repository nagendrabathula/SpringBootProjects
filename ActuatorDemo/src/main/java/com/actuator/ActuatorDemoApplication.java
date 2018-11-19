package com.actuator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ActuatorDemoApplication {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ActuatorDemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ActuatorDemoApplication.class, args);
		LOGGER.error("At Error Level");
		LOGGER.warn("At Warn Level");
		LOGGER.debug("At Debug Level");
		LOGGER.info("At info Level");
	}
	
	
}

@RestController
class MyRestController{
	
	@GetMapping("/")
	public String sayHello(){
		String nag="nag";
		if(nag.length()==3){
			throw new RuntimeException("OOPS Exception Occured");
		}
		return "Hello";
	}
}

