package com.Student_Mnagemengt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
    @Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
//		Student student1 = new Student(1,"Mohamed", "Adan" ,"jasim10@gmail.com");
//		studentRepository.save(student1);
//		Student student2 = new Student(2,"Hassan", "Ibrahim" ,"Hurdaye20@gmail.com");
//		studentRepository.save(student2);
//		Student student3 = new Student(3,"Abdulkadir", "Hayat" ,"Hayat5@gmail.com");
//		studentRepository.save(student3);


	}
}
