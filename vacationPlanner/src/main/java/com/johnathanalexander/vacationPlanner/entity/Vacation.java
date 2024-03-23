package com.johnathanalexander.vacationPlanner.entity;

public class Vacation {
	private String name;
	
	public Vacation() {
		
	}

	public Vacation(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Vacation(name:" + this.name + ")";
	}
}
