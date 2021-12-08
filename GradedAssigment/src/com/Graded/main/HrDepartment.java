package com.Graded.main;

//Super Department class will be the superclass and all other departments must extend it.
public class HrDepartment extends SuperDepartment{
	public String departmentName() {
		return "Hr Department";
	}
	public String getTodaysWork() {
		return "Fill today’s timesheet and mark your attendance";
	}
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	public String doActivity() {
		return "team Lunch";
	}
}
