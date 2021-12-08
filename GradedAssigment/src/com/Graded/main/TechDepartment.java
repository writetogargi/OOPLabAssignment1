package com.Graded.main;

//Super Department class will be the superclass and all other departments must extend it.
public class TechDepartment extends SuperDepartment{
	public String departmentName() {
		return "Tech Department";
	}
	public String getTodaysWork() {
		return "Complete coding of module 1";
	}
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	public String getTechStackInformation() {
		return "core Java";
	}
}
