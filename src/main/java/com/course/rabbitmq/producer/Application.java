package com.course.rabbitmq.producer;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.course.rabbitmq.producer.entity.Employee;
import com.course.rabbitmq.producer.producer.HumanResourceProducer;

@SpringBootApplication
//@EnableScheduling
public class Application implements CommandLineRunner{

	//@Autowired
	//private EmployeeJsonProducer employeeJsonProducer;
	
	@Autowired
	private HumanResourceProducer humanResourceProducer;
	
	//@Autowired
	//private HelloRabbitProducer producer;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	//	this.producer.sendHello("Timotius Pamungkas" + Math.random());
		
	//	for (int i =0; i<5 ; i ++)
	//	{
	//		var employee = new Employee("emp" + i, "Employee " + i, LocalDate.now());
	//	     employeeJsonProducer.sendMessage(employee);
	//	}
		
		for (int i =0; i<5; i++)
		{
			var employee = new Employee("emp"+i,"Employee" + i,LocalDate.now());
			humanResourceProducer.sendMessage(employee);
		}
		
	}

}
