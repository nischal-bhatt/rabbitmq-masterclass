package com.course.rabbitmq.producer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.course.rabbitmq.producer.entity.Furniture;
import com.course.rabbitmq.producer.producer.FurnitureProducer;

@SpringBootApplication
//@EnableScheduling
public class Application implements CommandLineRunner{

	@Autowired
	private FurnitureProducer producer;
	
	private final List<String> COLORS = List.of("white","red","green");
	private final List<String> MATERIALS = List.of("wood","plasic","steel");
	
	//@Autowired
	//private PictureProducerTwo pictureProducerTwo;
	
	//private final List<String> SOURCES = List.of("mobile","web");
	//private final List<String> TYPES = List.of("jpg","png","svg");
	
	
	//@Autowired
	//private EmployeeJsonProducer employeeJsonProducer;
	
	//@Autowired
	//private HumanResourceProducer humanResourceProducer;
	
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
		
	//	for (int i =0; i<5; i++)
	//	{
	//		var employee = new Employee("emp"+i,"Employee" + i,LocalDate.now());
	//		humanResourceProducer.sendMessage(employee);
	//	}
		
		/*for (int i =0; i<10; i++)
		{
			var picture = new Picture();
			picture.setName("Picture " + i);
			picture.setSize(ThreadLocalRandom.current().nextLong(1,10000));
			picture.setSource(SOURCES.get(i % SOURCES.size()));
			picture.setType(TYPES.get(i % TYPES.size()));
			
			this.pictureProducerTwo.sendMessage(picture);
		}*/
		
		for (int i =0; i<10; i++)
		{
			var furniture = new Furniture();
			furniture.setName("Furniture " + i);
			furniture.setColor(COLORS.get(i % COLORS.size()));
			furniture.setMaterial(MATERIALS.get(i % MATERIALS.size()));
			furniture.setPrice(i);
			
			producer.sendMessage(furniture);
		}
		
	}

}
