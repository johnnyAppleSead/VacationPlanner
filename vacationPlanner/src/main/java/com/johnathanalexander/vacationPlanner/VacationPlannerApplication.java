package com.johnathanalexander.vacationPlanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.johnathanalexander.vacationPlanner.controller")
//@ComponentScan("com.johnathanalexander.entity")
public class VacationPlannerApplication {

	public static void main(String[] args) {
		SpringApplication.run(VacationPlannerApplication.class, args);
	}

}
