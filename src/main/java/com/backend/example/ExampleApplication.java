package com.backend.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class  ExampleApplication {

	public static void main(String[] args) {

		var ctx = SpringApplication.run(ExampleApplication.class, args);

		MyFristClass myFirstClass=ctx.getBean(MyFristClass.class);
		System.out.println(myFirstClass.sayHello());

	}

}
