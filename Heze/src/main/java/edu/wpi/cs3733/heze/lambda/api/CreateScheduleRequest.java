package edu.wpi.cs3733.heze.lambda.api;

public class CreateScheduleRequest {
	public String name;
	public String start;
	public String end;
	public int meetingDuration;
	public int startHour;
	public int endHour;
	
	public CreateScheduleRequest(String name, String start, String end, int meetingDuration, int startHour, int endHour) {
		this.name = name;
		this.start = start;
		this.end = end;
		this.meetingDuration = meetingDuration;
		this.startHour = startHour;
		this.endHour = endHour;
	}

	public String toString() {
		return "CreateSchedule(" + name + "," + start + "," + end + "," + meetingDuration + "," + startHour + "," + endHour + ")";
	}

}