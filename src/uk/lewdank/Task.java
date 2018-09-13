package uk.lewdank;

import java.time.*;


public class Task {
	
	private static String name;
	private LocalDate startDate;
	private LocalDate endDate;
	private int priority;
	
	Task() {
		Task.name = "default task";
		this.startDate = LocalDate.parse("1995-01-24");
		this.endDate = LocalDate.parse("1995-01-25");
		this.priority = 1;
	}
	
	Task(String name) {
		Task.name = name;
		this.startDate = LocalDate.parse("1995-01-24");
		this.endDate = LocalDate.parse("1995-01-25");
		this.priority = 1;
	}
	
	Task(String name, String startDate, String endDate) {
		Task.name = name;
		this.startDate = LocalDate.parse(startDate);
		this.endDate = LocalDate.parse(endDate);
		this.priority = 1;
	}
	
	Task(String name, String startDate, String endDate, int priority) {
		Task.name = name;
		this.startDate = LocalDate.parse(startDate);
		this.endDate = LocalDate.parse(endDate);
		this.priority = priority;
	}

}
