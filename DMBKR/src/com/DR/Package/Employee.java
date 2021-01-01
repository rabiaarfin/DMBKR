package com.DR.Package;
/*
		 Write a program by creating an 'Employee' class having the following methods and print the final salary.
1 - 'getInfo()' which takes the salary, number of hours of work per day of employee as parameter
2 - 'AddSal()' which adds $10 to salary of the employee if it is less than $500.
3 - 'AddWork()' which adds $5 to salary of employee if the number of hours of work per day is more than 6 hours.
*/

public class Employee {
	static int sal;
	int hours;
	
	public  void getInfo(int salary, int numberOfHours) {
		sal=salary;
		hours=numberOfHours;
		AddSal();
		Addwork();
		System.out.println("The final salary is="+sal);
		
	}
	public void AddSal() {
		if (sal<500)
		{
			sal=sal+10;
		}

	}
	public void Addwork() {
		if(hours>6) {
			
			sal=sal+5;

		}
		
	}

	public static void main(String[] args) {
		Employee e=new Employee();
		e.getInfo(700, 10);
		e.getInfo(400, 5);
		
	}

}
