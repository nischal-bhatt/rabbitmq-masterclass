package com.course.rabbitmq.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.course.rabbitmq.producer.producer.HelloRabbitProducer;

@SpringBootApplication
public class Application implements CommandLineRunner{

	@Autowired
	private HelloRabbitProducer producer;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		this.producer.sendHello("Timotius Pamungkas" + Math.random());
		
	}

}
