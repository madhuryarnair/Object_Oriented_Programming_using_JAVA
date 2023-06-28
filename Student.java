//JDBC

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;

class CreateTable
{
	CreateTable()
	{
		Connection conn = null;
		Statement stmt = null; 
		ResultSet rs = null;
		
		try  
		{
			String userName = "root";
			String password = "root";
			String url = "jdbc:mysql://localhost:3306/swingsql";
			Class.forName ("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection (url, userName, password);
			stmt = conn.createStatement();
			
			//Creating table
			stmt.execute("create table Student(Name varchar(30), Gender varchar(10), Email_ID varchar(30), Course varchar(30), Quota varchar(30), DOB date, Blood_Group varchar(5), ERank varchar(10), Address varchar(50), Phone varchar(30))");  
		    System.out.println("Table Created");
			
		} 
		
		catch (SQLException ex)
		{
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}
		
		catch (Exception e)
		{
			System.err.println ("Cannot connect to database server");
		}
		
		finally 
		{
			if (rs != null) 
			{
				try 
				{
					rs.close();
				} 
				
				catch (SQLException sqlEx) {}
				
				rs = null;
			}
			
			if (stmt != null) 
			{
				try 
				{
					stmt.close();
				} 
				
				catch (SQLException sqlEx) {}
				
				stmt = null; 
			}
			
			if (conn != null) 
			{
				try 
				{
					conn.close ();
				} 
				
				catch (Exception e) { /* Ignore code for closing errors */ }
			}	   
		} 
	}
}

class Stud extends JFrame implements ActionListener
{
	JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
	JButton b;
	
	private Container c;
	
	Stud()
	{
		c=getContentPane();
		c.setBackground(Color.BLACK);

		
		l=new JLabel("STUDENT REGISTRATION");
		l.setBounds(100,0,600,100);
		l.setFont(new Font("Flix", Font.PLAIN, 34));
		l.setForeground(Color.ORANGE);
		
		l1=new JLabel("Name");
		l1.setBounds(40,120,200,25);
		l1.setFont(new Font("Arial", Font.PLAIN, 15));
		l1.setForeground(Color.ORANGE);
		
		t1=new JTextField();
		t1.setBounds(300,120,600,25);
		t1.setFont(new Font("Arial", Font.PLAIN, 15));

		l2=new JLabel("Gender");
		l2.setBounds(40,170,200,25);
		l2.setFont(new Font("Arial", Font.PLAIN, 15));
		l2.setForeground(Color.ORANGE);
		
		t10=new JTextField();
		t10.setBounds(300,170,600,25);
		t10.setFont(new Font("Arial", Font.PLAIN, 15));
		
		l3=new JLabel("Email id");
		l3.setBounds(40,220,200,25);
		l3.setFont(new Font("Arial", Font.PLAIN, 15));
		l3.setForeground(Color.ORANGE);
		
		t2=new JTextField();
		t2.setBounds(300,220,600,25);
		t2.setFont(new Font("Arial", Font.PLAIN, 15));
		
		l4=new JLabel("Course");
		l4.setBounds(40,270,200,25);
		l4.setFont(new Font("Arial", Font.PLAIN, 15));
		l4.setForeground(Color.ORANGE);
		
		
		t3=new JTextField();
		t3.setBounds(300,270,600,25);
		t3.setFont(new Font("Arial", Font.PLAIN, 15));
		
		l5=new JLabel("Quota");
		l5.setBounds(40,320,200,25);
		l5.setFont(new Font("Arial", Font.PLAIN, 15));
		l5.setForeground(Color.ORANGE);
		
		
		t4=new JTextField();
		t4.setBounds(300,320,600,25);
		t4.setFont(new Font("Arial", Font.PLAIN, 15));
		
		l6=new JLabel("D.O.B");
		l6.setBounds(40,370,200,25);
		l6.setFont(new Font("Arial", Font.PLAIN, 15));
		l6.setForeground(Color.ORANGE);
		
		
		t5=new JTextField();
		t5.setBounds(300,370,600,25);
		t5.setFont(new Font("Arial", Font.PLAIN, 15));
		
		l7=new JLabel("Blood Group");
		l7.setBounds(40,420,200,25);
		l7.setFont(new Font("Arial", Font.PLAIN, 15));
		l7.setForeground(Color.ORANGE);
		
		
		t6=new JTextField();
		t6.setBounds(300,420,600,25);
		t6.setFont(new Font("Arial", Font.PLAIN, 15));
		
		l8=new JLabel("Entrance Rank");
		l8.setBounds(40,470,200,25);
		l8.setFont(new Font("Arial", Font.PLAIN, 15));
		l8.setForeground(Color.ORANGE);
		
		
		t7=new JTextField();
		t7.setBounds(300,470,600,25);
		t7.setFont(new Font("Arial", Font.PLAIN, 15));
		
		l9=new JLabel("Address");
		l9.setBounds(40,520,200,25);
		l9.setFont(new Font("Arial", Font.PLAIN, 15));
		l9.setForeground(Color.ORANGE);
		
		t8=new JTextField();
		t8.setBounds(300,520,600,25);
		t8.setFont(new Font("Arial", Font.PLAIN, 15));
		
		l10=new JLabel("Phone");
		l10.setBounds(40,570,200,25);
		l10.setFont(new Font("Arial", Font.PLAIN, 15));
		l10.setForeground(Color.ORANGE);
		
		t9=new JTextField();
		t9.setBounds(300,570,600,25);
		t9.setFont(new Font("Arial", Font.PLAIN, 15));
		
		
		b=new JButton("Submit");
		b.setBounds(500,650,100,25);
		
		add(l);
		add(l1);
		add(t1);
		add(l2);
		add(t10);
		add(l3);
		add(t2);
		add(l4);
		add(t3);
		add(l5);
		add(t4);
		add(l6);
		add(t5);
		add(l7);
		add(t6);
		add(l8);
		add(t7);
		add(l9);
		add(t8);
		add(l10);
		add(t9);
		add(b);
		
		setSize(4000,4000);
		setLayout(null);
		setVisible(true);
		
		b.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String name=t1.getText();
		String email=t2.getText();
		String course=t3.getText();
		String quota=t4.getText();
		String dob=t5.getText();
		String bgrp=t6.getText();
		String rank=t7.getText();
		String addr=t8.getText();
		String ph=t9.getText();
		String gen=t10.getText();
		
		Connection conn = null;
		Statement stmt = null; 
		ResultSet rs = null;
		
		try
		{
			String userName = "root";
			String password = "root";
			String url = "jdbc:mysql://localhost:3306/swingsql";
			Class.forName ("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection (url, userName, password);                
			stmt = conn.createStatement();  
			
			String query = "INSERT INTO Student values('" + name + "','" + gen + "','" + email + "','" + course + "','" + quota + "','" + dob + "','" + bgrp + "','" + rank + "','" + addr + "','" + ph + "')";
            stmt.execute(query);
		} 
		
		catch (SQLException ex)
		{
			// handle any errors
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}
		
		catch (Exception e)
		{
			System.err.println ("Cannot connect to database server");
		}
		
		finally
		{
			if (rs != null) 
			{
				try 
				{
					rs.close();
				} 
				
				catch (SQLException sqlEx) { } // ignore
				
				rs = null;
			}
			
			if (stmt != null) 
			{
				try 
				{
					stmt.close();
				} 
				
				catch (SQLException sqlEx) { } // ignore
				
				stmt = null;
			}
			
			if (conn != null) 
			{
				try 
				{
					conn.close ();
				} 
				
				catch (Exception e) { /* ignore close errors */ }
			}
		}
	}
} 
	
class Delete
{
	Delete()
	{		
		Connection conn = null;
		Statement stmt = null; 
		ResultSet rs = null;

		try
		{
			String userName = "root";
			String password = "root";
			String url = "jdbc:mysql://localhost:3306/swingsql";
			Class.forName ("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection (url, userName, password);
			stmt = conn.createStatement();  
			stmt.execute("delete from Student where ERank>10");
		}	
		
		catch (SQLException ex)
		{
			// handle any errors
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}
		
		catch (Exception e)
		{
			System.err.println ("Cannot connect to database server:"+e);
		}
		
		finally 
		{
			if (rs != null) 
			{
				try 
				{
					rs.close();
				} 
				catch (SQLException sqlEx) { } // ignore
				
				rs = null;
			}
			
			if (stmt != null) 
			{
				try 
				{
					stmt.close();
				} 
				catch (SQLException sqlEx) { } // ignore
				
				stmt = null;
			}
			
			if (conn != null) 
			{
				try 
				{
					conn.close ();
				}
				catch (Exception e) { /* ignore close errors */ }
			}
		}
	}
}
		
class Select
{
	Select()
	{
		Connection conn = null;
		Statement stmt = null; 
		ResultSet rs = null;
		
		try
		{
			String userName = "root";
			String password = "root";
			String url = "jdbc:mysql://localhost:3306/swingsql";
			Class.forName ("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection (url, userName, password);
			stmt = conn.createStatement();  
			stmt.execute("SELECT * FROM Student");
			rs = stmt.getResultSet();
			System.out.println("\n\n -------  Full Registration Details  ---------\n");
			while (rs.next()) 
			{
				String NameString = rs.getString("Name");
				String GenderString = rs.getString("Gender");
				String EmailString = rs.getString("Email_ID");
				String CourseString = rs.getString("Course");	
				String QuotaString = rs.getString("Quota");
				String DOBString = rs.getString("DOB");
				String BGString = rs.getString("Blood_Group");
				String ERankString = rs.getString("ERank");
				String AddrString = rs.getString("Address");
				String PhString = rs.getString("Phone");
			
				System.out.println("Name: = "+NameString+"\t\t"+"Gender: = "+GenderString+"\t\t"+"Email_ID: = "+EmailString+"\t\t"+"Course: = "+CourseString+"\t\t"+"Quota: = "+QuotaString+"\t\t"+"D.O.B: = "+DOBString+"\t\t"+"Blood Group: = "+BGString+"\t\t"+"Entrance Rank: = "+ERankString+"\t\t"+"Address: = "+AddrString+"\t\t"+"Phone: = "+PhString+"\n");
			} //end while	
		}
		
		catch (SQLException ex)
		{
			// handle any errors
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}
		
		catch (Exception e) 
		{
			System.err.println ("Cannot connect to database server");
		}
		
		finally 
		{
			if (rs != null) 
			{
				try 
				{
					rs.close();
				} 
				catch (SQLException sqlEx) { } // ignore
				
				rs = null;
			}
			
			if (conn != null) 
			{
				try 
				{
					conn.close ();
				// System.out.println ("Database connection terminated");
				}
				catch (Exception e) 
				{ /* ignore close errors */ }
			}
		}
	}
}
	

class Student
{
	public static void main(String args[])
	{
		new CreateTable();
		
		Scanner s = new Scanner(System.in);
		int ch;
		
		do
		{
			System.out.println("\nMain Menu:");
			System.out.println("1: Insert Details");
			System.out.println("2: Delete Details");
			System.out.println("3: Display Details");
			System.out.println("4: Exit");
			
			System.out.print("Enter your choice: ");
			ch = s.nextInt();
			
			switch(ch)
			{
				case 1: 
						System.out.println("Enter DOB as YYYY-MM-DD");
						new Stud();
						break;
						
				case 2:
						System.out.println("Removing Students whose entrance rank is greater than 10");
						new Delete();
						break;
						
				case 3:
						new Select();
						break;
						
				case 4: 
						System.out.println("Exiting the menu");
						System.exit(0);
						break;
						
				default:
						System.out.println("Please Enter a valid choice");
					
			}	
		}
		while (ch != 4);
	}
}