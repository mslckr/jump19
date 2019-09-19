package com.test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Indicates that a configuration class uses the @bean annotation 
@SpringBootApplication
public class MovieApplication {
	//Main
    public static void main(String[] args) {
    	//Starts the SpringApplication
        SpringApplication.run(MovieApplication.class, args);
    }
}    
