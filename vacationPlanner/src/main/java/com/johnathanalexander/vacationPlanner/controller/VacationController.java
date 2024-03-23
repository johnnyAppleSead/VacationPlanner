package com.johnathanalexander.vacationPlanner.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.johnathanalexander.vacationPlanner.entity.Vacation;

@RestController
public class VacationController {
	private static Logger logger = LoggerFactory.getLogger(VacationController.class);
	
	public VacationController() {
		logger.info("Starting Vacation Controller");
	}
	
	@PostMapping("/vacation")
	public ResponseEntity<Vacation> newVacation(@RequestBody Vacation vacation){
		System.out.println("Create: " + vacation.getName());
		
		return ResponseEntity.ok(null);
	}
	
	@PutMapping("/vacation")
	public ResponseEntity<Vacation> updateVacation(@RequestBody Vacation vacation){
		return ResponseEntity.ok(null);
		
	}
	
	@GetMapping("/vacation")
	public ResponseEntity<Vacation> getVacation(@RequestBody Vacation vacation){
		return ResponseEntity.ok(null);
		
	}
	
	@DeleteMapping("/vacation")
	public ResponseEntity<Vacation> deleteVacation(@RequestBody Vacation vacation){
		return ResponseEntity.ok(null);
	}
}
