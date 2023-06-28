//try, catch, finally, throws

import java.lang.*;
import java.util.*;

class Employee
{
	int emp_id;
	String emp_name;
	double emp_salary;
	
	Employee(int id, String name, double salary)
	{
		emp_id = id;
		emp_name = name;
		emp_salary = salary;
	}

	void display()
	{
		System.out.println("Employee ID: " + emp_id);
		System.out.println("Employee Name: " + emp_name);
		System.out.println("Employee Salary: " + emp_salary);
	}
}

class EmployeeDetails
{
	public static void main(String args[]) throws ArrayIndexOutOfBoundsException, NumberFormatException, InputMismatchException, NullPointerException
	{
		Employee[] emp = new Employee[5];
		Scanner s = new Scanner(System.in);
		
		int i, n;
		
		System.out.print("\nEnter the number of employees: ");
		n = s.nextInt();
		 
		try
		{
			for (i=0 ; i<n ; i++)
			{
				System.out.println("\nEnter the details of Employee " + (i+1) + ":");
				System.out.print("Enter the Employee ID: ");
				int id = s.nextInt();
				System.out.print("Enter the Employee Name: ");
				String name = s.next();
				System.out.print("Enter the Employee Salary: ");
				double salary = s.nextDouble();
				
				emp[i] = new Employee(id, name, salary);
			}	
		}		
				
		catch(Exception e)
		{
			System.out.println("\nThe following exception occured during execution,");
			System.out.println(e);
		}
		
		try
		{
			for (i=0 ; i<n ; i++)
			{
				System.out.println("\nThe details of the Employee " + (i+1) + ":");
				emp[i].display();
			}
		}

		catch(Exception e)
		{
			System.out.println("\nThe following exception occured during execution,");
			System.out.println(e);
		}
		
		finally
		{
			System.out.println("\nException Handling Program");
		}	
	}			
}				

	