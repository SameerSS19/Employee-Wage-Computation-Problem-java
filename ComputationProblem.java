package com.empwagecomputaionprogram;

public class ComputationProblem 
{
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int COUNT_OF_WORK_DAYS = 2;
	
	public static void main(String[] args)
	{		
	System.out.println("Welcome to Employee Wage Computation Program");

	int empHrs = 0;
	int empWage = 0;
	int totalEmpWage = 0;
	
	for (int day = 0; day < COUNT_OF_WORK_DAYS;day++)
	{
		int empCheck = (int)Math.floor(Math.random() * 10) % 3;
		switch (empCheck) 
		{
	
			case IS_PART_TIME:
				empHrs =4;
				break;
		
			case IS_FULL_TIME:
				empHrs = 8;
				break;
		
			default:
				empHrs = 0;
		}
	empWage = empHrs * 	EMP_RATE_PER_HOUR;
	totalEmpWage += empWage;	
	System.out.println("Employee wage:" + empWage);
		
	}
	}
}
