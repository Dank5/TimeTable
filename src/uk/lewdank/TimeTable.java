package uk.lewdank;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;

public class TimeTable {

	List<Task> tasks;
	ZonedDateTime currentTime;
	
	TimeTable() {
		currentTime = ZonedDateTime.now();
	}
	
	void addTask(Task task) {
		tasks.add(task);
	}
	

}
