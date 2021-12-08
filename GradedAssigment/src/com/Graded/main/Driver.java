package com.Graded.main;



import java.util.Scanner;

//Driver class
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Driver class Main will be used to create objects of HrDepartment, TechDepartment, AdminDepartment
		AdminDepartment adept = new AdminDepartment();
		HrDepartment hdept = new HrDepartment();
		TechDepartment tdept = new TechDepartment();
		
		// Each department will display all its functionalities
		// Each department  will display whether today is a holiday or not with the help of the Super Department.
		// (SuperDepartment will act as a super class for all the departments)
		System.out.println("Welcome to "+adept.departmentName());
		System.out.println(adept.getTodaysWork());
		System.out.println(adept.getWorkDeadline());
		System.out.println(adept.isTodayAHoliday()+"\n");
		
		
		System.out.println("Welcome to "+hdept.departmentName());
		System.out.println(hdept.doActivity());
		System.out.println(hdept.getTodaysWork());
		System.out.println(hdept.getWorkDeadline());
		System.out.println(hdept.isTodayAHoliday()+"\n");
		
		System.out.println("Welcome to "+tdept.departmentName());
		System.out.println(tdept.getTodaysWork());
		System.out.println(tdept.getWorkDeadline());
		System.out.println(tdept.getTechStackInformation());
		System.out.println(tdept.isTodayAHoliday());

	}

}
