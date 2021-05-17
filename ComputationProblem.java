package com.empwagecomputaionprogram;
import java.util.Scanner;
public class ComputationProblem
{
	public String CompanyName;
	public int MaxHours;
	public int WagePerHour;
	public int FullWorkingHour;
	public int HalfWorkingHour;
	public int TotalWorkingDays=0;
	public ComputationProblem()
	{
		this.CompanyName="";
		this.MaxHours= 0;
		this.WagePerHour= 0;
		this.FullWorkingHour= 0;
		this.HalfWorkingHour= 0;
		this.TotalWorkingDays= 0;
	}
public int Attendance(int MaxHours , int TotalWorkingDays,int FullWorkingHour,int HalfWaorkingHour) 
{
		int workingDays=0;
		int workingHours=0;
		while(workingHours <= MaxHours && workingDays <= TotalWorkingDays)
		{
			workingDays++ ;
			int attendance = (int) Math.floor(Math.random() * 10) % 3; 
			switch (attendance)
			{
			case 1: 
				workingHours=workingHours+FullWorkingHour;
			break;
			case 2: 
				workingHours=workingHours+HalfWorkingHour;
				break;
			case 3: 
				workingHours = workingHours+0;
			}
			System.out.println("Total Working hours :");
			System.out.println (workingHours);
		}
		return workingHours;
}
public void CalculateWages (int WagePerHour, int workingHours) 
{
	int totalSalary = ( WagePerHour * workingHours);
	System.out.println("Total Wages of the employee :");
	System.out.println (totalSalary);
}
public static void main(String[] args) {
	ComputationProblem emp = new ComputationProblem();
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the company Name :");
	emp.CompanyName=scan.nextLine();
	scan.nextLine();	
	System.out.println("Enter the Full Working hour :");
	emp.FullWorkingHour=scan.nextInt();
	System.out.println("Enter the half Working hour :");
	emp.HalfWorkingHour=scan.nextInt();
	System.out.println("Enter the Maximum working hour :");
	emp.MaxHours=scan.nextInt();
	System.out.println("Enter the Wage per hour :");
	emp.WagePerHour=scan.nextInt();
	System.out.println("Enter the total working days :");
	emp.TotalWorkingDays=scan.nextInt();	
	int totalworkinghours=emp.Attendance(emp.MaxHours,emp.TotalWorkingDays,emp.FullWorkingHour,emp.HalfWorkingHour);
	emp.CalculateWages(emp.WagePerHour,totalworkinghours);
	}
}
