//Inheritance

class Employee
{
	
	String name, address;
	int age;
	long phone;
	float salary;
			
	void print_Salary()
	{
		System.out.println("Salary: "+salary);
	}
	
	void print()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Phone Number: "+phone);
		System.out.println("Address: "+address);
	}	
}

class Officer extends Employee
{
	String specialization;
	
	void print_Specialization()
	{
		System.out.println("Specialization: "+specialization);
	}	
}

class Manager extends Employee
{
	String department;
	
	void print_Department()
	{
		System.out.println("Department: "+department);
	}	
}

class Inheritance
{
	public static void main(String args[])
	{
		Officer o = new Officer();
		Manager m = new Manager();
			
		o.name = "Mohith";
		o.age = 23;		
		o.phone = 9563826539L;
		o.address = "\'Kavitha\', Nadakkave, Kozhikode";
		o.salary = 25000;
		o.specialization = "Programming";
			
		m.name = "Abhishek";
		m.age = 24;
		m.phone = 8467392749L;
		m.address = "\'Maanas\', Eranhipaalam, Kozhikode";
		m.salary = 26000;
		m.department = "Finance";
			
		System.out.println("\nThe details of the Officer is,");
		o.print();
		o.print_Salary();
		o.print_Specialization();

		System.out.println("\nThe details of the Manager is,");
		m.print();
		m.print_Salary();
		m.print_Department();
	}
}		
			
	
				